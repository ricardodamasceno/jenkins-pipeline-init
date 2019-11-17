node {
    stage("update"){
        git (
            url: 'https://github.com/ricardodamasceno/spring-boot.git',
            credentialsId: 'github-personal'
            )
    }
    stage("build"){
        sh 'mvn clean install'
    }
    stage("archive"){
        archiveArtifacts 'target/*.jar'
    }
}
