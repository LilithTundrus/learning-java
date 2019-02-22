/* Generics are an enhancement to the syntax of classes that allow us to specialize the class
for a given type or set of types. A generic class requires one or more type parameters
wherever we refer to the class type and uses them to customize itself. */

List<String>listOfStrings;
/* In this snippet, we declared a variable called listOfStrings using the generic type List
with a type parameter of String. String refers to the String class, but we could have
specialized List with any Java class type. For example: */
List<Date>dates;List<java.math.BigDecimal>decimals;List<Foo>foos;

//  One or more type variables are declared in the angle bracket (<>) type
//  declaration and used throughout the body and instance methods of the class. For
//  example:
class Mouse {
}

class Bear {
}

class Trap<T> {
    T trapped;

  public void snare( T trapped ) { this.trapped = trapped; }

    public T release() {
        return trapped;
    }
}

// usage
Trap<Mouse> mouseTrap = new Trap<Mouse>();mouseTrap.snare(new Mouse());
Mouse mouse = mouseTrap.release();
/*
 * Here, we created a generic Trap class that can hold any type of object. We
 * used the type variable T to declare an instance variable of the parameter
 * type as well as in the argument type and return type of the two methods.
 */

 /* 
 Java generics are a very powerful and useful addition to the language. As you begin to write
more code using generics, you will find that your code becomes more readable and more
understandable. Generics make explicit what previously had to be inferred from usage.
 */