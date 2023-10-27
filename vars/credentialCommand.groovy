def call(String credentialId) {
  withCredentials([usernamePassword(credentialsId: '', passwordVariable: 'userPass', usernameVariable: 'userName')]) {
    sh "User is $userName"
    sh "Pass is $userPass"
  }
  sh "Command outside the credentials. Password: $userPass"
  sh "hostname"
}