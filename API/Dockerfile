#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS app
WORKDIR /usr/src/build
COPY . .
RUN mvn package -DskipTests

#
# Package stage
#

FROM openjdk:11

COPY --from=app /usr/src/build/target/cloud-0.0.1-SNAPSHOT.jar cloud.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","cloud.jar"]
