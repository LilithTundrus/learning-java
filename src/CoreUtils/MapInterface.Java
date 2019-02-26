/* 
The Collections Framework also includes the java.util.Map, which is a collection of
key/value pairs. Other names for map are “dictionary” or “associative array.” Maps store
and retrieve elements with key values; they are very useful for things like caches or
minimalist databases. When you store a value in a map, you associate a key object with
a value. When you need to look up the value, the map retrieves it using the key.
With generics, a Map type is parameterized with two types: one for the keys and one for
the values. The following snippet uses a HashMap:
*/

Map<String, Date> dateMap = new HashMap<String, Date>();
dateMap.put( "today", new Date() );
Date today = dateMap.get( "today" );

/* 
The basic operations on Map are straightforward. In the following methods, the type K
refers to the key parameter type and the type V refers to the value parameter type:

public V put( K key , V value )
This method adds the specified key/value pair to the map. If the map already con‐
tains a value for the specified key, the old value is replaced and returned as the result.

public V get( K key )
This method retrieves the value corresponding to key from the map.

public V remove( K key )
This method removes the value corresponding to key from the map. The value
removed is returned.

public int size()
Use this method to find the number of key/value pairs in this map.
You can retrieve all the keys or values in the map:

public Set keySet()
This method returns a Set that contains all the keys in this map.

public Collection values()
Use this method to retrieve all the values in this map. The returned Collection can
contain duplicate elements.

Map has one child interface, SortedMap. A SortedMap maintains its key/value pairs sorted
in a particular order according to the key values. It provides the subMap(), headMap(),
and tailMap() methods for retrieving sorted map subsets. Like SortedSet, it also pro‐
vides a comparator() method, which returns an object that determines how the map
keys are sorted. We’ll talk more about that later. Java 7 adds a NavigableMap with func‐
tionality parallel to that of NavigableSet; namely, it adds methods to search the sorted
elements for an element greater or lesser than a target value.


One very imporetant thing to note is that Map is not literally a type of collection despite being related

The ConcurrentMap interface is part of the java.util.concurrent package. It extends
the base Map interface and adds atomic put, remove, and replace functionality that is
useful for concurrent programming
*/