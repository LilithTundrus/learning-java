/* 
Collections are data structures that are fundamental to all types of programming. When‐
ever we need to refer to a group of objects, we have some kind of collection. At the core
language level, Java supports collections in the form of arrays. But arrays are static and
because they have a fixed length, they are awkward for groups of things that grow and
shrink over the lifetime of an application. Arrays also do not represent abstract rela‐
tionships between objects well. In the early days, the Java platform had only two basic
classes to address these needs: the java.util.Vector class, which represents a dynamic
list of objects, and the java.util.Hashtable class, which holds a map of key/value
pairs. Today, Java has a more comprehensive approach to collections called the Collec‐
tions Framework. The older classes still exist, but they have been retrofitted into the
framework (with some eccentricities) and are generally no longer used.

Though conceptually simple, collections are one of the most powerful parts of any pro‐
gramming language. Collections implement data structures that lie at the heart of man‐
aging complex problems. A great deal of basic computer science is devoted to describing
the most efficient ways to implement certain types of algorithms over collections. Hav‐
ing these tools at your disposal and understanding how to use them can make your code
both much smaller and faster. It can also save you from reinventing the wheel.
Prior to Java 5, the Collections Framework had two major drawbacks. The first was that
—not having generic types to work with—collections were by necessity untyped and
worked only with anonymous Objects instead of real types like Dates and Strings. This
meant that you had to perform a type cast every time you took an object out of a col‐
lection. This flew in the face of Java’s compile-time type safety. But in practice, this was
less a problem than it was just plain cumbersome and tedious. The second issue was
that, for practical reasons, collections could work only with objects and not with prim‐
itive types. This meant that any time you wanted to put a number or other primitive
type into a collection, you had to store it in a wrapper class first and unpack it later upon
retrieving it. The combination of these factors made code working with collections less
readable and more dangerous to boot.

This all changed with the introduction of generic types and autoboxing of primitive
values. First, the introduction of generic types, as we described in Chapter 8, has made
it possible for truly typesafe collections to be under the control of the programmer.
Second, the introduction of autoboxing and unboxing of primitive types means that
you can generally treat objects and primitives as equals where collections are concerned.
The combination of these new features can significantly reduce the amount of code you
write and add safety as well. 
*/

/* 
The mother of all collections is an interface appropriately named Collection. It serves
as a container that holds other objects, its elements. It doesn’t specify exactly how the
objects are organized; it doesn’t say, for example, whether duplicate objects are allowed
or whether the objects are ordered in any way. These kinds of details are left to child
interfaces. Nevertheless, the Collection interface defines some basic operations com‐
mon to all collections:

public boolean add( element )
This method adds the supplied object to this collection. If the operation succeeds,
this method returns true. If the object already exists in this collection and the
collection does not permit duplicates, false is returned. Furthermore, some col‐
lections are read-only. Those collections throw an UnsupportedOperationExcep
tion if this method is called.

public boolean remove( element )
This method removes the specified object from this collection. Like the add()
method, this method returns true if the object is removed from the collection. If
the object doesn’t exist in this collection, false is returned. Read-only collections
throw an UnsupportedOperationException if this method is called.

public boolean contains( element )
This method returns true if the collection contains the specified object.

public int size()
Use this method to find the number of elements in this collection.

public boolean isEmpty()
This method returns true if this collection has no elements.

public Iterator iterator()
Use this method to examine all the elements in this collection. This method returns
an Iterator, which is an object you can use to step through the collection’s ele‐
ments. We’ll talk more about iterators in the next section.


Additionally, the methods addAll(), removeAll(), and containsAll() accept another
Collection and add, remove, or test for all of the elements of the supplied collection.
*/


/* When using generics, the Collection type is parameterized with a specific type of el‐
ement that the collection will hold. This makes a generic collection of “anything” into
a specific collection of some type of element. The parameter type becomes the compiletime type of the element arguments in all of the methods of Collection (in this case,
the add(), remove(), and contains() methods listed earlier). For example, in the fol‐
lowing code, we create a Collection that works with Dates: */
 Collection<Date> dates = new ArrayList<Date>(); // = new ArrayList<>() would
 // also work.
 dates.add( new Date() );


/*  Converting between collections and arrays is simple. For convenience, the elements of a
 collection can be retrieved as an array using the following methods: */
  public Object[] toArray()
  public <E> E[] toArray( E[] a )
 