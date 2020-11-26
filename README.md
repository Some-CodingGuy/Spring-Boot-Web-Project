# Spring-Boot-Web-project
---

Project where I'll be exerimenting with Spring Boot Web capabilities and testing out what it can do, learning as I go through it.

I will explain more clearly what I did here and why the annotations where used in those places, what their role is and how they interact with each other.

### 1. Project purpose

This project's main purpose is to allow me (and any other person reading the code and tinkering with it) t learn about Spring Boot, more specifically about the web framework.

The project is here as a basis to be expanded upon in different projects, to experiment, fail, learn, and improve.


### 2. Structure

In /src/main/java/be/n/springbootproject/ you'll fin the source code that contains the actual Java code that is being run when you execut the application.

Whereas in /src/main/resources/ you'll find other resources. From which the mst important is the "application.yml" file that contains the configuration of the application (address of the database, username and password of the user it has to use in the database, etc... you can add more properties to this configuration file if you need to, but since I don't need that much, I kept it simple).

### 3. Walkthrough

In the api package we have the "PersonController.java" class file. Here we have the RESTFUL controller that will take the requests and depending on the type of request, perform a certain action.
