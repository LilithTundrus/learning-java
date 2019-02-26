/* 
A standard feature that Java adopted from the C language is printf-style string for‐
matting. printf-style formatting utilizes special format strings embedded into text to
tell the formatting engine where to place arguments and give detailed specification about
conversions, layout, and alignment. The printf formatting methods also make use of
variable-length argument lists
*/
System.out.printf( "My name is %s and I am %d years old\n", name, age );
/* The printf formatting draws its name from the C language printf() function */

/* The primary new tool in the text formatting arsenal is the java.util.Formatter class
and its format() method. Several convenience methods can hide the Formatter object
from you and you may not need to create a Formatter directly. First, the static
String.format() method can be used to format a String with arguments (like the C
language sprintf() method): */
String message = String.format("My name is %s and I am %d years old.", name, age );

/* In addition to the format() method, PrintStream and PrintWriter also have a version
of the format method that is actually called printf().The printf() method is identical
to and, in fact, simply delegates to the format() method. It’s there solely as a shout-out
to the C programmers and ex-C programmers in the audience. */

/* 
Using the format methods for strings is pretty simple, a % followed by the type within the 
string denotes the type of string to be replaced

%s represents a general string replacement
%d represents and integer replacement'

Note that in Java instead of allowing for inproper type formatting creating garbage strings
it will flag the operation as illegal as well as most IDEs

Formats are also Locale sensitive and diplays all numbers, percentages, dates and times in the Locale format

Additional flags and fields can be used to govern layout with different meanings for
different types of arguments. For example, with floating-point numbers, you can specify
a precision in the format string.
The general layout of the embedded format string is as follows:
 %[argument_index$][flags][width][.precision]conversion_type

Any additional information needs a lot of explaing, so just look up how to format something if needed
*/
