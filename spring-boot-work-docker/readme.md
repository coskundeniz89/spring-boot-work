# Spring Boot + Docker + Web
This is a simple example of spring boot dockerizing.

### Docker settings

Docker plugin for gradle is used: [link](https://github.com/Transmode/gradle-docker)

In build.gradle file

> group= 'erhan277'

is used for Docker namespace. You must change this with your own Docker ID.

Dockerfile is here: [src/main/docker/Dockerfile](src/main/docker/Dockerfile)



### Building
> gradlew build buildDocker

### Run docker
> docker run -p 8080:8080 -t erhan277/spring-boot-work-docker

Now the application is available at localhost:8080.

### Stop docker

List containers:
> docker ps

> CONTAINER ID        IMAGE                              COMMAND                  CREATED             STATUS              PORTS                    NAMES
> 0ef53f45ee86        erhan277/spring-boot-work-docker   "java -Djava.secur..."   12 hours ago        Up 20 seconds       0.0.0.0:8080->8080/tcp   friendly_golick

Using the container ID:
> docker stop 0ef53f45ee86




