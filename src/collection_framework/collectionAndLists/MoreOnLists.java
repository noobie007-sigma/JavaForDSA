package collection_framework.collectionAndLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MoreOnLists {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Kiwi");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Papaya");

        //Iterate through lists:
        //Using normal for loops
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Fruit is " + fruits.get(i));
        }

        //Using for-each loop:
        for (String fruit: fruits) {
            System.out.println("Fruit is " + fruit);
        }

        //Using iterator object:
        Iterator<String> iterator = fruits.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*
        An iterator in the Java Collection Framework is an object that provides a way to traverse or iterate through a
        collection of objects, suc as a list or a set, one element at a time. The Iterator interface is part of the
        java.util package and defines methods for iterating over a collection.
        The Iterator interface provides 3 primary methods:
          1) boolean hasNext():
                   Returns true if there are more elements to iterate over
                   Returns false if the iteration has no more elements
          2) E next():
                   Returns the next element in the iteration.
                   Throws NoSuchElementException if there are no more elements
          3) void remove():
                   Removes the last element returned by the iterator from the underlying collection
                   Can only be called once per call to next()
                   Throws UnsupportedOperationException if the remove operation is not supported by the iterator,


        - Iterators provide a way to traverse a collection without exposing its underlying representation.
        - Using iterator's remove() method avoids potential issues that can arise from modifying a collection while
          iterating over it
        - Iterators can be used with different types of collections, making traversal code more generic and reusable.

        Iterable interface is the root interface for all collection classes, so it can be used by every collection
        The enhanced for loop also, under the hood uses iterator() method to traverse.

        The iterator is initially positioned before the first element of the collection. If iterator.hasNext() is true,
        then iterator.next() is called, which moves the iterator to the first element and returns it.
         */

        //List Iterator:
        /*
        ListIterator: It is an interface that extends Iterator interface, providing additional functionalities for
        iterating over a list. It allows for bidirectional traversal of te list, and supports operations like adding,
        removing and replacing elements.

        - Iterator supports only forward traversal, ListIterator supports both forward and backward traversal of list.
        - ListIterator allows us to get the index of the next and previous elements.
        - Manipulation while traversing is allowed here.

        Methods are:
        1) boolean hasNext()
        2) E next()
        3) boolean hasPrevious(): Returns true if lis iterator has more elements to traverse while traversing in reverse
           direction
        4) E previous(): Returns the previous element in the list and moves the cursor position backwards
        5) int nextIndex(): Returns index of the element that would be returned by a subsequent call to next()
        6) int previousIndex(): Returns index of the element that would be returned by a subsequent call to  previous()
        7) void remove(): Removes the last element from the list that wa returned by next() or previous()
        8) void set(E e): Replaces the last element returned by next() or previous() with the specified element
        9) void add(E e): Inserts the specified element into the list
         */



        //https://chatgpt.com/c/b5f97afd-2f2d-4d26-be61-bb8ee90593cb

    }
}
