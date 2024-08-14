FROM maven:3.9.8-amazoncorretto-21-debian

EXPOSE 8081
LABEL version="1.0"
MAINTAINER "@Devopswithanil"


WORKDIR /demo

COPY . /demo

RUN mvn clean install -U



ENTRYPOINT ["java", "-jar"]
CMD [ "/demo/target/docker-demo.jar"]

# java -jar /demo/target/docker-demo.jar


