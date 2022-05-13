DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to create CRUD application using Java Spring Boot back-end framework and Thymeleaf front-end framework. Application CRUD means that user can perform here following actions related to data:
* Create
* Read
* Update
* Delete 

In this application data are not stored in database but in HTTP session as attributes

##### Details
This application enables to manage user names which are stored in HTTP session as attributes. This application consists of following pages:
* **List**: displays list of all users;
* **Create**: enables to create new user;
* **View**: enables to display user details;
* **Update**: enables to update user details;
* **Delete**: enables to delete user.


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed Java
* Installed Maven
* Installed Git

##### Preconditions - Actions
* Download Source Code with `git clone https://github.com/wisniewskikr/java-springboot.git`


USAGE
-----

Usage steps:
1. Start application with `mvn spring-boot:run`
2. Visit `http://localhost:8080`
3. Clean up environment with `ctrl + C`