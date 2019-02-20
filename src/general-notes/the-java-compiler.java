/* 
javac is the compiler for java code in JDK

It is written in java itself!

javac turns .java code into compiled class containing the Java bytecode
to be used with the java command

javac only allows one public class per file and by defualt requires files to have the same name
as the classes they represent

of course files can have multiple classes but only one public

basic javac usage:

javac [options] [java source file]

the -d options allows you to specify an alternate directory to place the generated files

javac is considered more advanced than something like C's make utility as it supports advanced features
and does not require special files to tell the compiler how to operate

*/