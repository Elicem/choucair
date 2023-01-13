pipeline {
    agent any
    stages {
        stage('Clonar repositorio') {
            steps {
                git 'https://github.com/tu-usuario/tu-proyecto.git'
            }
        }
        stage('Compilación') {
            steps {
                sh './gradlew build'
            }
        }
        stage('Ejecutar pruebas') {
            steps {
                sh './gradlew test --tests tu.paquete.de.pruebas.TestScreenplay'
            }
        }
    }
    post {
        always {
            junit 'build/test-results/*/.xml'
        }
    }
}