FROM openmamba/openmamba:latest as build

RUN dnf -y update
RUN dnf -y install wget
RUN wget https://download.oracle.com/java/17/latest/jdk-17_linux-x64_bin.rpm
RUN dnf -y install ./jdk-17_linux-x64_bin.rpm

COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew bootJar --no-daemon

FROM openjdk:17
EXPOSE 9000
COPY --from=build ./build/libs/api_rest_p-0.0.1-SNAPSHOT.jar ./app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
