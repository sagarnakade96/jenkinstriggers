pipeline {
    agent any
    stages('Build') {
        steps {
                sh 'echo "Build Started..."'
                sh 'echo "time remaining: 3s"'
                sh 'echo "time remaining: 2s"'
                sh 'echo "time remaining: 1s"'
                sh 'echo "Build Completed"'
        }
    }
}
