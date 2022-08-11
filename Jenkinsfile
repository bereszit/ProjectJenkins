
pipeline{

	agent any

	environment {
		DOCKERHUB_CREDENTIALS=credentials('bereszit-dockerhub')
	}
	
	stages {
		

		stage('Build') {
			agent any

			steps {
				script {
					try {
    				    		sh 'docker build -t bereszit/ProjectJenkins:latest .'
					} 
					catch (err) {
						echo "Caught: ${err}"
        					currentBuild.result = 'FAILURE'
    					}
				}
    			}
		}

		/*stage('Login') {

			steps {
				sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
			}
		}

		stage('Push') {

			steps {
				sh 'docker push bereszit/ProjectJenkins:latest'
			}
		}*/
		
	}  	
}

