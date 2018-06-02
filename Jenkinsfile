pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'sh \'/var/apache-maven-3.5.3/bin/mvn -B -DskipTests clean package\''
      }
    }
  }
}