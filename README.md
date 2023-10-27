# shared-lib-withcredentials

This is an example of a Shared Library using withCredentials to remove the ability of pipeline owners to tinker with and exploit withCredentials requests.

Usage:
* Add this Shared Lib to either the Global Libs or the Folder Libs
* Reference the library with `@Library('shared-lib-name') _` at the top of the pipeline
* Use `credentialCommand('credentialId')` in a `script{}` block in your pipeline (Declarative) to test.