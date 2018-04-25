node {
    stage("update"){
        git 'https://github.com/ricardodamasceno/spring-boot.git'
    }
    stage("build"){
        sh 'mvn clean install'
    }
    stage("archive"){
        archiveArtifacts 'target/*.jar'
    }
}
