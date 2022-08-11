
pipeline{

	agent any

	environment {
		DOCKERHUB_CREDENTIALS=credentials('bereszit-dockerhub')
		echo "password: $DOCKERHUB_CREDENTIALS_PSW     login: $DOCKERHUB_CREDENTIALS_USR"
	}
	
	stages {
		
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
		}
	}  	
}
