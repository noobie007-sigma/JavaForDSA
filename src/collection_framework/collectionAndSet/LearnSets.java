package collection_framework.collectionAndSet;

import java.util.*;

public class LearnSets {
    public static void main(String[] args) {
        //Java Set Interface: The Set interface of Java Collections Framework provides the features of the mathematical
        //set in Java. It extends the Collection interface. Unlike List interface, sets does not contain duplicate
        //elements. It ensures there are no duplicate elements in out collection.
        //Most implementations of set interface does not guarantee order of elements to remain constant over time.
        //Unlike Lists, sets do not provide a method for retrieving elements by their index since elements are in no
        //particular order.

        //Set interface is implemented by HashSet class and LinkedHashSet class. SortedSet interface extends Set
        //interface which is implemented by TreeSet class.


        //Java Set Interface:
        /*
        1) add(): adds the specified element to the set.
        2) addAll(): adds all the elements of the specified collection to the set.
        3) remove(): removes the specified element from the set.
        4) removeAll(): removes all the elements from the set that is present in another specified set.
        5) retainAll(): retains all the elements in the set that are also present in another specified set.
        6) clear(): removes all the elements from the set.
        7) size(): returns the length (number of elements) of the set.
        8) contains(): return true if the set contains the specified element.
         */


        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(40);
        set.remove(10);

        //all these operations are done in constant time
        System.out.println(set);

        //https://chatgpt.com/c/bfd41e3c-bebb-46e0-9225-93342a21925d

        Set<Integer> orderedSet = new LinkedHashSet<>();
        orderedSet.add(10);
        orderedSet.add(40);
        orderedSet.add(30);
        orderedSet.add(20);
        System.out.println(orderedSet);

        //LinkedHashSet uses Linked list to implement set. Hence, order of elements is maintained here but duplicate
        //elements are still not allowed.
        //In LinkedHashSet, add operation is in constant time, but removing element takes O(n) time complexity. Though
        //we won't be using this too much in DSA.



        Set<Integer> tset = new TreeSet<>();
        tset.add(20);
        tset.add(10);
        tset.add(0);
        tset.add(90);
        tset.add(80);
        System.out.println(tset);
        //all elements added are stored in sorted order, natural sorting, using comparator.
        //here time complexity of operations are O(log n). Because addition, deletion, contain have O(log n) time
        //complexity in a binary search tree.


        //Java HashSet:
        /*
        - In Java, HashSet is commonly used if we have to access elements randomly. It is because elements in a hash table
          are accessed using hash codes.
        - The hash code of an element is a unique identity that helps to identify the elements in a hash table.
        - HashSet cannot contain duplicate elements. Hence, each hash set element has a unique hash code.



         */

        //Java HashSet of Custom Objects:
        //When using Set and HashSet in Java, for the primitive types we can just use it without worry about how to
        //implement the hashcode and the comparison logic. But when we want to use the Set with a custom class by
        //putting custom objects into the set, that custom class has to implement the hashCode() and equals() methods in
        //order for the HashSet to work.

        Set<Student> newSet = new HashSet<>();
        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(2, "Bob");
        newSet.add(s1);
        newSet.add(s2);
        newSet.add(new Student(1, "Bobby")); //element with duplicate rollNo is not added
        System.out.println(newSet);

    }
}

class Student {
    String name;
    int rollNo;

    public Student(int rollNo, String name) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }
}
