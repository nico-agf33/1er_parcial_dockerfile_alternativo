FROM openmamba/openmamba:latest as build

RUN dnf -y check-update
RUN dnf -y install java-17-openjdk java-17-openjdk-devel

COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew bootJar --no-daemon

FROM openjdk:17
EXPOSE 9000
COPY --from=build ./build/libs/api_rest_p-0.0.1-SNAPSHOT.jar ./app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
