FROM gradle:6.4-jdk11

USER root

RUN mkdir /build

COPY . /build

WORKDIR /build

RUN gradle build

# BUILD END

FROM openjdk:11-jre-slim-buster

LABEL maintainer="alexander.buntakov@touchin.ru"

RUN apt-get update && apt-get install -y \
    curl \
    dnsutils \
 && rm -rf /var/lib/apt/lists/*

RUN mkdir /app

WORKDIR /app

ARG app_name

ENV APP_NAME=${app_name}

COPY --from=0 "build/build/libs/security.demo-0.0.1-SNAPSHOT.jar" "/app/${app_name}.jar"

EXPOSE 8080
EXPOSE 9000

CMD java \
  -Dspring.profiles.active="${APP_PROFILE}" \
  $JAVA_OPTS \
  $JAVA_ARGS \
  -jar "${APP_NAME}.jar" \
  --server.port=8080
