DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to run simple "Hello World" Java Spring Boot application with template Thymeleaf using Docker Compose tool.

##### Details
Details:
* Example application will be builded and started by Docker Compose tool. More information about this tool you can find here: https://docs.google.com/document/d/1SPrCS5OS_G0je_wmcLGrX8cFv7ZkQbb5uztNc9kElS4/edit?usp=sharing
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
2. Start by Docker Compose
4. Display page
5. Display logs (optional)
6. Clean up

##### Ad 1\ Build package

Please open any command line tool on **root** folder of this project and type following command there: 
* **mvn clean package**

##### Ad 2\ Start by Docker Compose

Please type following command in opened command line tool: 
* **docker-compose up -d --build**

##### Ad 3\ Display page

Please open any **browser** and type following URL there: 
* **http://localhost:8080**

##### Ad 4\ Display logs (optional)

Please type following command in opened command line tool: 
* **docker-compose logs greeting**

##### Ad 5\ Clean up

Please type following command in opened command line tool: 
* **docker-compose down --rmi all**