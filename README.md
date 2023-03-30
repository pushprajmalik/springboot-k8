
# Project Title

CI CD pipeline for spring boot project for mac OS using jenkins, maven, ansible, docker & kubernetes



## Authors

- [Vikram Sisodia](https://www.github.com/vikramsisodia27)


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
 brew install jenkins-lts
```

Install Minikube in mac

```bash
  https://medium.com/@javatechie/kubernetes-tutorial-install-run-minikube-in-mac-os-k8s-cluster-369b25b0c3f0
```

Install & Run Docker in Mac

```bash
 https://docs.docker.com/desktop/install/mac-install/
```

## Configure required setup for Jenkins

Start Jenkins
```bash
 brew services start jenkins-lts  

 open localhost:8080 

 Note: install all default plugins

```
find, install & enable required Ansible plugin

```bash
Ansible plugin 
```

find, install & enable required docker plugin

```bash
CloudBees Docker Build and Publish plugin
Docker Pipeline
Docker plugin 
docker-build-step

Note: Please refer to setup docker with Jenkins for mac
https://harshityadav95.medium.com/how-to-setup-docker-in-jenkins-on-mac-c45fe02f91c5
```
find, install & enable Maven  plugin

```bash
Maven Integration plugin
```
Goto Manage Jenkins>Global Tool Configuration
```bash
Setup JDK, Maven, Ansible, Docker

```

## Create CI-CD using Jenkins
