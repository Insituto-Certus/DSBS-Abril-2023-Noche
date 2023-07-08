FROM openjdk:17
EXPOSE 8886
ADD ./target/microservice-products-0.0.1-SNAPSHOT.jar   ms-new-productos.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=docker","/ms-new-productos.jar"]