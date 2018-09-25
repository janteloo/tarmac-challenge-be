# Project

Tarmac Challenge API

## Running the Project 

In order to run the project you need to run

```
mvn clean spring-boot:run
```

The API will be available at 

```
http://localhost:8080/workers
```

## API Endopints

The API supports the following rest methods:

```
GET / POST / PUT / DELETE
```

It exposes two search methods 

```
GET

http://localhost:8080/workers/search/byName?name=${name}
```

```
GET

http://localhost:8080/workers/search/byRole?role=${role}
```

