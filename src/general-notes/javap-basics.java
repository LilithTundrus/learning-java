/* 
One useful tool that's worth knowing about is the javap CLI command.

Using this tool you can print information about a class by decompiling it

example:

$ javap java.util.Stack

Compiled from "Stack.java"
public class java.util.Stack<E> extends java.util.Vector<E> {
  public java.util.Stack();
  public E push(E);
  public synchronized E pop();
  public synchronized E peek();
  public boolean empty();
  public synchronized int search(java.lang.Object);
}
*/

// This tool is useful if there is little or no documentation on the given code 
// and can also assist with debugging