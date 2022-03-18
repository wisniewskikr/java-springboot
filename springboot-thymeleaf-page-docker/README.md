DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to run simple "Hello World" Java Spring Boot application with template Thymeleaf using Docker tool.

##### Details
Details:
* Example application will be builded and started by Docker tool. More information about this tool you can find here: https://docs.google.com/document/d/1tKdfZIrNhTNWjlWcqUkg4lteI91EhBvaj6VDrhpnCnk/edit?usp=sharing
* Example application will display on browser simple page with text: "Hello World"; 


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed Java
* Installed Maven
* Installed Git
* Installed Docker

##### Preconditions - Actions
* **Download Source Code**: please open any command line tool on **target** folder (where project should be downloaded) and type following command there: **git clone https://github.com/wisniewskikr/java-springboot.git**
* **Started Docker tool**: please run Docker tool before you go to "Usage" section


USAGE
-----

Usage steps:
1. Build package
2. Build image
3. Build and start container
4. Display page
5. Stop container
6. Remove container
7. Remove image

##### Ad 1\ Build package

Please open any command line tool on **root** folder of this project and type following command there: 
* **mvn clean package**

##### Ad 2\ Build image

Please type following command in opened command line tool: 
* **docker build -t greeting-image .**

##### Ad 3\ Build and start container

Please type following command in opened command line tool: 
* **docker run -d -p 8080:8080 --name greeting-container greeting-image**

##### Ad 4\ Display page

Please open any **browser** and type following URL there: 
* **http://localhost:8080**

##### Ad 5\ Stop container

Please type following command in opened command line tool: 
* **docker stop greeting-container**

##### Ad 6\ Remove container

Please type following command in opened command line tool: 
* **docker rm greeting-container**

##### Ad 6\ Remove image

Please type following command in opened command line tool: 
* **docker rmi greeting-image**