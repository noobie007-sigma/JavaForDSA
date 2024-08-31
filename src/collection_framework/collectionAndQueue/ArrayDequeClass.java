package collection_framework.collectionAndQueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeClass {
    public static void main(String[] args) {
        //Java ArrayDeque Class: This class implements Queue interface as well as Deque interface, which implements
        //Queue interface. In short, Deque interface extends Queue interface and ArrayDeque implements Deque interface.
        //So, ArrayDeque class has to implement both Deque interface and Queue interface.
        /*
        1) Adding elements:
           -> addFirst(E e) or offerFirst(E e): Adds an element to the front of deque
           -> addLast(E e) or offerLast(E e): Adds an element to the end of deque.
        2) Removing Elements:
           -> removeFirst() or pollFirst(): Removes and returns the element at the front of deque.
           -> removeLast() or pollLast(): Removes and returns the element at the end of deque.
        3) Accessing elements:
           -> getFirst() or peekFirst(): Returns the element at the front of deque without removing it.
           -> getLast() or peekLast(): Returns the element at the end of deque without removing it.

           * For simplicity, always remember that you should use poll, offer and peek instead of add and remove. Because
             they won't throw exception in case collection is full/empty
         */

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(10);
        dq.offerLast(20); //offer() and offerLast() both do same thing i.e. add element at end
        dq.offerFirst(30);
        dq.offer(40);
        System.out.println(dq); //30, 10, 20, 40
        System.out.println(dq.poll()); //10, 20, 40 -> 30 polled out
        System.out.println(dq.pollFirst()); //20, 40 -> 10 polled out : poll() and pollFirst() are doing same thing i.e.
        //removing element from front
        System.out.println(dq.pollLast()); //10 -> 40 polled out



        //ArrayDeque is a very versatile class. It is a resizable array implementation of Deque interface, which means
        //it can function both as stack(LIFO) and as queue(FIFO). Resizable means it can grow as well as shrink as
        //needed. Stack class extends Vector class, that is why Stack is also synchronized and thread safe, due to which
        //it is slightly slow. So it is recommended to use ArrayDeque for implementing Stack, Queue, and Double Ended
        //Queue data structures.


        //Stack and Queue Operations using ArrayDeque:
        /*
        1) Stack operations:
           -> push(E e): Pushes an element onto the stack represented by the deque.
           -> pop(): Pops an element from the stack represent by the deque.

        2) Queue operations:
           -> add(E e) or offer(E e): Adds an element to the end of the deque, effectively making it a queue.
           -> remove() or poll(): Removes and returns the element at the front of the deque, making it a queue.
         */

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Stack: " + stack);
        System.out.println(stack.pop());
        System.out.println("Stack: " + stack);


        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        System.out.println("Queue: " + queue);
        System.out.println(queue.poll());
        System.out.println("Queue: " + queue);




        //https://chatgpt.com/c/caa08e40-943c-4a73-9483-f51b11f1af17
    }
}
