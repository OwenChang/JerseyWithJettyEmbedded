JerseyWithJettyEmbedded
=======================

This project is an example standalone REST server, using Jersey with embedded jetty server to host a rest service.

Source
======
The source files include:
+ Main, the main class which start jetty servery with jersey servlet and add rest package
+ HelloResource, the service class which provide two method
+ Greeting, represent the response mesage

Run
===
Run the Main class as a Java Application in eclipse

> 2014-10-20 19:31:53.673:INFO:oejs.Server:jetty-8.1.9.v20130131
>
>2014-10-20 19:31:53.908:INFO:oejs.AbstractConnector:Started SelectChannelConnector@0.0.0.0:8089

The above output indicate that the server is running now.

Test
====
Use the following command to test the rest service

>$ `curl http://localhost:8089/hello`
>
>{"greetText":"Hello","name":"World"}


>$ `curl http://localhost:8089/hello/owen`
>
>{"greetText":"Hello","name":"owen"}

Dependence
==========
This demo is running on JDK 1.6, so we use Jetty 8 instead of Jetty 9 and use JAX-RS 1.0 and Jersey 1.x

+ Servlet 3.0
+ Jetty 8.1.9
+ Jersey 1.18
+ JSR 311 
+ Jackson 1.9.2
+ Asm 3.3.1

```xml
<dependency>
	<groupId>javax.servlet</groupId>
	<artifactId>javax.servlet-api</artifactId>
	<version>3.1.0</version>
</dependency>

<dependency>
	<groupId>org.eclipse.jetty.aggregate</groupId>
	<artifactId>jetty-aggregate-project</artifactId>
	<version>8.1.9.v20130131</version>
</dependency>

<dependency>
	<groupId>com.sun.jersey</groupId>
	<artifactId>jersey-bundle</artifactId>
	<version>1.18</version>
</dependency>
```