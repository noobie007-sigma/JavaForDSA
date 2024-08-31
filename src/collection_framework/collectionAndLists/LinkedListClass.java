package collection_framework.collectionAndLists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    public static void main(String[] args) {
        //Java LinkedList:
        /*
        The LinkedList class of the Java collection framework provides the functionality of the lined list data
        structure(doubly linked list).
        Elements in the linked lists are not stored in sequence. Instead, they are scattered and connected through links
        (prev and next).


        LinkedList implements List and Deque interfaces. As List, it supports operations like adding, removing and
        accessing elements by index. And as a Deque, it supports operations for adding, removing and examining elements
        at both ends.
        Each element is stored in a node, which contains reference to the previous and next node.

        LinkedList() constructs an empty list. LinkedList(Collection<? extends E> c) constructs a list containing the
        elements of the specified collection, in the order they are returned by the collection's iterator.

        Common methods:
        1) List operations:
          boolean add(E e), void add(int index, E element), E get(int index), E set(int index, E element),
          E remove(int index), boolean remove(Object o), int size(), void clear()

        2) Deque operations:
          - void addFirst(E e): Inserts specified element at the beginning of list
          - void addLast(E e): Appends the specified element to the end of list
          - E getFirst()
          - E getLast()
          - E removeFirst()
          - E removeLast()
          - boolean offerFirst(E e): Inserts specified element at the beginning of list
          - boolean offerLast(E e): Inserts specified element at the end of list
          - E pollFirst(): Retrieves and removes first element of list, returns null if list is empty
          - E pollLast(): Retrieves and removes last element of list, returns null if list is empty
          - E peekFirst(): Retrieves but does not remove first element of list, returns null if list is empty
          - E peekLast(): Retrieves but does not remove last element of list, returns null if list is empty
         */

//        https://chatgpt.com/c/920f2ca2-4e1f-4238-a34e-dccc02818c04

        List<Integer> ll = new LinkedList<>();

    }
}
