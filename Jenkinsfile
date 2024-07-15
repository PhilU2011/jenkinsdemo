pipeline
{
    agent any

    stages
    {

     stage('DockerBuild') {

            steps {
           // sh 'docker build -t mavenfile .'
            sh 'echo "Start Jenkins"'
                }
            }

      stage('MavenBuild') {
                      agent {
                          docker {
                              image 'mavenfile'
                              args '-u root'
                          }
                      }

                  steps {
                  sh 'echo "Application Build start"'
                  sh '''
                      mvn --version
                      echo "Spring Boot Start"
                      mvn clean install
                  '''
                      }
                  }
      }
 }
