**A Brief on what this app does.**

Simplified Architecture of this microservice application:

![Architecture](assets/diagram.drawio.svg)

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

**Distributed Tracing**

Distributed tracing is a subset of monitoring and observability. A **trace** (which is unique to every request from beginning till the end) follows a request from start to end and how your data and request moves through the entire microservice architecture. It can record which services it interacted with and each service’s latency.

This tracing information can be used to analyze any deviations from normal application behaviour. There are tools like **Zipkin** which help us to visualize how the requests are being made to different services inorder to get a response to the initial request.

To learn more about Distributed Tracing [click here.](https://www.splunk.com/en_us/data-insider/what-is-distributed-tracing.html)


**Jib**

Simply put, Jib is an open-source Java tool maintained by Google for building Docker images of Java applications without requiring a Docker installation in your local machine. The user need not know the best practices to write a docker file, Jib takes care of that.
Jib takes your code, builds docker image and pushes to registry (Docker Hub).

**Note:** In this project I've not configured Jib to push docker images to registry, instead the images are stored in my local and it required docker installation. If you want to push your projects' images to registry and to learn more about Jib [click here](https://cloud.google.com/java/getting-started/jib).


**Coming Soon**

- TestContainer
- Distributed Tracing with Sleuth and visualization with Zipkin.(can probably add more info)
- Dockerizing the entire application.


For Integration Tests I've used a external Testing library called **Testcontainers**. To learn more about Testcontainers with java you can [click here](https://testcontainers.com/guides/getting-started-with-testcontainers-for-java/).
Some brief about Testcontainers. Testcontainers is an easy solution to run Integration Tests inside a docker container. When you write a integration test using Testcontainers, what happens is a docker container is spun up temporarily and perform the test inside the docker container in realtime. 


OAuth 2.0 Resource Server [click here](https://www.baeldung.com/spring-security-oauth-resource-server)

This microservices project uses the following Architecture



Coming soon complete documentation.