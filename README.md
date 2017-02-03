# hello-spark
A 'Hello World' sample of REST API, created using Spark ( http://sparkjava.com/ )

## How to run this sample

* Ensure that you have setup maven in your machine. See the instructions in here if you have not done it before: http://www.mkyong.com/maven/how-to-install-maven-in-ubuntu/
* Pull this repo into your machine, go into the cloned repo's directory then run `mvn package` command to start building the sample.
* Once building the sample is done, run `mvn exec:java -Dexec.classMain="com.wendysa.hellospark.Main"` command to start running the REST server.
* Browse to http://localhost:4567/hello to invoke the ''Hello Spark' GET API.
