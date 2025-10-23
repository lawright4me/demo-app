# Используем базовый образ для Java приложения
FROM eclipse-temurin

# Очистка кэша apt и обновление зеркало
RUN apt-get clean && rm -rf /var/lib/apt/lists/* && \
    apt-get update && \
    apt-get install -y postgresql-client && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Переменная для указания jar файла
ARG JAR_FILE=target/*.jar

# Копируем JAR файл приложения
COPY ${JAR_FILE} app.jar

# Открываем порт приложения
EXPOSE 8080

# Указываем команду для запуска приложения
ENTRYPOINT ["java", "-jar", "/app.jar"]
