pipeline
{
    agent any

    stages
    {

     stage('MavenBuild') {
                agent {
                    docker {
                        image 'maven:latest'
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
        stage ('Test'){

        agent {
           docker {
                image 'maven:latest'
                args '-u root'
                }
           }

            steps {
            timeout(time: 1, unit: 'MINUTES')
                            { //1 Minute TimeOut
                             input message: 'Ready for deployment?', ok: 'Yes, I wanna deploy'
                            }
            sh'''
                echo "Test run"
                mvn test
                echo "Test run End"
               '''
            }

            post {
                      always {
                      junit '**/target/surefire-reports/*.xml'
                      }
                }

        }

    }

}