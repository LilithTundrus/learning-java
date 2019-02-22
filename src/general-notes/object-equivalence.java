/* the equals() method determines whether two objects are equivalent. Precisely what that means for
a particular class is something that you’ll have to decide for yourself. Two String objects,
for example, are considered equivalent if they hold precisely the same characters in the
same sequence: */
 String userName = "Joe";
//  ...
 if ( userName.equals( suspectName ) )
 arrest( userName );
// Using equals() is not the same as the “==” operator in Java!

/* 
This statement tests whether the two reference variables, userName and suspectName,
refer to the same object. It is a test for identity, not equality. Two variables that are
identical (point to the same object) will necessarily be equal, but the converse is not
always true. It is possible in Java to construct two String objects with the same contents
that are, nonetheless, different instances of the String class
*/