# What's jenkins?

it's an open source automization tool, it,s usually use to CI (Continous integration) and CD

* Automization server\
* it manage:
  * Compilation of code
  * Execution of autoatization test
  * Automatics Deploys -> test or deploys ambients
  * monitor development procces
* Compatible with a lot of technologies

# CI, CD Concepts

* # CI(Contuinous integration):


  * Consists in integrate the code in a shared repository
* Example:
* app web -> a dev up changes  to github -> Jenkins detects the changes and executes sometthing automaticc (Compilation, Unitary tests, integration tests) -> if all OK it integrate to main branch
* PIPELINE
* # CD (Continous Delivery)
* Software deployment in test or production environments.

  * Launch new versions
  * Reduce the launch time
  * Improve the software estability and quality
* PIPELINE

# Advantages

* Open source
* Extensible with plugins
* Automatization of life time
* Compatible with a lot of technologies
* Easy configureration
* Containers support and kubernetes
* Active community

# What's a Job on Jenkins?

* It' an automatic homework -> Jenkins Server

  * a job can compilate
  * Execute tests
  * Deploys
  * o another more process
* There are several types of jobsn

  * Freestyle project -> the most easiest and basic job
  * Pipelion -> used for the flows of CI, CD -> Most Avanced
  * Multibranch Pipeline -> usde for multi branchs or proyects on git
  * Maven Project -> Used for maven projects (JAVA)\

# What's a Build?

* It'a an execution of a job
* Each execution generate a build
  * Get source code
  * Execeute step by step we definite
  * Registre the console output
  * Save the artefacts(Optional)
  * Show the final result in the UI

# Automatic Triggers

* Polling SCM -> checks periodic if someone up a change in repo
* WebHook -> The job is triggered when there is a change in the code.
* Programation cron -> Execeutes en time intervals
* triggered by another job -> Its trigerrede when another job send de signal

# Plugins

Are a lot of extensions where improvement to large extent jenkins

* Essencial plugins
  * Git plugin
  * Maven integration
  * Email extension plugin

# Environment Variables

ENV of Jenkins

* BUILD_NUMBER: numbar of actual build
* JOB_NAME: Name of job you are using
* WORKSPACE: DIR where jenkisnms store dara od the job
* GIT_COMMIT: Hash of commit

# Tests automatization

* Whe can integrate jenkins with this technologies:
  * JUnit
  * Selenium
  * Pytest

# Pipelines

* set of stages that say to we how is it goign to build and deploy our app
* Why use it?
  * Automatic desde compilation until deploy
  * Ww use a jenkinsfile
  * multiple agents and nodes
* Types:
* | Declarative     | Scripted                   |
  | --------------- | -------------------------- |
  | Easy            | Based on groovy            |
  | Easy way to use | more flexible and powerful |
  | pipeline{}      | node{}                     |
  | estadnar config | Advanced                   |
