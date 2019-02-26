/* 
Java supports integer and floating-point arithmetic directly in the language. Higherlevel math operations are supported through the java.lang.Math class. As you may
have seen by now, wrapper classes for primitive data types allow you to treat them as
objects. Wrapper classes also hold some methods for basic conversions.
First, a few words about built-in arithmetic in Java. Java handles errors in integer arith‐
metic by throwing an ArithmeticException

The special value NaN (not a number) indicates the result of dividing zero by zero. This
value has the special mathematical distinction of not being equal to itself (NaN != NaN
evaluates to true). Use Float.isNaN() or Double.isNaN() to test for NaN.

Basic chart:

Method Argument type(s) Functionality
Math.abs(a)     int, long, float,   double Absolute value
Math.acos(a)    double              Arc cosine
Math.asin(a)    double              Arc sine
Math.atan(a)    double              Arc tangent
Math.atan2(a,b) double              Angle part of rectangular-to-polar coordinate transform
Math.ceil(a)    double              Smallest whole number greater than or equal to a
Math.cbrt(a)    double              Cube root of a
Math.cos(a)     double              Cosine
Math.cosh(a)    double              Hyperbolic cosine
Math.exp(a)     double              Math.E to the power a
Math.floor(a)   double              Largest whole number less than or equal to a Method Argument type(s) Functionality
Math.hypot(a,b) double              Precision calculation of the sqrt() of a2 + b2
Math.log(a)     double              Natural logarithm of a
Math.log10(a)   double              Log base 10 of a
Math.max(a, b)  int, long, float, double The value a or b closer to Long.MAX_VALUE
Math.min(a, b)  int, long, float, double The value a or b closer to Long.MIN_VALUE
Math.pow(a, b)  double              a to the power b
Math.random()   None                Random-number generator
Math.rint(a)    double              Converts double value to integral value in double format
Math.round(a)   float, double       Rounds to whole number
Math.signum(a)  double, float       Get the sign of the number at 1.0, –1.0, or 0
Math.sin(a)     double              Sine
Math.sinh(a)    double              Hyperbolic sine
Math.sqrt(a)    double              Square root
Math.tan(a)     double              Tangent
Math.tanh(a)    double              Hyperbolic tangent
Math.toDegrees(a) double            Convert radians to degrees
Math.toRadians(a) double            Convert degrees to radians
*/