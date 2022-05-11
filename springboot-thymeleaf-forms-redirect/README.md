SPRING BOOT FORM INPUT AND OUTPUT PAGES
========================================


LOCALHOST URL
-------------

* **URL**: http://localhost:8080


DESCRIPTION
-----------

#####Goal
The goal of this project is to show to create application with two related pages using technologies Spring Boot MVC and Thymeleaf. 

#####Details
This project consists following pages:
* Input Page: this page contains input filed with name;
* Output Page: this page contains text "Hello World" + name from Input Page.

#####Used technologies:
* **BE**: Spring Boot MVC
* **FE**: Thymeleaf


IMPLEMENTATION
-----------

Implementation details:
* Create class InputCommand.java;
* Create class InputController.java;
* Create file "input.html";
* Create class OutputCommand.java;
* Create class OutputController.java;
* Create file "output.html".
  

LAUNCH
------

To launch project please run following class: 
* Application.java

You can also launch project using Maven command:
* mvn spring-boot:run -Dspring.thymeleaf.cache=false


USAGE
-----

Link to main UI:
* http://[server]