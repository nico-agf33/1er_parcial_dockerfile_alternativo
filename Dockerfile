FROM archlinux:latest as build

RUN yes | pacman -Syy
RUN yes | pacman -S jdk17-openjdk jre17-openjdk

COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew bootJar --no-daemon

FROM openjdk:17
EXPOSE 9000
COPY --from=build ./build/libs/api_rest_p-0.0.1-SNAPSHOT.jar ./app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
