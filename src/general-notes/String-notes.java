/* 
Strings are a bit special in Java

String are objects, they are a reference type, though most of the time they can
be treated similar to a primitive time. Literal strings in source code are 
translated to String objects. They can be used directly like primitives, 
passed as arguments or assigned to String variables
*/

System.out.println( "Hello, World..." );
String s = "Hello world";
String t = "You could say: \"Hello World\"";

/* 
The + operator in Java can concat strings natively:
*/

String concat = "Hello" + "World";

