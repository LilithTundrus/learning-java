/* 
Although Java supports reading enviornment variables from the host system it is not best practice.

Java instead prefers values called system property values

These are name:value pairs that can be accessed using the below basic method:
*/

System.getProperty();


/* 
These are considered more structured than basic command line arguments and are passed to the interpereter 
using the below CLI command perfix for the JVM args:

> java -Dname=beh -DAddress=1234 Street Street

The main distinction is the capital D in front of the JVM args
*/

// Note you can access these properties like so:
String name = System.getProperty("name");


/* 
As always configuration is up to you and this isn't absolutely needed.

You can always just read JSON or XML files for configuration using Java's IO APIs
*/