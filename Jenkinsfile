
pipeline{

	agent {label 'main'}

	environment {
		DOCKERHUB_CREDENTIALS=credentials('bereszit-dockerhub')
		LOGOUT = sh('docker logout')
	}

	stages {

		stage('Build') {

			steps {
				sh 'docker build -t bereszit/ProjectJenkins:latest .'
			}
		}

		stage('Login') {

			steps {
				sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
			}
		}

		stage('Push') {

			steps {
				sh 'docker push bereszit/ProjectJenkins:latest'
			}
		}
		
	}
	

	post {
		always {
			steps {
				$LOGOUT
			}
		}
        }
        
}

