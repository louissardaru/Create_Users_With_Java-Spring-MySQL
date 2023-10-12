# Create_Users_With_Java-Spring-MySQL
Create Users with Java Spring MySQL

Skills: Java, Spring Boot, My SQL, Hibernate, Spring MVC, Spring Data JPA, Spring Tool Suite

Spring application connected to a MySQL Database. In application.properties I have "spring.jpa.hibernate.ddl-auto=update", this can be:

- none: The default for MySQL. No change is made to the database structure.

- update: Hibernate changes the database according to the given entity structures.

- create: Creates the database every time but does not drop it on close.

- create-drop: Creates the database and drops it when SessionFactory closes.

So after i created the database and I don't want to update it for a time and at the same time secure it agains outside attacks we set it to "none".

I use an "entity" annotated class because Hibernate automatically translates the entity into a table. I created a repository(UserRepository Interface) that holds user records and a controller to handle HTTP requests to my application. In my case POST and GET.

POST localhost:8080/app/add: Adds one user to the data.

![Post](https://github.com/louissardaru/Create_Users_With_Java-Spring-MySQL/assets/119102199/db868c3a-8068-4ee0-a0cf-31129f45bd7f)


GET localhost:8080/app/all: Gets all data. 

![Get](https://github.com/louissardaru/Create_Users_With_Java-Spring-MySQL/assets/119102199/f729dfa4-0f21-4674-abe6-1699250acc02)
