/* 
Java's types for variables and data are in two distinct camps: 
Primitive and Reference types


Numbers, characters, and Boolean values are fundamental elements in Java (primitive types)

Unlike MANY other object-oriented languages they themselves are not objects

For situations where primitives are needed to behave like objects, wrappers can be used

The main reasoning for primitive types is for optimiztation of the code since basic types can be more 
easily mapped to the hardware of the platform

Primitive types are strictly defined in Java to promote easy portability
(IE an int is always 32-bit signed)

Type    Definition
boolean true or false
char    16-bit, Unicode character
byte    8-bit, signed, two’s complement integer
short   16-bit, signed, two’s complement integer
int     32-bit, signed, two’s complement integer
long    64-bit, signed, two’s complement integer
float   32-bit, IEEE 754, floating-point value
double  64-bit, IEEE 754


A note on floating point percision: 

Java follows the IEEE 754 standard for floating points BUT on platforms that support it more can be done,
it just depends on the platform and the reasonings behind it

Variables are declared inside of methods and classes with a type name followed by one
or more comma-separated variable names
*/

int beh;
float bark, beck;
boolean storageFull;

// Optionally you can of course initiale and assign a value in one line
int test = 5;


/* 
Variables, if assigned no values are assigned default values.

Numeric types always are the matching flavor of zero (0 or 0.00)

Characters are set to the null character \0

Boolean variables are set to false by default


When assigning a variable or using one in an expression with a 'larger' number, the 
other 'smaller' variable is promotoed to the bigger type:
*/

byte b = 42;
int a = 43;
int result = b * a; // b is promoted to int before multiplication

// Note that this can NEVER happen the other way