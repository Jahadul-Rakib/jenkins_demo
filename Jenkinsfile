pipeline {
    agent any
    environment {
        STAGE = "UTG"
    }

    stages {
        stage('Build') {
            steps {
                echo 'shell script.....${STAGE}'
            }
        }
        stage('Deploy') {
            steps {
                sh 'pwd'
            }
            steps {
                sh 'ls'
            }
            steps {
                sh 'ls -a'
            }
        }
    }
}
