/* 
In Java, understanding the classpath is very important...

The concept of a path in Java is a lot like it is in windows or Linux


The Java CLASSPATH enviornment variable is a list of locations that are searched for
Java class files

The Java compiler and the interpereter BOTH use the CLASSPATH env. variable
when searching for the given class argument 

part of the CLASSPATH can be a directory or a JAR file.

example classpath set command in windows: 

set CLASSPATH=C:\Documents\dev\Java\classes;C:\lib\beh.jar;


The CLASSPATH can also include wildcards (*) in the path so indicate all
JAR files in the directory will be searched


If no CLASSPATH is provided, it is assumed to be the current directory (./)

CLASSPATH issues are common when starting out with Java so keep them in mind when issues arise!


*/

