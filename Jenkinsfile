pipeline
{
    agent any

    stages
    {

     stage('MavenBuild') {
                agent {
                    docker {
                        image 'maven:latest'
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