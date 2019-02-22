/* You can use the special reference this any time you need to refer explicitly to the current
object or a member of the current object. Often you don’t need to use this, because the
reference to the current object is implicit; such is the case when using unambiguously
named instance variables inside a class. But we can use this to refer explicitly to instance
variables in our object,  EVEN IF they are shadowed. The following example shows how
we can use this to allow argument names that shadow instance variable names. This
is a fairly common technique because it saves having to make up alternative names.
Here’s how we could implement our fly() method with shadowed variables: */
class Bird {
    int xPos, yPos;

    double fly(int xPos, int yPos) {
        double distance = Math.sqrt(xPos * xPos + yPos * yPos);
        flap(distance);
        this.xPos = xPos; // instance var = local vra
        this.yPos = yPos;
        return distance;
    }
    // ...
}