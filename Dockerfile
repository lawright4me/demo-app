FROM eclipse-temurin
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
RUN apt-get update && \
    apt-get install -y postgresql-client && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]

