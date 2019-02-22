/* Objects are allocated with the new operator using an object constructor. A constructor
is a special method with the same name as its class and no return type. It’s called when
a new class instance is created, which gives the class an opportunity to set up the object
for use. Constructors, like other methods, can accept arguments and can be overloaded
(they are not, however, inherited like other methods) */
class Date {
    long time;

    Date() {
        time = currentTime();
    }

    Date(String date) {
        time = parseDate(date);
    }
    // ...
}


/* 
Java will always choose the constructor that matches the number of given arguments
*/
