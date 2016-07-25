
package linkedlist;

import java.util.Iterator;

/*
 * @author Misha
 */

interface MyList<T> extends Iterable<T>

{ 
     int getCount(); // Number of elements
    T get(int i);   // Get element at index i
    void set(int i, T item);    // Set element at index i
    void add(T item);   // Add element at end
    void insert(int i, T item); // Insert element at index i
    void removeAt(int i);   // Remove element at index i
}
    



 class LinkedListGeneric<T> implements MyList<T> {

    protected int size; // Number of elements in the
    protected Node<T> first, last;

    protected static class Node<U> {
        public Node<U> prev, next;
        public U item;

        Node(U item) {
            this.item = item;
        }

    }

    public LinkedListGeneric() {
        first = last = null;
        size = 0;
    }

    public LinkedListGeneric(T... arr) { }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public T get(int i) {
        return null;
    }

    @Override
    public void set(int i, T item) {

    }

    public void add(T item) {
        insert(size, item);
    }

    public void insert(int i, T item) {
           


    }

    @Override
    public void removeAt(int i) {

    }


    public boolean equals(Object that) {
        return equals((MyList<T>)that);
    }

    public boolean equals(MyList<T> that) {
        return this == that;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
class GenericLinkedList {

    public static void main(String[] args) {
        LinkedListGeneric.Node<String> item = new LinkedListGeneric.Node<String>("Senthil");
        LinkedListGeneric<LinkedListGeneric.Node> linkedList = new LinkedListGeneric<LinkedListGeneric.Node>();

    }
}
