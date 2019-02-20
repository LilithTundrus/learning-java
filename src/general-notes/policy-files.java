/* 
Policy files are semi-unique to Java in that they are a part of Java
entirely aimed at security

Java now uses a declarative system that allows policy files to be written for applications

These are text based files that describe the permissions an application does or does not have

This used to have a lot to do with applets but those are much less of a focus since Java 6


BY DEFAULT, no security management is used when you launch a local Java application

you can invoke the default security manager at runtime by passsing a given
-D param to the java command:

> java -Djava.security.manager MyCode

This will prevent a lot of bad behaviours as well as some well-intentioned ones

In the case of needing more control a policy file can be made. This can be done using the JDK policytool
command. This opens a GUI that is relatively easy to understand.

To use the generated policy file is similar to the previous example command:

> java -Djava.security.manager -Djava.security.policy=MyCode.policy
*/