pipeline
{
    agent any
    tools {maven 'Maven 3.3.1'}
    stages
    {
        stage('Build'){
            steps {
            sh 'echo "Application Build start"'
            sh '''
                mvn --version
            '''

            }
        }

    }

}