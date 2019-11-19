# MICROSERVICES

Microservices, aka Microservice Architecture, is an architectural style that structures an application as a collection of small autonomous services, modeled around a business domain.

## Monolith:
Advantage:
1. When you have a small or cohesive team, you maynot effort the time and effort needed to break the application into microservices.
2. Less complex: There are lesser moving parts. The overhead of breaking the application into smaller services is less and maintaince is relatively easy.
3. Duplicate code is less
4. Calls runs faster - RPC calls

Disadvantage:
1. Deployments are complecated
2. One big complex application
3. Fault taulerace is less: Responsibility on each service is high

## Microservices:
Advantage:
1. High scalability
2. Fault tolerance
3. Loosely coupled
4. Parallel development
5. Deployment is easy
6. Streamlined approach on scaling the service that realy needs it to be scaled.

Disadvantage:
1. Difficult to design microservices

# Overview of the project
Application deals with movies and ratings. There are three microservices
1. catalog-service : Provides the list of movies that a user have watched and rated
2. movie-info: Provides the details about the movie-info
3. ratings service: Details about the rating that the user provided for the movies he/she watched.
4. Discover-service: acts like the service registery. Here we are using eureka server for service discovery. Here we are using client registery pattern, where each client will register 
to the eureka server. Eureka server provides service discovery, load balancing, fault taulerance and caching.

# Design patterns for microservices

## Decomposition patterns

### Decompose by business capability.
A business capability is something that a business does in order to generate value. For example, the capabilities of an insurance company typically include sales, marketing, underwriting, claims processing, billing, compliance, etc

### Decompose by subdomain
You will come across so-called "God Classes" which will not be easy to decompose. These classes will be common among multiple services. For example, the Order class will be used in Order Management, Order Taking, Order Delivery, etc. How do we decompose them?



# References:
1. [Intro to microservice architecture](https://dzone.com/articles/what-is-microservices-an-introduction-to-microserv)
2. [Build microservice using spring boot](https://www.youtube.com/watch?v=y8IQb4ofjDo&list=PLqq-6Pq4lTTZSKAFG6aCDVDP86Qx4lNas&index=1)