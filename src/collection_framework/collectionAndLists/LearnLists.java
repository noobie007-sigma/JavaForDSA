package collection_framework.collectionAndLists;
//Java Collection Framework, Java Collection Interface, Java List Interface, Java ArrayList, Java LinkedList,
//Java Vector and Java Stack

import java.util.List;
import java.util.ArrayList;

public class LearnLists {
    public static void main(String[] args) {

        // https://chatgpt.com/c/b5f97afd-2f2d-4d26-be61-bb8ee90593cb

        //Java Collection Framework:
        /*
        The Java collections framework provides a set of interfaces and classes to implement various data structures and
        algorithms. These interfaces include several methods to perform different operations on collections. The Java
        Collection Framework provides a set of classes and interfaces that implement commonly reusable collection data
        structures. These structures include lists, sets, queues and maps. The framework provides both high performance
        implementations and a high level of flexibility and reusability.


        List: An ordered collection (also known as sequence). Allows duplicate elements. ex- ArrayList, LinkedList and
        Vector.

        Set: A collection that cannot contain duplicate elements.

        Queue: A collection used to hold multiple elements prior to processing. Orders elements in a FIFO pattern.
        ex- PriorityQueue, LinkedList.

        Map: An object that maps keys to values. A map cannot contain duplicate keys, and each key can map to at most 1
        value. ex- HashMap, LinkedHashMap, TreeMap, HashTable

                                   +--------------------+
                                   |      Iterable      |
                                   +---------^----------+
                                             |
                                   +---------|----------+
                                   |    Collection       |
                                   +---------^----------+
             +---------------------+         |          +-----------------------+
             |                               |                                  |
+------------|-----------+        +----------|-----------+         +------------|----------+
|        List            |        |        Set           |         |           Queue        |
| +--------------------+ |        | +------------------+ |         | +--------------------+ |
| | ArrayList          | |        | | HashSet          | |         | | PriorityQueue      | |
| | LinkedList         | |        | | LinkedHashSet    | |         | | LinkedList         | |
| | Vector, Stack      | |        | | TreeSet          | |         | +--------------------+ |
| +--------------------+ |        | +------------------+ |         +------------------------+
+------------------------+        +----------------------+                   |
                                             |                              Deque
                                    +------------------+              +------------------+
                                    | SortedSet        |              | ArrayDeque       |
                                    +------------------+              | LinkedList       |
                                                                      +------------------+

                                   +---------------------+
                                   |         Map         |
                                   +----------^----------+
                                              |
                             +----------------|----------------+
                             |                |                |
                       +-----|-----+    +-----|-----+    +-----|---------+
                       | HashMap   |    | TreeMap   |    | LinkedHashMap |
                       +-----------+    +-----------+    +---------------+







         */


        /*
        Collection Interface: The Iterable interface is the root interface of the Java collection framework. The
        Collection interface extends Iterable interface and serves as the base interface for other collection interfaces
        such as List, Set and Queue.
        Collection Framework includes Collection interface as well as Map interface and Iterator interface. Collection
        interface has 3 sub interfaces - List, Set and Queue. Further Set interface has SortedSet interface, and Queue
        interface has Deque interface.
        The collection interface includes various methods that can be used to perform different operations on objects.
         1) int size(): Returns the number of elements in the collection.
         2) boolean isEmpty(): Returns true if the collection contains no elements.
         3) boolean contains(Object o): Returns true if collection contains the specified element/object.
         4) boolean add(E e): Adds the specified element to the collection. Returns true if the collection changed as a
           result.
         5) boolean remove(Object o): Removes a single instance of the specified element from the collection, if present.
         6) boolean containsAll(Collection<> c): Returns true if the collection contains all elements of the specified
           collection. (Subset)
         7) boolean addAll(Collection<> c): Adds all elements from specified collection to the collection. (A+B or Union)
         8) boolean removeAll(Collection<> c): Removes all elements in the collection that are also contained in the
           specified collection. (Set A - Set B or (A - A*B))
         9) boolean retainAll(Collection<> c): Removes all the elements from the collection that are not present in the
           specified collection. (A*B, finds intersection of set A and B).
         10) void clear(): Removes all elements from the collection.
         11) Object[] toArray(): Returns an array object of class Object containing all elements in the collection.

         */



        List<Integer> list = new ArrayList<>();
        //Jab bhi kisi collection ka object banao, to left side me Interface likho aur right side me class ka naam.
        //Isse code flexibility increase hoti hai.
        //https://chatgpt.com/c/b5f97afd-2f2d-4d26-be61-bb8ee90593cb

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        //add() adds new element at the last in an array
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(60));
        System.out.println(list.isEmpty());
        list.remove(2); //removes element at index 2
        list.remove(Integer.valueOf(0)); //removes element/object 1 of type integer
        //remove() is overloaded in this case. If you pass int value(primitive value), it will remove element from that index. If you
        //pass any object, it will remove that specific object from the collection.
        //To remove specific number, we need to convert it into object of type Integer, that is why we used
        //Integer.valueOf().

        List<Integer> newList = new ArrayList<>();
        newList.add(40);
        newList.add(50);
        newList.add(60);
        newList.add(70);

        list.addAll(newList);
        System.out.println(list);
        list.retainAll(newList);
        System.out.println(list);
//        list.removeAll(newList);
//        list.clear();
        Object[] a = list.toArray();
        for(Object o: a) {
            int temp = (int) o;
            System.out.println(temp);
        }
        //removeAll() method removes all occurrences of objects in specified collection from the parent collection.



        /*
        Java List Interface: The List interface extends the Collection interface and adds methods that are specific to
        lists, which are ordered collections that allow duplicate elements.
        4 classes: ArrayList, LinkedList, Stack and Vector implement List interface.

        Here are some methods, that are present in the List interface but not in the Collection interface:
          1) get(int index): Retrieves the element at specified index in the list.
          2) set(int index, E element): Replaces the element at the specified index with the given element.
          3) add(int index, E element): Inserts the specified element at the specified position in the list, shifting
             current elements to the right.
          4) remove(int index): Removes the element at the specified index from the list and shifts the remaining
             elements to the left. We studied about remove() above. This method which takes int as argument, belongs to
             List interface, the one that accepts an object (Object o), is coming from Collection interface, overridden
             in List interface.
          5) indexOf(Object o): Returns the index of the first occurrence of the specified element in the list, or -1 if
             the element is not present.
          6) lastIndexOf(Object o): Returns the index of the last occurrence of the specified element in the list, or -1
             if tge element is not present.
          7) listIterator(): Returns a list iterator over the elements in the list.
          8) listIterator(int index): Returns a list iterator over the elements in the list, starting at the specified
             index.
          9) subList(int fromIndex, int toIndex): Returns a view of the portion of the list between the specified
             fromIndex (inclusive) and toIndex (exclusive).
         */

        System.out.println(newList.subList(1, 4));



        /*
        Java ArrayList: In Java, we need to declare the size of an array before we can use it. Once the size of an array
        is declared, it is hard to change it. To handle this issue, we can use ArrayList class. It allows us to create
        resizable arrays. Unlike arrays, arraylists can automatically adjust their capacity when we add or remove
        elements from them. Hence, arraylists are also known as dynamic arrays.

        Internal Working of ArrayLists:
         Initially, the array has a certain capacity, and as elements are added, it fills up. When the capacity is
         reached, the ArrayList creates a new larger array and copies the elements from the old array to the new one.
         This process of resizing and copying is transparent to the user. However, frequent resizing operations can lead
         to performance overhead, so the ArrayList increases its capacity by a certain factor to minimize the frequency
         of resizing.
         newSize = (oldSize * 3) / 2 + 1;
         */
    }
}
