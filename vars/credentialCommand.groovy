def call(String credentialId) {
  withCredentials([usernamePassword(credentialsId: credentialId, passwordVariable: 'userPass', usernameVariable: 'userName')]) {
    sh 'echo userName is $userName'
    sh 'echo userPass is $userPass'
  }
  echo 'Attempting to use userPass variable outside of withCredentials...'
  sh '''
    if [ -n "$userPass" ]; then
      echo "userPass var is defined: $userPass"
    else
      echo "userPass is not defined!"
    fi
  '''
  sh 'env'
}