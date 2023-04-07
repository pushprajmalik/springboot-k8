
## Pre-requestics

Install openjdk@8 using brew


```bash
  brew search openjdk 

  brew install openjdk@8

  java -version
```

Install Maven using brew


```bash
  brew install maven
```
Install Ansible using brew


```bash
  brew install ansible
```

Install Jenkins in mac
```bash
 // Install the latest LTS version
 brew install jenkins-lts

 // Start the Jenkins service
 brew services start jenkins-lts
```

Install Minikube in mac

```bash
  // Install kubectl
  brew install kubectl

  // Check kubectl version
  kubectl version

  // Install hyperkit
  brew install hyperkit

  // Verify that you installed kubectl & HyperKit
  brew list

  // Install Minikube on macOS
  brew install minikube

  // Verify minikube version
  minikube version

  // Start minikube server
  minikube start

  // Check minikube server running status
  minikube status
```

Install & Run Docker in Mac

```bash
 https://docs.docker.com/desktop/install/mac-install/
```

## Configure required setup for Jenkins

Start Jenkins
```bash
 // Start jenkin server if not running
 brew services start jenkins-lts  

 open localhost:8080 

 Note: install all default plugins

```
Goto : Manage Jenkins > Plugins

```bash
// Install & enable Ansible plugin
Ansible plugin 
```



```bash
// Install & enable Docker plugins
CloudBees Docker Build and Publish plugin
Docker Pipeline
Docker plugin 
docker-build-step

Note: Please refer to setup docker with Jenkins for mac

[setup docker with Jenkins for mac]
(https://harshityadav95.medium.com/how-to-setup-docker-in-jenkins-on-mac-c45fe02f91c5/)
```

```bash
// Install & enable Maven plugins
Maven Integration plugin
```
Goto Manage Jenkins > Global Tool Configuration
```bash
Setup JDK, Maven, Ansible, Docker

```

## Create CI-CD using Jenkins

1. create a new item with name (pipeline)

2. under general
select 'GitHub project'
https://github.com/vikramsisodia27/springboot-k8/

3. Build Trigger
select 'GitHub hook trigger for GITScm polling'

4. pipeline
Refer code repo and copy jenkinsfile 

5. save and build now

## Access application in kubernetes

```bash
 // get kubernetes deployments
 kubectl get deployments
 
 // kubernetes pods
 kubectl get pods
 
 // check log on pods
 kubectl logs pod_name
 
 // get nodes
 kubectl get nodes
 
 // get kubernetes service
 kubectl get service
 
 // get service url 
 minikube service 'name_of_service'  --url

 
 
```
