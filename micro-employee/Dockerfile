FROM openjdk:17
EXPOSE 8081
ADD ./target/micro-employee-0.0.1-SNAPSHOT.jar   employee.jar

ENTRYPOINT ["java","-jar","-Dspring.profiles.active=docker","/employee.jar"]