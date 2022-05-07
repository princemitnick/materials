FROM adoptopenjdk/openjdk11:ubi
VOLUME /tmp
ARG JAR_FILE
COPY target/materials-0.1.jar /
EXPOSE 9293
ENTRYPOINT [ "java", "-jar", "/materials-0.1.jar" ]