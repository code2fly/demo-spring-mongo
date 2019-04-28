## Spring & Mongodb sample on docker

### Steps to run application - 
* clone project "git clone https://github.com/johnsnowtarg92/demo-spring-mongo.git"
* run "mvn clean package -DskipTests && docker-compose build && docker-compose up"


## Points to note in docker-compose.yml
```
version: "3"
services:
  mongodb:  // this is name of service which can be used for connecting from another container to mongodb(e.g. used in MongoConfiguration.java) 
    image: mongo:4.1
    ports:
      - "27017:27017"  // port exposed hostport:containerport
  webapp:
    build:
      context: . // expects dockerfile to be present in current directory ".", if not specific directory can used "/dir/."
      args:
        - JAR_FILE=target/demo*.jar  // jar file to put in image while building image from dockerfile (wildcard can used to specify jar file)
    ports:
      - "8091:8080"  // default tomcat port 8080(container port) to 8091 host port mapping. rest service will now be exposed on 8091

```


