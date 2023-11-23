FROM openjdk:17
EXPOSE 8888
ADD target/jenkins-docker-integration-sample.jar jenkins-docker-integration-sample.jar
ENTRYPOINT ["java","-jar","/enkins-docker-integration-sample.jar"]