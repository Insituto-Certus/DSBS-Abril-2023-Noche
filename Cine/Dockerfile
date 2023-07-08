FROM openjdk:17
EXPOSE 8888
ADD ./target/Cine-0.0.1-SNAPSHOT.jar   cine.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=docker","/cine.jar"]