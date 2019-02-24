/* 
Working with strings in any language is fundamental to truly understanding the 
language. 

In Java, a String object:
encapsulates a sequence of Unicode characters. Internally, these characters are stored
in a regular Java array, but the String object guards this array jealously and gives you
access to it only through its own API. 
This is to support the idea that Strings are immutable; once you create a String object, 
you can’t change its value.

a lot of methods attached to a string object seem to modify the string but these actually just
return a new string object.
*/

/* Literal strings, defined in your source code, are declared with double quotes and can be
assigned to a String variable: */
String a = "AAAAAA";

 /* Java automatically converts the literal string into a String object and assigns it to the
variable. */

/* You can get the length of a String with the length() method. You can also
test for a zero length string by using isEmpty(): */
int length = a.length();
boolean empty = a.isEmpty();

/* Strings can take advantage of the only overloaded operator in Java, the + operator, for
string concatenation. The following code produces equivalent strings: */
String name = "John " + "Smith";
String name = "John ".concat("Smith");

/* 
Java doesn't support multiline strings but using the + operator allows the same effect to happen.
*/

/* In addition to making strings from literal expressions, you can construct a String
directly from an array of characters: */
char [] data = new char [] { 'L', 'e', 'm', 'm', 'i', 'n', 'g' };
String lemming = new String( data );
// You can also construct a String from an array of bytes:
// byte [] data = new byte [] { (byte)97 , (byte)98, (byte)99 };
// String abc = new String(data, "ISO8859_1");


/* Conversely, the charAt() method of the String class lets you access the characters of
a String in an array-like fashion: */
String s = "BEH";
for ( int i = 0; i < s.length(); i++ ) { 
    System.out.println( s.charAt( i ) );
};
/* This code prints the characters of the string one at a time. Alternately, we can get the
characters all at once with toCharArray(). Here’s a way to save typing a bunch of single
quotes and get an array holding the alphabet:  */
char [] abcs = "abcdefghijklmnopqrstuvwxyz".toCharArray();


