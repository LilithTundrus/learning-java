/* 
The standard equals() method can compare strings for equality; they contain exactly
the same characters in the same order. You can use a different method, equalsIgnore
Case(), to check the equivalence of strings in a case-insensitive way:
*/

String one = "FOO";
String two = "foo";
one.equals( two ); // false
one.equalsIgnoreCase( two ); // true

/* 
A common mistake for novice programmers in Java is to compare strings with the ==
operator when they intend to use the equals() method. Remember that strings are
String objects in Java, and == tests for object identity; that is, whether the two arguments being
tested are the same object. In Java, it’s easy to make two strings that have the same
characters but are not the same string object.
*/

/* 
The compareTo() method compares the lexical value of the String to another String,
determining whether it sorts alphabetically earlier than, the same as, or later than the
target string. It returns an integer that is less than, equal to, or greater than zero

The compareTo() method compares strings strictly by their characters’ positions in the
Unicode specification. This works for simple text but does not handle all language var‐
iations well. The Collator class, discussed next, can be used for more sophisticated
comparisons.
*/