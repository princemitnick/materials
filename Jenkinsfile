pipeline{
	agent any
	environment {
		SERVER="172.25.102.53"
	}
	stages {
		stage('Build') {
		    steps {
		        echo 'Running build automation'
            	sh 'mvn clean install'
            	archiveArtifacts artifacts: 'target/materials-0.1.jar'
		    }
		}

		stage('Build Docker Image') {
			steps {
				script {
					app = docker.build('princemitnick/materials')
					//app.inside {
					//	sh 'echo ${curl localhost:8080}'
					//}
				}
			}
		}
		stage('Push Docker Image'){
			steps {
				script {
					docker.withRegistry('https://registry.hub.docker.com', 'docker_hub_login') {
						//app.push("${env.BUILD_NUMBER}")
						app.push("latest")
					}
				}
			}
		}
	}
}