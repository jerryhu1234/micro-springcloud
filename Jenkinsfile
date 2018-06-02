pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'sh \'/var/apache-maven-3.5.3/mvn -B -DskipTests clean package\''
      }
    }
  }
}