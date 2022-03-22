DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to run simple "Hello World" Java Spring Boot application with template Thymeleaf using Kuberneties tool.

##### Details
Details:
* Example application will be builded and started by Kuberneties tool. More information about this tool you can find here: https://docs.google.com/document/d/1jOsK3Lkbkoq-Xx7Ln9o_ozCt6XpcSElOwu1o2AfQnNc/edit?usp=sharing
* Example application will display on browser simple page with text: "Hello World";


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed Java
* Installed Maven
* Installed Git
* Installed Docker with Kuberneties

##### Preconditions - Actions
* **Download Source Code**: please open any command line tool on **target** folder (where project should be downloaded) and type following command there: **git clone https://github.com/wisniewskikr/java-springboot.git**
* **Started Docker tool**: please run Docker with Kuberneties tool before you go to "Usage" section


USAGE
-----

Usage steps:

1. Create local registry
2. Build package
3. Build image
4. Tag the Docker image
5. Push Docker image to local registry
6. Deploy application to Kuberneties
7. Display page
8. Clean up

##### Ad 1\ Create local registry

Please open any command line tool on **root** folder of this project and type following command there:
* **docker run -d -p 5000:5000 --restart=always --name registry-container registry:2**

##### Ad 2\ Build package

Please open any command line tool on **root** folder of this project and type following command there:
* **mvn clean package**

##### Ad 3\ Build image

Please type following command in opened command line tool:
* **docker build -t greeting-image .**

##### Ad 4\ Tag the Docker image

Please type following command in opened command line tool:
* **docker tag greeting-image localhost:5000/greeting-image**

##### Ad 5\ Push Docker image to local registry

Please type following command in opened command line tool:
* **docker push localhost:5000/greeting-image**

##### Ad 6\ Deploy application to Kuberneties

Please type following command in opened command line tool:
* **kubectl apply -f deployment.yml**

##### Ad 7\ Display page

Please open any **browser** and type following URL there:
* **http://localhost:31000**

##### Ad 8\ Clean up

Please type following command in opened command line tool:
* **kubectl delete service greeting-service**
* **kubectl delete deployment greeting-deployment**
* **docker stop registry-container**
* **docker rm registry-container**
* **docker rmi localhost:5000/greeting-image**
* **docker rmi greeting-image**
* **docker rmi registry:2**