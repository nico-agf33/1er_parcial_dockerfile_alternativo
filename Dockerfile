FROM openmamba/openmamba:latest as build

RUN dnf -y update
RUN dnf -y install java-openjdk17 ca-certificates openssh openssl

COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew bootJar --no-daemon

FROM openjdk:17
EXPOSE 9000
COPY --from=build ./build/libs/api_rest_p-0.0.1-SNAPSHOT.jar ./app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
