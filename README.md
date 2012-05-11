htng-property-2009b-guestselfservice
=

A JAX-WS/JAXB sample implementation of part of the Guest Self Service package in the [HTNG 2009B Property](http://collaboration.htng.org/specs/) specification.  This project uses JAXB to generate POJOs from the HTNG schemas, then uses those POJOs in a JAX-WS SOAP service that complies with the HTNG spec.

Build the Project
=
Clone this repository and build the project with Maven:
```
$ cd guestselfservice
$ mvn clean package
```
The POM for this project will run the maven-jaxb2-plugin against the HTNG Property (2009B) schemas contained in the ```src/main/resources``` folder.  This generates POJOs that are used by the JAX-WS service, ```GuestSelfService.java```.  Since this is intended as an "all-in-one" example, the POM also uses the maven-shade-plugin to create an "uber" executable jar which contains the jaxb2-basics-runtime classes (which are used to add convenience methods to the POJOs -- equals, hashcode, merge, etc.). 

Publish the Service Endpoint
=
Publish the service by navigating to the ```/target``` directory executing the jar:
```
$ cd target
$ java -jar guestselfservice-2009b.jar
```

Use the Service
=
Verify that the service is started by opening a web browser and navigating to ```http://localhost:8080/GuestSelfService```.  You should see an endpoint information page that also has a link to the service's WSDL (```http://localhost:8080/GuestSelfService?wsdl```).  You can use this WSDL to generate a client stub for your SOAP stack (or a sample for your testing tool) and interact with the service.