// Load mplat-openshift-pipeline Shared Library
library identifier: 'openshift-pipeline@master', retriever: modernSCM([$class: 'GitSCMSource',
   remote: 'https://github.com/domenicbove/openshift-pipeline.git']) _

mainPipeline {
    gitRepoUrl = "https://bitbucket.mfoundry.net/scm/~jordan.sztanyo/mbank-zelle.git"
    microserviceSubmodule = "mbank-zelle-service"
    templateFileName = "mplat-dsm-deploy-template.yml"
    templateGitTag = "master"
    hipchatRooms = "Openshift-testjenkinsalerts"
    microservice = "mbank-zelle"
    mavenCredentialsId = "SRV_JENKINS_REPO_RO"
    fortifyCredentialsId ="SRV_FORTIFY_SCC"
    artifactoryCredentialsId = "32909818-7980-4ad3-bd37-65868e55cb84"
    artifactoryRepoBaseURL = 'https://repository.fismobile.com/artifactory'
    artifactoryRepoName = 'mobile-archives-1'
    runStressTests = false
}
