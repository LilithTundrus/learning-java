/* 
The java.lang.StringBuilder class is a modifiable and expandable buffer for characters. 
You can use it to create a big string efficiently
*/

StringBuilder sb = new StringBuilder("Hello");
sb.append(" there.");
sb.append(" How are you?");
StringBuilder text = new StringBuilder();
while( (line = readline()) != EOF ) {
    text.append( line );
}
/* Here, the StringBuilder efficiently handles expanding the array as necessary. We can
get a String back from the StringBuilder with its toString() method:
String message = sb.toString(); */


/* 
You should use a StringBuilder instead of a String any time you need to keep adding
characters to a string; it’s designed to handle such modifications efficiently. You can
convert the StringBuilder to a String when you need it, or simply concatenate or print
it anywhere you’d use a String.
*/