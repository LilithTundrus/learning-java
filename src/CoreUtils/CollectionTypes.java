/* 
There are multiple child interfaces of the Java collection interface

Set:

Set has no methods besides the ones it inherits from Collection. It simply enforces its
no-duplicates rule. If you try to add an element that already exists in a Set, the add()
method simply returns false. SortedSet maintains elements in a prescribed order; like
a sorted list that can contain no duplicates. It adds the methods add() and remove() to
the Set interface. You can retrieve subsets (which are also sorted) using the subSet(),
headSet(), and tailSet() methods. These methods accept one or a pair of elements
that mark the boundaries. The first(), last(), and comparator() methods provide
access to the first element, the last element, and the object used to compare elements
(more on this later).

List:

The next child interface of Collection is List. The List is an ordered collection, similar
to an array but with methods for manipulating the position of elements in the list:

public boolean add( E element )
This method adds the specified element to the end of the list.

public void add( int index , E element )
This method inserts the given object at the supplied position in the list. If the po‐
sition is less than zero or greater than the list length, an IndexOutOfBoundsExcep
tion will be thrown. The element that was previously at the supplied position, and
all elements after it, are moved up one index position.

public void remove( int index )
This method removes the element at the specified position. All subsequent elements
move down one index position.

public E get( int index )
This method returns the element at the given position.

public Object set( int index , E element )
This method changes the element at the given position to the specified object. There
must already be an object at the index or else an IndexOutOfBoundsException is
thrown.

The type E in these methods refers to the parameterized element type of the List class.
Collection, Set, and List are all interface types. We’ll look at concrete implementations
of these shortly.


Queue:

A Queue is a collection that acts like a buffer for elements. The queue maintains the
insertion order of items placed into it and has the notion of a “head” item. Queues may
be first in, first out (FIFO) or last in, first out (LIFO) depending on the implementation:

public boolean offer( E element )
public boolean add( E element )
The offer() method attempts to place the element into the queue, returning true
if successful. Different Queue types may have different limits or restrictions on el‐
ement types (including capacity). This method differs from the add() method in‐
herited from Collection in that it returns a Boolean value instead of throwing an
exception to indicate that the element cannot be accepted.

public E poll()
public E remove()
The poll() method removes the element at the head of the queue and returns it.
This method differs from the Collection method remove() in that if the queue is
empty, null is returned instead of throwing an exception.
public E peek()
This method returns the head element without removing it from the queue. If the
queue is empty, null is returned.

Java 7 added Deque, which is a “double-ended” queue that supports adding, querying,
and removing elements from either end of the queue (the head or the tail). Dequeue has
versions of the queue methods—offer, poll, and peek—that operate on the first or last
element: offerFirst(), pollFirst(), peekFirst(), offerLast(), pollLast(), peek
Last(). Note that Deque extends Queue and so is still a type of Queue. If you use the plain
Queue methods offer(), poll(), and peek() on a Deque, they operate as a FIFO queue.
Specifically, calling offer() is equivalent to offerLast() and calling poll() or peek()
is the same as calling pollFirst() or peekFirst(), respectively.


Note that there also is a variant of this called the BlockingQueue
*/