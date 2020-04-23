# Spring-MVC-Blog
This is a simple Blog web application based on Spring Boot. It is made to learn the use of CRUD operation in MVC model

## To get started 
Clone this repository directly into your IDE and run the application on localhost

## Prerequisites
Have these bellow intalled on your system:
    
    JDK 1.8 and above 
    MYSQL 8 - for database 
    Maven (IDE autodownloads it once project is loaded)

## Database
Create mysql database called 'blog_db.
Make following changes to 'application.properties' file
    
    spring.datasource.url = jdbc:mysql://<url of your db inluding port and name>
    spring.datasource.username = myusername
    spring.datasource.password =mypassword
  



To run web application browse to the BlogApplication.java and run as a "Java Application". Open the browser on localhost:8080.
