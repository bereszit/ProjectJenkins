
pipeline{

	/*agent {
		docker { image 'docker:22.06-rc-cli'}
	}
	
	stages {
		stage('Test') {
			steps {
				sh 'node --version'
			}
		}
	}*/
	agent any

	environment {
		DOCKERHUB_CREDENTIALS=credentials('bereszit-dockerhub')
		//JENKINS=credentials('jenkins')
	}
	
	stages {
		stage {
			steps {sh 'kubectl get pods -n fw-prod'}
		}
		/*stage ('Test') {
			steps { sh 'sbt test'}
		}
		
		stage('Build') {

			steps {
				sh 'docker build -t bereszit/project-jenkins:latest .'
			} 
		}

		stage('Login') {

			steps {
				sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
			}
		}

		stage('Push') {

			steps {
				sh 'docker push bereszit/project-jenkins:latest'
			}
		}*/
	} 	
}
