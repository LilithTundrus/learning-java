/* The instanceof operator
The instanceof operator can be used to determine the type of an object at runtime. It
tests to see if an object is of the same type or a subtype of the target type. This is the
same as asking if the object can be assigned to a variable of the target type. The target
type may be a class, interface, or array type as we’ll see later. instanceof returns a
boolean value that indicates whether the object matches the type: */
 Boolean b;
 String str = "foo";
 b = ( str instanceof String ); // true, str is a String
 b = ( str instanceof Object ); // also true, a String is an Object
 //b = ( str instanceof Date ); // The compiler is smart enough to catch this!
/* instanceof also correctly reports whether the object is of the type of an array or a
specified interface (as we’ll discuss later):
 if ( foo instanceof byte[] )
 ...
It is also important to note that the value null is not considered an instance of any
object. The following test returns false, no matter what the declared type of the variable: */
 String s = null;
 if (s instanceof String) {

 }
 // false, null isn't an instance of anything