**A Brief on what this app does.**

There are six services in this Microservice application:

- Product Service
- Inventory Service
- Order Service
- Discovery Server (Service Discovery)
- API Gateway Service
- Notification Service

**Product Service** is used to read, create, update and delete Products.

**Inventory Service** is used to maintain the inventory of products which has information like Stock-keeping unit (sku) and quantity of a particular Product.

**Order Service** is used to place an order. The Order Service calls Inventory Service to check if the ordered items are present in the inventory. If present, the order is placed or else an appropriate error is shown.

**Service Discovery**

We are using **Netflix Eureka Server** as Discovery Server from the Spring Cloud Project. Service Discovery is a important and fundamental implementation in Microservices world as it maintains a **registry** of multiple instances of multiple services using which services can communicate each other. 

[Click here](https://www.baeldung.com/cs/service-discovery-microservices) to learn more about Service Discovery in Microservices.

**API Gateway**

API Gateway is a single point of entry to access all the APIs of the services in the microservice architecture.
[Click here](https://www.ibm.com/cloud/blog/api-gateway) to get a better understanding of API Gateways.


**Coming Soon**

- TestContainer
- JIB
- Distributed Tracing with Sleuth and visualization with Zipkin.
- Dockerizing the entire application.


For Integration Tests I've used a external Testing library called **Testcontainers**. To learn more about Testcontainers with java you can [click here](https://testcontainers.com/guides/getting-started-with-testcontainers-for-java/).
Some brief about Testcontainers. Testcontainers is an easy solution to run Integration Tests inside a docker container. When you write a integration test using Testcontainers, what happens is a docker container is spun up temporarily and perform the test inside the docker container in realtime. 


This microservices project uses the following Architecture

![Architecture](assets/diagram.drawio.svg)

Coming soon complete documentation.