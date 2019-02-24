/* 
A common programming task involves parsing a string of text into words or “tokens”
that are separated by some set of delimiter characters, such as spaces or commas.  

Java has several overlapping APIs for handling situations like this. The
most powerful and useful are the String split() and Scanner APIs. Both utilize regular expressions 
to allow you to break the string on arbitrary patterns.
*/

/* The String split() method accepts a regular expression that describes a delimiter
and uses it to chop the string into an array of Strings: */
 String text = "Now is the time for all good men";
 String [] words = text.split("\\s");
 // words = "Now", "is", "the", "time", ...
 String text = "4231, Java Programming, 1000.00";
 String [] fields = text.split("\\s*,\\s*");
 // fields = "4231", "Java Programming", "1000.00"

 /* In the first example, we used the regular expression \\s, which matches a single white‐
space character (space, tab, or carriage return). The split() method returned an array
of eight strings. In the second example, we used a more complicated regular expression,
\\s*,\\s*, which matches a comma surrounded by any number of contiguous spaces
(possibly zero). This reduced our text to three nice, tidy fields.
 */

/* With the new Scanner API, we could go a step further and parse the numbers of our
second example as we extract them: */
 String text = "4231, Java Programming, 1000.00";
 Scanner scanner = new Scanner( text ).useDelimiter("\\s*,\\s*");
 int checkNumber = scanner.nextInt(); // 4231
 String description = scanner.next(); // "Java Programming"
 float amount = scanner.nextFloat(); // 1000.00
/* Here, we’ve told the Scanner to use our regular expression as the delimiter and then
called it repeatedly to parse each field as its corresponding type. The Scanner is conve‐
nient because it can read not only from Strings but directly from stream sources, such
as InputStreams, Files, and Channels: */
 Scanner fileScanner = new Scanner( new File("spreadsheet.csv") );
 fileScanner.useDelimiter( "\\s*,\\s* ");
 // ...
// Another thing that you can do with the Scanner is to look ahead with the “hasNext”
// methods to see if another item is coming:
 while( scanner.hasNextInt() ) {
 int n = scanner.nextInt();
 ...
 }


