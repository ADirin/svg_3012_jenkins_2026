pipeline {
    agent any
    stages {
        stage('Check') {
            steps {
                echo 'In this phase we check the git and get access to GitHub'
            }
        }
        stage('Build') {
            steps {
                echo 'We build, for example mvn build'
            }
        }
        stage('Install') {
            steps {
                echo 'We install, for example print the JaCoCo report'
            }
        }
        stage('Surefire') {
            steps {
                echo 'Print XML file of the test'
            }
        }
    }
}