pipeline
{
    agent any

    stages
    {

     stage('MavenBuild') {
                agent {
                    docker {
                        //E2E Playwright Test Image
                        image 'mcr.microsoft.com/playwright:v1.39.0-jammy'
                        //image 'maven:latest'
                        // args '-u root'
                        }
                    }
                    //agent {
                    //docker {
                    //    image 'maven:latest'
                    //    args '-u root'
                    //    }
               // }

            steps {
            sh 'echo "Application Build start"'
            sh '''

                echo "Spring Boot Start"


            '''
            }
        }

    }
}
