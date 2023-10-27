def call(String credentialId) {
  withCredentials([usernamePassword(credentialsId: credentialId, passwordVariable: 'userPass', usernameVariable: 'userName')]) {
    sh "echo User is $userName"
    sh "echo Pass is $userPass"
  }
  sh "if [ -z ${userPass} ]; then echo \"var is unset\"; else echo \"var is set to '$var'\"; fi"
  sh "hostname"
}