/* 
An iterator is an object that lets you step through a sequence of values. This kind of
operation comes up so often that it is given a standard interface: java.util.Itera
tor. The Iterator interface has only two primary methods:

public E next()
This method returns the next element (an element of generic type E) of the asso‐
ciated collection.

public boolean hasNext()
This method returns true if you have not yet stepped through all the Collection’s
elements. In other words, it returns true if you can call next() to get the next
element.

*/

// Basic example
public void printElements(Collection c, PrintStream out) {
    Iterator iterator = c.iterator();
    while ( iterator.hasNext() )
    out.println( iterator.next() );
}

/* 
In addition to the traversal methods, Iterator provides the ability to remove an element
from a collection:
public void remove()
This method removes the most recent object returned from next() from the as‐
sociated Collection.
Not all iterators implement remove(). It doesn’t make sense to be able to remove an
element from a read-only collection, for example. If element removal is not allowed, an
UnsupportedOperationException is thrown from this method. If you call remove()
before first calling next(), or if you call remove() twice in a row, you’ll get an Illegal
StateException.
*/