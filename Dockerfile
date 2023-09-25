FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/veta_test-1.0-RELEASE.jar

# cd /usr/local/runme
WORKDIR /usr/local/runme

# copy target/veta_test-1.0-RELEASE.jar /usr/local/runme/app.jar
COPY ${JAR_FILE} app.jar

# java -jar /usr/local/runme/app.jar
ENTRYPOINT ["java","-jar","app.jar"]
