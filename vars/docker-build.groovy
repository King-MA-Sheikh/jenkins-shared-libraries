def call(String ProjectName, String ImageTag, String DockerHubuser) {
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
