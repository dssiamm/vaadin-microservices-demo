# Project Title

1. The functionality of the demo application is provided through 4 microservices:

  * biz-application: A REST API for managing data (companies).
  * admin-application: A web user interface to interact with data (companies).
  * news-application: A web user interface to display data (companies’ tweets).
  * website-application: A portal-like website that renders multiple web applications in a single web page.
2. Additionally, the system requires three orchestration services:

  * discovery-server: Service registration and discovery.
  * config-server: Externalized configuration.
  * proxy-server: Edge service with dynamic routing.
  
![demo_app] https://github.com/dssiamm/vaadin-microservices-demo/blob/master/images/demo_app.png

## Building the demo

Run the following from the command line:
```
git clone https://github.com/dssiamm/vaadin-microservices-demo
cd vaadin-microservices-demo
mvn package
```


### Installing

Use multiple (seven) terminals to perform the following steps:

**1) Start the `discovery-server` application (Eureka app):**
```
cd vaadin-microservices-demo/discovery-server
java -jar target/discovery-server-0.0.1-SNAPSHOT.jar
```

**2) Start the `config-server` application (Spring Cloud Config app):**
```
cd vaadin-microservices-demo/config-server
java -jar target/config-server-0.0.1-SNAPSHOT.jar
```

**3) Start an instance of the `biz-application` microservice (REST app):**
```
cd vaadin-microservices-demo/biz-application
java -Dserver.port=9601 -jar target/biz-application-0.0.1-SNAPSHOT.jar
```

**4) Start an instance of the `admin-application` microservice (Vaadin app):**
```
cd vaadin-microservices-demo/admin-application
java -Dserver.port=9401 -jar target/admin-application-0.0.1-SNAPSHOT.jar
```

**5) Start an instance of the `news-application` microservice (Vaadin app):**
```
cd vaadin-microservices-demo/news-application
java -Dserver.port=9201 -jar target/news-application-0.0.1-SNAPSHOT.jar
```

**6) Start an instance of the `website-application` microservice (Vaadin app):**
```
cd vaadin-microservices-demo/website-application
java -Dserver.port=9001 -jar target/website-application-0.0.1-SNAPSHOT.jar
```

**7) Start the `proxy-server` application (Zuul app):**
```
cd vaadin-microservices-demo/proxy-server
java -jar target/proxy-server-0.0.1-SNAPSHOT.jar
```

## Using the Demo Application

Point your browser to http://localhost:8080 and try adding companies with actual Twitter account names. Refresh the browser to see the latest tweets of the entered companies.


## Versioning

We are using TeamCity is a Java-based build management and continuous integration server from JetBrains.

## Authors

  * **dsiamm** - (https://github.com/dssiamm/vaadin-microservices-demo)
  * **shayda** - (https://github.com/shayda)
  * **bartromg** - (https://github.com/bartromg)
  * **hamster95** - (https://github.com/hamster95)

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc

