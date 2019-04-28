FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
RUN echo "jar file name is : ${JAR_FILE}"
COPY ${JAR_FILE} spring_mongo_app.jar
ENTRYPOINT ["java", "-jar", "/spring_mongo_app.jar"]
