FROM openjdk:11

ENV ENVIRONMENT=prod

MAINTAINER Fabian Schmauder <fabian.schmauder@codecentric.de>

ADD target/app.jar app.jar

RUN bash -c 'touch /app.jar'

ENTRYPOINT ["java","-Dspring.profiles.active=${ENVIRONMENT}","-Djava.security.egd=file:/dev/./urandom","-Xmx512m","-jar","/app.jar"]
