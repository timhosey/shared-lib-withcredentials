def call(String credentialId) {
  withCredentials([usernamePassword(credentialsId: credentialId, passwordVariable: 'userPass', usernameVariable: 'userName')]) {
    sh "echo User is $userName"
    sh "echo Pass is $userPass"
  }
  echo "Trying to use the userPass variable outside withCredentials will fail the build."
  sh "env"
}