pipeline
{
    agent any

    stages
    {

     stage('Docker') {

            steps {

                    sh 'docker build -t mavenfile .'
                    sh 'echo "Application Build start"'
                    }
        }
      stage ('MavenBuild')  {

            steps {
                  sh '''
                            mvn --version
                            echo "Spring Boot Start"
                            mvn clean install
                        '''
                }
      }

    }

}