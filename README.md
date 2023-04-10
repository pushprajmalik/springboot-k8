
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

 brew services start jenkins-lts
```

Install Minikube in mac

1. Install kubectl
```bash
  brew install kubectl
```

2. Check kubectl version
```bash
  kubectl version
```

3. Install hyperkit
```bash
  brew install hyperkit
```

4. Verify that you installed kubectl & HyperKit
```bash
  brew list
```

5. Install Minikube on macOS
```bash
  brew install minikube
```

6. Verify minikube version
```bash
  minikube version
```

7. Start minikube server
```bash
  minikube start
```

8. Check minikube server running status
```bash
  minikube status
```

Install & Run Docker in Mac

```bash
 https://docs.docker.com/desktop/install/mac-install/
```

## Configure kubernetes to pull image from private repo



1. Log in to Docker Hub
```bash
 docker login
```

2. View the config.json file
 ```bash
 cat ~/.docker/config.json
 ```
 
3. Create a Secret based on existing credentials
 ```bash
  kubectl create secret generic regcred \
    --from-file=.dockerconfigjson=<path/to/.docker/config.json> \
    --type=kubernetes.io/dockerconfigjson
 ```

4. (Optional)Create a Secret by providing credentials on the command line   
 ```bash
    kubectl create secret docker-registry regcred --docker-server=<your-registry-server> --docker-username=<your-name> --docker-password=<your-pword> --docker-email=<your-email>
 ```

5. Inspecting the Secret regcred  
 ```bash
 kubectl get secret regcred --output=yaml
 ```
 
6. refer to doployment.yaml to see how secret is used



## Configure required setup for Jenkins

start jenkins server if not running
```bash
 brew services start jenkins-lts  
 Note: open localhost:8080 
```

install & enable Ansible plugin
```bash
Ansible plugin 
```

install & enable Docker plugins
```bash
CloudBees Docker Build and Publish plugin
Docker Pipeline
Docker plugin 
docker-build-step
Note: Please refer to setup docker with Jenkins for mac

[setup docker with Jenkins on mac]
(https://harshityadav95.medium.com/how-to-setup-docker-in-jenkins-on-mac-c45fe02f91c5/)
```

install & enable Maven plugins
```bash
Maven Integration plugin
```

Global Tool Configuration
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

get kubernetes deployments
```bash
 kubectl get deployments
``` 

kubernetes pods
 ```bash
 kubectl get pods
 ``` 

check log on pods
 ```bash
 kubectl logs pod_name
 ``` 

get nodes
 ```bash
 kubectl get nodes
 ``` 

get kubernetes service
 ```bash
 kubectl get service
 ``` 

get service url 
 ```bash
 minikube service 'name_of_service'  --url
 ```
