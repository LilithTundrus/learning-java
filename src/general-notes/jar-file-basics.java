/* 
Java Archive files (JAR) are how Java compresses a collection of data and code.

They are the STANDARD way to pack up part or all of your Java application into 
a single file

You can put literally anything into a JAR file, this includes signatures about the contents
that the JAR file contains

the runtime JVM can load class files from the CLASSPATH. Other types of files can be accessed using
the getResource() method

Files in the JAR format are technically just in the ZIP compression format



The JAR command:

There is a tool included with JDK called jar that works a lot like Linux tar:

jar -cvf jarFile path [ path ] [ ... ]
Create jarFile containing path(s)

jar -tvf jarFile [ path ] [ ... ]
List the contents of jarFile, optionally showing just path(s)

jar -xvf jarFile [ path ] [ ... ]
Extract the contents of jarFile, optionally extracting just path(s)



Like mentioned above, JAR files can have metadata files. The JAR command by default adds a directory
to the JAR file called META-INF. This directory always contains a file called MANIFEST.MF

This file contains a list of all of the files in the JAR file as well as attributes about those files
that can be set by a developer


You can also sign JAR files with a digital signature, but when this is done a checksum is added to
the META-INF directory for each file


You can also manually assign attributes using a manifest file you made on your own:

To use this when making a JAR file, pass the JAR command a -m options and a manifest file:

$  jar -cvmf manifest.mf tes.jar test

An application can get this manifest information from a JAR file using the java.util.jar.Manifest class



To make a JAR runnable from the GUI or CLI you can add a Main-Class property to you manifest file 
(see the example manifest file)
*/