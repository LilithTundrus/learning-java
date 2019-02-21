/* 
Integer literals can be written in decimal, octal or hex

a decimal integer works like it does in math, being a 0-9 set of numbers
*/

int i = 5555;

/* 
Octal numbers are identified by a leading zero
*/

int i = 01230; // 664 decimal

/* 
Hexidecimal numbers use the convential 0x before the number. (A-F, 0-9)
*/

int i = 0xFFFF; // 65535 in decimal

/* 
Integers in Java are ints unless suffixed with an L character
*/
long l = 32L
long l = 32 // technically an int


/* 
In Java 7.0.1+ you can format ints a bit for readability (this works for hex, octal and decimal)
*/

int test = 1_2_3