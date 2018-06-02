pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
      args '-v /root/.m2:/root/.m2'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh '''sh \'cd /var/apache-maven-3.5.3/bin/\'
sh \'./mvn -B -DskipTests clean package\''''
      }
    }
  }
}