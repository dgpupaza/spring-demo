pipeline {
  agent any
  stages {
    stage('SonarQube analysis') {
      steps {
        withSonarQubeEnv('SonarQube') {
          sh 'mvn clean package sonar:sonar'
        }

      }
    }

    stage('Quality Gate') {
      steps {
        timeout(time: 12, unit: 'MINUTES') {
          waitForQualityGate true
        }

      }
    }

  }
  environment {
    maven = '\'Maven 3.6.3\''
  }
}