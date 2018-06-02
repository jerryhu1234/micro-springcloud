pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''sh \'cd var/apache-maven-3.5.3/bin/\'
sh \'./mvn -B -DskipTests clean package\''''
      }
    }
  }
}