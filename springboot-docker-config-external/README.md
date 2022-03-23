DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to build and run simple "Hello World" Java Spring Boot application using Docker tool.


##### Details
* More information about Docker tool you can find here: `https://docs.google.com/document/d/1tKdfZIrNhTNWjlWcqUkg4lteI91EhBvaj6VDrhpnCnk/edit?usp=sharing`
* This example application just displays text: "Hello World".


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

1. Build package with `mvn clean package`
2. Build image with `docker build -t greeting-image .`
3. Build and start container with `docker run -d -p 8080:8080 --name greeting-container greeting-image`
4. Visit `http://localhost:8080`
5. Display container logs (optional)

    * Display logs with `docker logs greeting-container`
    * Stop displaying logs with `ctrl + c`
6. Clean up environment:

    * Stop container with `docker stop greeting-container`
    * Remove container with `docker rm greeting-container`
    * Remove image with `docker rmi greeting-image`