/* 
Objects and primitive types in Java can be turned into a default textual representation
as a String. For primitive types like numbers, the string should be fairly obvious; for
object types, it is under the control of the object itself. We can get the string

representation of an item with the static String.valueOf() method. Various overloaded 
versions of this method accept each of the primitive types: */
String one = String.valueOf( 1 ); // integer, "1"
String two = String.valueOf( 2.384f ); // float, "2.384"
String notTrue = String.valueOf( false ); // boolean, "false"

/* 
All objects in Java have a toString() method that is inherited from the Object class.
For many objects, this method returns a useful result that displays the contents of the
object. For example, a java.util.Date object’s toString() method returns the date it
represents formatted as a string. For objects that do not provide a representation, the
string result is just a unique identifier that can be used for debugging. The String.val
ueOf() method, when called for an object, invokes the object’s toString() method and
returns the result. The only real difference in using this method is that if you pass it a
null object reference, it returns the String “null” for you, instead of producing a Null
PointerException
*/