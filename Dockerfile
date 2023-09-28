FROM openjdk:17-oracle

WORKDIR /class/assign/app

COPY Hello.java .

RUN javac Hello.java

CMD ["java", "Hello"]