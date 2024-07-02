pipeline
{
    agent any

    stages
    {

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
                post {
                         always {
                         junit '**/target/surefire-reports/*.xml'
                         }
                   }
        }

    }

}