# Project Title

One Paragraph of project description goes here

## Building the demo

Run the following from the command line:
```
git clone https://github.com/alejandro-du/vaadin-microservices-demo.git
cd vaadin-microservices-demo
mvn package
```

### Prerequisites

What things you need to install the software and how to install them

```
Give examples
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


## Using the Demo Application

Point your browser to http://localhost:8080 and try adding companies with actual Twitter account names. Refresh the browser to see the latest tweets of the entered companies.



## Built With CI TeamCity

We are using TeamCity is a Java-based build management and continuous integration server from JetBrains.


## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc

