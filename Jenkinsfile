pipeline{
    agent any
    stages {
            stage ('Build') {
                steps {
                        echo 'Running build phase...'
                        sh 'pwd'
                        sh 'ls'
                        sh 'mvn -f pom.xml clean package -DskipTests -U -e'
                        sh 'java -jar /target/*.jar'
                }
            }
    }
}
