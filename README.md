**A Brief on what this app does.**

Product Service is used to read, create, update and delete Products
Inventory Service is used to handle the orders which are requested from Order Service.
Order Service has a circuit breaker. 
When an order is placed successfully Order Service creates an Order Placed Event and triggers Notification Service which in turn triggers a notification (in this case it's an email.)

Technologies used : 
TestContainers
JIB

For Integration Tests I've used a external Testing library called **Testcontainers**. To learn more about Testcontainers with java you can [click here](https://testcontainers.com/guides/getting-started-with-testcontainers-for-java/).
Some brief about Testcontainers. Testcontainers is an easy solution to run Integration Tests inside a docker container. When you write a integration test using Testcontainers, what happens is a docker container is spun up temporarily and perform the test inside the docker container in realtime. 


This microservices project uses the following Architecture

![Architecture](assets/final.drawio.svg)

Coming soon complete documentation.