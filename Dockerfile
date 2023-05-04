FROM openjdk:11

COPY target/springapp.jar  /usr/app/springapp.jar

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "springapp.jar" ]