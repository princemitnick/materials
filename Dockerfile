FROM adoptopenjdk/openjdk11:ubi
VOLUME /tmp
ARG JAR_FILE
COPY target/*.jar material-v1.jar
EXPOSE 9293
ENTRYPOINT [ "java", "-jar", "employee-v1.jar" ]