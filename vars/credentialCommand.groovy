def call(String credentialId) {
  withCredentials([usernamePassword(credentialsId: credentialId, passwordVariable: 'userPass', usernameVariable: 'userName')]) {
    sh "echo User is $userName"
    sh "echo Pass is $userPass"
  }
  sh """
  if [ -n \"$userPass\" ]; then
    echo "userPass defined: $userPass"
  else
    echo "userPass not defined"
  fi
  """
  sh "hostname"
}