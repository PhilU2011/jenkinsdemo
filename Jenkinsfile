pipeline
{
    agent any

    stages
    {

        stage ('Test'){

        agent {
           docker {
                image 'maven:latest'
                args '-v $HOME/.m2:/root/.m2'
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