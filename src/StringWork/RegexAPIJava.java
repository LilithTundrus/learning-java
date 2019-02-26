/* 
As we’ve said, the regex patterns that we write as strings are, in actuality, little programs
describing how to match text. At runtime, the Java regex package compiles these little
programs into a form that it can execute against some target text. Several simple con‐
venience methods accept strings directly to use as patterns. More generally, however,
Java allows you to explicitly compile your pattern and encapsulate it in an instance of a
Pattern object. This is the most efficient way to handle patterns that are used more than
once, because it eliminates needlessly recompiling the string. To compile a pattern, we
use the static method Pattern.compile():
*/
Pattern urlPattern = Pattern.compile("\\w+://[\\w/]*");
/* Once you have a Pattern, you can ask it to create a Matcher object, which associates
the pattern with a target string: */
 Matcher matcher = urlPattern.matcher( myText );

/* 
A Matcher associates a pattern with a string and provides tools for testing, finding, and
iterating over matches of the pattern against it. The Matcher is “stateful.” For example,
the find() method tries to find the next match each time it is called. But you can clear
the Matcher and start over by calling its reset() method.
If you’re just interested in “one big match”—that is, you’re expecting your string to either
match the pattern or not—you can use matches() or lookingAt(). These correspond
roughly to the methods equals() and startsWith() of the String class. The match
es() method asks if the string matches the pattern in its entirety (with no string char‐
acters left over) and returns true or false. The lookingAt() method does the same,
except that it asks only whether the string starts with the pattern and doesn’t care if the
pattern uses up all the string’s characters
*/

/* 
A very common need is to parse a string into a bunch of fields based on some delimiter,
such as a comma. It’s such a common problem that in Java 1.4, a method was added to
the String class for doing just this. The split() method accepts a regular expression
and returns an array of substrings broken around that pattern. For example:
*/

String text = "Foo, bar , blah";
String [] fields = text.split( "\s*,\s*" );
/* yields a String array containing Foo, bar, and blah. You can control the maximum
number of matches and also whether you get “empty” strings (for text that might have
appeared between two adjacent delimiters) using an optional limit field.
If you are going to use an operation like this more than a few times in your code, you
should probably compile the pattern and use its split() method, which is identical to
the version in String. The String split() method is equivalent to: */
Pattern.compile(pattern).split(string);


// One additional feature (since Java 1.4) is the support for regex on the Scanner class
Scanner scanner = new Scanner( "Quantity: 42 items, Price $2.34" );
 scanner.findInLine("[Qq]uantity[:\\s]*");
 int quantity=scanner.nextInt();
 scanner.findInLine("[Pp]rice.*\\$");
 float price=scanner.nextFloat();


