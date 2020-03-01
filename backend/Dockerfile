FROM maven:latest
COPY pom.xml /app/pom.xml
WORKDIR /app
RUN mvn dependency:go-offline
ADD src /app/src/
RUN mvn compile
RUN mvn exec:java -Dexec.args="exit"
ENTRYPOINT ["mvn", "exec:java"]