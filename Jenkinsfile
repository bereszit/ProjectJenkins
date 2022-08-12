
pipeline{

	agent {
		docker { image 'docker:22.06-rc-cli'}
	}
	
	stages {
		stage('Test') {
			steps {
				sh 'node --version'
			}
		}
	}

	/*environment {
		DOCKERHUB_CREDENTIALS=credentials('bereszit-dockerhub')
		JENKINS=credentials('jenkins')
	}
	
	stages {
		
		stage('Build') {

			steps {
				sh 'printf "$JENKINS_PSW\n" | sudo -S docker build -t bereszit/project-jenkins:latest .'
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
		}
	} */ 	
}
