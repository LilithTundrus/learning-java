/* 
ARRAYS START AT ZERO

Java arrays, like a lot of languages are denoted by the square brackets []
*/

// Both of these work
int [] array; // preferred
int array []; // C-style

/* 
When not directly specifying an array's lenngth by adding items, the array
is considered empty and has no memory associated to the array's contents yet.

Arrays are special in Java where they can contain reference types like objects


The new operator is used to create an instance of an Array. after that you specify the tpye of 
array and the length
*/

ints = new int [42];

/* 
you can shorten this delcaration pretty easily
*/

double numbers = new double[33];

/* 
Elements in an array of objects are references to the objects—just like individual
variables they point to—but do not actually contain instances of the objects. 

Arrays with objects are also null until the value is assigned at that index'

Unlike something like JS you can get array out of bounds error if accessing a entry after
the array's length
*/


/* 
Below is how to both create and fill an array at the same time:
*/
String[] abcs = {"a", "b", "c"};


/* It’s a common task to copy a range of elements from one array into another. One way
to copy arrays is to use the low-level arraycopy() method of the System class: */
System.arraycopy( source, sourceStart, destination, destStart, length );


// An easier way is to use the java.util.ArrayscopyOf() and copyOfRange() methods:
 byte [] bar = new byte[] { 1, 2, 3, 4, 5 };
 byte [] barCopy = Arrays.copyOf( bar, bar.length );
 // { 1, 2, 3, 4, 5 }
 byte [] expanded = Arrays.copyOf( bar, bar.length+2 );
 // { 1, 2, 3, 4, 5, 0, 0 }

 byte [] firstThree = Arrays.copyOfRange( bar, 0, 3 );
 // { 1, 2, 3 }
 byte [] lastThree = Arrays.copyOfRange( bar, 2, bar.length );
 // { 3, 4, 5 }
 byte [] lastThreePlusTwo = Arrays.copyOfRange( bar, 2, bar.length+2 );
 // { 3, 4, 5, 0, 0 }

/* The copyOf() method takes the original The copyOf() method takes the original array and a target length. 
If the target length is larger than the original array length, 
then the new array is padded (with zeros or nulls) to the desired length. The copyOfRange() takes a starting index (inclusive) and an end‐
ing index (exclusive) and a desired length, which will also be padded if necessary. */


/* Java supports multidimensional arrays in the form of arrays of array type objects. You
create a multidimensional array with C-like syntax, using multiple bracket pairs, one
for each dimension. You also use this syntax to access elements at various positions
within the array. Here’s an example of a multidimensional array that represents a chess
board: */
ChessPiece [][] chessBoard;
chessBoard = new ChessPiece [8][8];
chessBoard[0][0] = new ChessPiece.Rook;
chessBoard[1][0] = new ChessPiece.Pawn;


/* You can create arrays with more than two dimensions. Here’s a slightly im‐
practical example: */
Color [][][] rgbCube = new Color [256][256][256];
rgbCube[0][0][0] = Color.black;
rgbCube[255][255][