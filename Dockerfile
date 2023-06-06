FROM openjdk:17
EXPOSE 8080
ADD target/gui-video.jar gui-video.jar
ENTRYPOINT ["java", "-jar", "/gui-video.jar"]

