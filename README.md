## Organism-ws [![Build Status](https://travis-ci.org/sipf/organism-ws.svg?branch=develop)](https://travis-ci.org/sipf/organism-ws)

[Quality Gate status](https://sonarcloud.io/dashboard?id=pf.net.api.organism)

This project is used for proof of concept only. Of course, you can contribute, you just need to fork 
and PR your feature.

You can access to the data in this repository :

* [https://github.com/sipf/organism-ws/blob/develop/src/main/resources/data.sql](https://github.com/sipf/organism-ws/blob/develop/src/main/resources/data.sql)

### Usage

Start the container :

```
docker run -p 8080:8080 sipf/organism-ws
```

You can then log to [http://127.0.0.1:8080](http://127.0.0.1:8080) to use the service or the review apps on 
 [heroku](https://organism-ws.herokuapp.com) with curl :
 
```
curl -u admin:password https://organism-ws.herokuapp.com
```
 
The login is admin and the password is password. The heroku instance means to be demo only and there is no security constraint about it 
(note : heroku shutdown the app if it is not used for a while. If you use the curl command, you need to wait a moment, so the app can be restart).

### Default Configuration

```
spring:
  profiles:
    active: development

---
spring:
  profiles: production

---
spring:
  profiles: test
  jpa:
    hibernate:
      ddl-auto: create-drop
    show-sql: true
    database: postgresql
    generate-ddl: true
  datasource:
    url: ${JDBC_DATABASE_URL}
    username: ${JDBC_DATABASE_USERNAME}
    password: ${JDBC_DATABASE_PASSWORD}
    platform: postgres
    driver-class-name: org.postgresql.Driver
security:
  user:
    name: admin
    password: password

---
spring:
  profiles: development
  h2:
    console:
      enabled: true
      path: /h2-console
  jpa:
    hibernate:
      ddl-auto: create-drop
    show-sql: true
  datasource:
    platform: h2
server:
  use-forward-headers: true
security:
  user:
    name: admin
    password: password
```

### Building the container

```
docker build -t sipf/organism-ws .
```

### License & Authors

* License : MIT
* Authors :
  * Leonard TAVAE (leonard.tavae@informatique.gov.pf)
  * Peter MEUEL (peter@teriiehina.net)
