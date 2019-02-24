/* 
In Java, numbers and Booleans are primitive types—not objects. But for each primitive
type, Java also defines a primitive wrapper class. Specifically, the java.lang package
includes the following classes: Byte, Short, Integer, Long, Float, Double, and
Boolean.
*/

/* These classes hold static utility methods that know how to parse their respective types from
strings. Each of these primitive wrapper classes has a static “parse” method that reads a
String and returns the corresponding primitive type. For example: */
 byte b = Byte.parseByte("16");
 int n = Integer.parseInt( "42" );
 long l = Long.parseLong( "99999999999" );
 float f = Float.parseFloat( "4.2" );
 double d = Double.parseDouble( "99.99999999" );
 boolean b = Boolean.parseBoolean("true");
 // Prior to Java 5.0 use:
 boolean b = new Boolean("true").booleanValue();

/* Alternately, the java.util.Scanner provides a single API for not only parsing indi‐
vidual primitive types from strings, but reading them from a stream of tokens. This
example shows how to use it in place of the preceding wrapper classes: */
 byte b = new Scanner("16").nextByte();
 int n = new Scanner("42").nextInt();
 long l = new Scanner("99999999999").nextLong();
 float f = new Scanner("4.2").nextFloat();
 double d = new Scanner("99.99999999").nextDouble();
 boolean b = new Scanner("true").nextBoolean();


// Note that you can parse between the bas of the numbers (base 10, hex, etc.) by passing them as 
// an argument to Scanner