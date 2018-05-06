pipeline {
    agent { 
        docker { 
            image 'maven:3.3.3' 
        } 
    }
    stages {
        stage('build') {
            steps {
                sh 'echo "RUN: mvn compile..."'
                sh 'mvn compile'
            }
        }
        stage('test') {
            steps {
                sh 'echo "RUN: mvn test..."'
                sh 'mvn test'
            }
        }
        stage('packag') {
            steps {
                sh 'echo "RUN: mvn package..."'
                sh 'mvn package'
            }
        }

    }
}