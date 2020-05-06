FROM java:8
COPY ./target/spotify-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 9090
CMD ["java","-jar","/app.jar"]
