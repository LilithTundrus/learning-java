/* 
Java expands on the concept of abstract methods with interfaces. It’s often desirable to
specify a group of abstract methods defining some behavior for an object without tying
it to any implementation at all. In Java, this is called an interface. An interface defines a
set of methods that a class must implement. A class in Java can declare that it imple‐
ments an interface if it implements the required methods. Unlike extending an abstract
class, a class implementing an interface doesn’t have to inherit from any particular part
of the inheritance hierarchy or use a particular implementation.
*/

/* An interface looks, essentially, like a purely abstract class (i.e., a class with only ab
stract methods). You define an interface with the interface keyword and list its
methods with no bodies, just prototypes (signatures): */
interface Driveable {
    boolean startEngine();

    void stopEngine();

    float accelerate(float acc);

    boolean turn(Direction dir);
}

/*
 * Interfaces define capabilities, so it’s common to name interfaces after t
 * eir capabilities. Driveable, Runnable, and Updateable are good interface
 * names. Any class that imple‐ ments all the methods can then declare that it
 * implements the interface by using a special implements clause in its class
 * definition. For example:
 */
class Automobile implements Driveable {
    // ...
    public boolean startEngine() {
        if (notTooCold)
            engineRunning = true;
        // ...
    }

    public void stopEngine() {
        engineRunning = false;
    }

    public float accelerate(float acc) {
        // ...
    }

    public boolean turn(Direction dir) {
        // ...
    }
    // ...
}

/*
 * Additionally, interfaces can be used to create callback functions in Java by
 * passing methods as arguments by using the right interface
 */

/*
 * Although interfaces mostly allow us to specify behavior without
 * implementation, there’s one exception. An interface can contain constants
 * (static final variables ), which can be referred to directly through the
 * interface name, and which also appear in any class that implements the
 * interface. This feature allows constants to be packaged for use with the
 * methods of the interface:
 */
interface Scaleable {
    static final int BIG = 0, MEDIUM = 1, SMALL = 2;

    void setScale(int size);
}

// An interface can extend another interface, just as a class can extend another
// class. Such
// an interface is called a subinterface. For example:
interface DynamicallyScaleable extends Scaleable {
    void changeScale(int size);
}
