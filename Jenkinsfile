pipeline
{
    agent any

    stages
    {

     stage('MavenBuild') {
                agent {
                    docker {
                        image 'maven:latest'
                        //args '-u root'
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
        stage ('Test'){

        agent {
           docker {
                image 'maven:latest'
                args '-u root'
                }
           }

            steps {
            sh'''
                echo "Test run"
                mvn test
                echo "Test run End"
               '''
            }
        }

    }

     post {
          always {
          junit '**/target/surefire-reports/*.xml'
          }
    }

}