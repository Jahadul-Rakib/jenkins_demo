pipeline{
    agent any
    tools {
        maven "M3"
    }
    stages {
            stage ('Build') {
                steps {
                        sh 'ls'
//                         sh 'mvn -f pom.xml clean package -DskipTests -U -e'
//                         sh 'java -jar /target/*.jar'
                }
            }
    }
}
