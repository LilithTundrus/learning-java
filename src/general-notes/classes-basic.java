/* Classes are the building blocks of a Java application. A class can contain methods (func‐
tions), variables, initialization code, and, other classes. It serves as
a blueprint for making class instances, which are runtime objects (individual copies)
that implement the class structure. You declare a class with the class keyword. Methods
and variables of the class appear inside the braces of the class declaration: */
class Pendulum {
    float mass;
    float length = 1.0f;
    int cycles;

    float getPosition(float time) {
        // ...
    }
}

/*
 * Methods appear inside class bodies. They contain local variable declarations
 * and other Java statements that are executed when the method is invoked.
 * Methods may return a value to the caller. They always specify a return type,
 * which can be a primitive type, a reference type, or the type void , which
 * indicates no returned value. Methods may take arguments, which are values
 * supplied by the caller of the method.
 */

/*
 * If a local variable and an instance variable have the same name, the local
 * variable shadows or hides the name of the instance variable within the scope
 * of the method. In the fol‐ lowing example, the local variables xPos and
 * yPos hide the instance variables of the same name:
 */
class Bird {
    int xPos, yPos;
    int xNest, yNest;...

 double flyToNest() {
 int xPos = xNest;
 int yPos = yNest:
 return ( fly( xPos, yPos ) );
 }
    // ...
}
// When we set the values of the local variables in flyToNest(), it has no
// effect on the
// values of the instance variables.

/*
 * Variables and method declarations can appear in any order, but variable
 * initializers can’t make “forward references” to other variables that appea
 *  later. Once we’ve defined the Pendulum class, we can create a P
 * ndulum object (an in‐ stance of that class) as follows:
 */
Pendulum p;p=new Pendulum();

/*
When a variable or method inside a Java class is defined as static, it is
shared between ALL instances of that class
Static methods (class methods), like static variables, belong to the class and not to in‐
dividual instances of the class. What does this mean? Well, foremost, a static method
lives outside of any particular class instance. It can be invoked by name, through the
class name, without any objects around. Because it is not bound to a particular object
instance, a static method can directly access only other static members (static variables
and other static methods) of the class. It can’t directly see any instance variables or call
any instance methods


Static methods are particularly useful for utility methods
that perform work that is useful either independently of instances or in working on
instances
 */

/* 
When arguments are passed to a class and that argument is a kind of object, only the reference
is passed, so any changes made in the method with the passed object effects the original object
*/