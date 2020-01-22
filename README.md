## Students database
This project contains a Spring Web / Spring Data (MongoDB) example project

### Start
To run the project just start the main `DemoApplication.java`. 
You need a running mongoDB. Therefore you can use the `docker-compose` file.
Just run `docker-compose up` to spin up a mongoDB.
You can configure the MongoDB Port and Host under `src/main/java/resources/application.properties`.

### Build
##### jar
To build the project run `mvn clean install`.
This creates a `target/app.jar` file that you can run.
##### docker
To build a docker container run ``docker build .``. This creates a docker image.  
With ```docker run -d -p 8080:8080 <your-image-id>``` you can start the container and export port 8080.
