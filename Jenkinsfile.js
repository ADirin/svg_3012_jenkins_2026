pipeline {
    agent any
    stages {
        stage('Check') {
            steps {
                git 'https://github.com/ADirin/svg_3012_jenkins_2026.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('code coverage') {
            steps {
                bat 'mvn jacoco:report'
            }
        }
        stage('Test Results'){
            steps{
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }
}