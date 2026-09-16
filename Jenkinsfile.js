pipeline{
    agent any
    stages {
        stage('check'){
            echo 'in this phase we check the git and get access to github'
        }
        stage ('build'){
            echo 'we build for example mvn build'
        }
        stage ('install') {
            echo 'we install for example print the jacoco'
        }
        stage ('surfire') {
            echo 'print xml file of the test'
        }

    }


}