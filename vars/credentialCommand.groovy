def call(String credentialId) {
  withCredentials([usernamePassword(credentialsId: credentialId, passwordVariable: 'userPass', usernameVariable: 'userName')]) {
    sh "User is $userName"
    sh "Pass is $userPass"
  }
  sh "Command outside the credentials block. Password: $userPass"
  sh "hostname"
}