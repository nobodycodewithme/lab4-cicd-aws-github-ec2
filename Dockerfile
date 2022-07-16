FROM adoptopenjdk/openjdk11:jdk-11.0.14.1_1-alpine-slim

EXPOSE 8080

COPY /target/lab4-cicd-aws-github-ec2-*.jar /usr/local/lib/app.jar

ENTRYPOINT ["java","-jar","/usr/local/lib/app.jar"]