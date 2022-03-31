DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to use external configuration file in simple "Hello World" Java Spring Boot application using Docker tool.


##### Details
* External configuration means that configuration file is not included in application. It's very flexible solution because developer can very easly update configuration files
* This example application just displays text: "Hello World". This text is stored in `application.properties` file. But this file is not in resources so Spring Boot does not see it by default. You have to mount it using Docker `volume` attribute 
* More information about Docker tool you can find here: `https://docs.google.com/document/d/1tKdfZIrNhTNWjlWcqUkg4lteI91EhBvaj6VDrhpnCnk/edit?usp=sharing`


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed Java
* Installed Maven
* Installed Git
* Installed Docker

##### Preconditions - Actions
* Download Source Code with `git clone https://github.com/wisniewskikr/java-springboot.git`
* Launch Docker tool on your local machine


USAGE
-----

Usage steps:

1. Create local registry with `docker run -d -p 5000:5000 --restart=always --name registry-container registry:2`
2. Build package with `mvn clean package`
3. Build image with `docker build -t greeting-image .`
4. Tag the Docker image with `docker tag greeting-image localhost:5000/greeting-image`
5. Push Docker image to local registry with `docker push localhost:5000/greeting-image`
6. Deploy configmap to Kubernetes with `kubectl apply -f configmap.yml`
7. Deploy application to Kubernetes with `kubectl apply -f deployment.yml`
8. Visit `http://localhost:31000`
9. Clean up environment:

    * Delete Kubernetes service with `kubectl delete service greeting-service`
    * Delete Kubernetes deployment with `kubectl delete deployment greeting-deployment`
    * Delete Kubernetes configmap with `kubectl delete configmap greeting-configmap`
    * Stop registry with `docker stop registry-container`
    * Remove registry with `docker rm registry-container`
    * Remove tagged image with `docker rmi localhost:5000/greeting-image`
    * Remove image with `docker rmi greeting-image`
    * Remove registry image with `docker rmi registry:2`