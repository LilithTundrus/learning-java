/* 
An enumeration is an object type in the Java language
that is limited to an explicit set of values. The values have an order that is defined by
their order of declaration in the code, and have a correspondence with a string name
that is the same as their declared name in the source code.
*/

enum Weekday {
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}
// usage
setDay(Weekday.Sunday);

/*
 * Here, Weekday is a subclass of the Enum type with seven static, final,
 * “constant” object references corresponding to our seven enumerated
 * values. Each of the enumerated values is of type Weekday. The Java compiler
 * does not let us extend this class or create any other instances of this type.
 * The only instances of Weekday that will ever exist are the seven enumerated
 * values. This is what gives enumerations their type safety. A method expecting
 * a Week day can be given one of only seven values. Unlike a numeric constant
 * identifier, no value other than a Weekday will work.
 * 
 * Because enumerations are static values, they can be imported with the Java
 * static im‐ port, saving us some typing
 */

// You can get the ordered list of enum values for a type with the static
// values() method.
Weekday [] weekdays = Weekday.values();
