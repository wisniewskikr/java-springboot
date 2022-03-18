DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to use Git pre-commit tool with simple "Hello World" Java Spring Boot application with template Thymeleaf.

Link to Git pre-commit documentation: https://docs.google.com/document/d/1Ff8DZYWNI4MfoHINrtEb5q2-0iVckp0LoVPeljMev_U/edit?usp=sharing

##### Details
Details:
* Git commits are checked by pre-commit tool;
* Example application will display on browser simple page with text: "Hello World";


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed Java
* Installed Maven
* Installed Git
* Installed pre-commit (check documentation from section "Description")

##### Preconditions - Actions
* **Download Source Code**: please open any command line tool on **target** folder (where project should be downloaded) and type following command there: **git clone https://github.com/wisniewskikr/java-springboot.git**


USAGE
-----

Usage steps:
1. Install pre-commit
2. Update source code
3. Add files to repository
4. Run pre-commit (optional)
5. Commit changes
6. Clean up

##### Ad 1\ Install pre-commit

Please open any command line tool on **root** folder of this project and type following command there:
* **pre-commit install**

##### Ad 2\ Update source code

Please add whitespace in **README.md** file after text **DESCRIPTION**

##### Ad 3\ Add files to repository

Please type following commands in opened command line tool:
* **git add .**
* **git status**

##### Ad 4\ Run pre-commit (optional)

Please type following command in opened command line tool:
* **pre-commit run**
* **git add .**
* **git status**
* **pre-commit run**

Expected result: **First** pre-commit failed and fixed. **Second** pre-commit passed.

##### Ad 5\ Commit changes

Please type following command in opened command line tool:
* **git commit -m "Init tmp project"**
* **git add .**
* **git status**
* **git commit -m "Init tmp project"**

Expected result: **First** pre-commit failed and fixed. **Second** pre-commit passed.

##### Ad 6\ Clean up
Please type following commands in opened command line tool:
* **git reset --hard HEAD~1**