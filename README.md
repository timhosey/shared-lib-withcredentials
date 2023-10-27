# shared-lib-withcredentials

This is an example of a [Shared Library](https://www.jenkins.io/doc/book/pipeline/shared-libraries/) using withCredentials to remove the ability of pipeline owners to tinker with and exploit withCredentials requests.

Usage:
* Add this Shared Lib to either the Global Libs or the Folder Libs
* Add a credential for invoking to the folder or global level (username/password for this example)
* Reference the library with `@Library('shared-lib-name') _` at the top of the pipeline
* Use `credentialCommand('credentialId')` in a `script{}` block in your pipeline (Declarative) to test.