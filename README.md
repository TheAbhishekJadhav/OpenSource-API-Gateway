# OpenSource-API-Gateway

This project is to build API Gateway using opesource technologies.

The project includes Spring Boot framework for developing APIs and Apache Tomcat Server for deploying APIs. The APIs are created by using Java and backend is based on Linux. We are using PostgreSQL database in the Docker container which will allow us to connect the APIs directly with the database to fetch and add the required details. Port security is also placed by allowing payloads to route from a particular port to its destination. As the API Gateway acts as a middleware, so it provides complete anonymity of backend services towards external clients which increases the security measures.

All the APIs are REST APIs.

## Demo-1

- This demo is to show the **simple routing** functionality of an API. 
- Here our request is routed to another backend URL hence, showing the functionality of server as API Gateway.

## Demo-2

- This demo is to show that Gateway server itself can **handle some request and provid a Modified or Hardcoded response** from the Gateway. 
- Here our API Gateway server is handling request and running a application natively on server to provide the response accordingly.
- This API can store list of persons details and directly give these persons details from gateway server.

## DemoPostgres

- In this demo it is showed that API can directly connect to any form of database and run the service on gateway server.
- We have used **PostgreSQL** for the database and handle request on API server to **convert JSON abjects into Database objects and vice versa** for generating responses.
- This API can store list of student details in PostgreSQL database and retrive the database to give JSON response.
