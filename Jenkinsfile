pipeline {
    agent any
    environment {
        STAGE = "UTG"
    }

    stages {
        stage('Build') {
            steps {
                sh 'echo ${STAGE}'
            }
        }
        stage('Deployment') {
            steps {
                sh 'pwd'
            }
            steps {
                sh 'ls'
            }
        }
    }
}
