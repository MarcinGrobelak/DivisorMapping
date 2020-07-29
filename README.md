# DivisorMapping

### Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Deployment](#deployment)

### General info
Task objective was to prepare an HTTP application which accepts mapping name and a group of numbers. For each number all divisors are found and mapped for a words from mapping table. Response is in the form of JSON with number and mapped divisors.

### Technologies
Project is created with:<br />
* **JavaEE-Api** version: 8.0.1<br />
* **CDI** version: 2.0.SP1 <br />
* **JAX_RS** version: 2.1.1 <br />
* **Maven** version: 3.6.0<br />

### Deployment
Application was created and tested on Wildfly 19.
Endpoint adress: http://localhost:(port)/DivisorsMapping/request

