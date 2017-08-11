FROM java:openjdk-8-jdk

ADD target/clean-rest-swarm.jar /opt/clean-rest-swarm.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/clean-rest-swarm.jar"]