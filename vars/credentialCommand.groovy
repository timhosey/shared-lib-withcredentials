def call(String credentialId) {
  withCredentials([usernamePassword(credentialsId: credentialId, passwordVariable: 'userPass', usernameVariable: 'userName')]) {
    sh "echo User is $userName"
    sh "echo Pass is $userPass"
  }
  sh "echo Command outside the credentials block. Password: $userPass"
  sh "hostname"
}