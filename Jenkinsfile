
version="1.0.0"
registry="flowworks-carlsolutions.azurecr.io"
repository="${registry}/buildkittest/test1"
tag="latest"
image="${repository}:${version}.${env.BUILD_NUMBER}"
namespace="demo"

podTemplate(label: 'demo-app', cloud: 'kubernetes', serviceAccount: 'jk-sa',
  containers: [
    containerTemplate(name: 'buildkit', image: 'moby/buildkit:master', ttyEnabled: true, privileged: true),
  ],
  /*volumes: [
    secretVolume(secretName: 'docker-config-json', mountPath: '/root/.docker-temp')
  ]*/) {
    node('demo-app') {

        stage('Prepare') {
            sh "uname -a"
        }

        stage('Checkout Repository') {
          checkout([
          $class: 'GitSCM', branches: [[name: '*/master']],
          userRemoteConfigs: [[url: 'git@github.com:bereszit/ProjectJenkins.git',credentialsId:'bereszit-github']]
          ])
          milestone(1)
        }

        /*stage('Build Docker Image') {
          container('buildkit') {
            sh "buildctl --version"
            sh "mkdir ~/.docker"
            sh "cp ~/.docker-temp/.dockerconfigjson ~/.docker/config.json"
            sh """
              buildctl build --frontend dockerfile.v0 --local context=. \
                --local dockerfile=. \
                --output type=image,name=${image},push=true
              buildctl build --frontend dockerfile.v0 --local context=. \
                --local dockerfile=. \
                --output type=image,name=${repository}:${tag},push=true
            """
            milestone(2)
          }
        }*/

    }
}

properties([[
    $class: 'BuildDiscarderProperty',
    strategy: [
        $class: 'LogRotator',
        artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '10']
    ]
]);
