pipeline
{
    agent any

    stages
    {

     stage('MavenBuildDocker') {

            steps {
            sh 'docker build -t mavenfile .'
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