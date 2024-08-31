package collection_framework.collectionAndQueue;

import java.util.LinkedList;
import java.util.Queue;

//Java Queue Interface, Java Queue using LinkedList, Java PriorityQueue, Java ArrayDeque
public class LearnQueue {
    public static void main(String[] args) {
        //Java Queue Interface: The Queue interface of Java collections framework provides the functionality of the
        //queue data structure. It extends Collection interface.
        //LinkedList class implements both List and Queue interfaces, thus allowing insertion and removal at both ends.
        //That is why LinkedList class has properties of both List and Queue.
        //PriorityQueue orders elements according to their natural ordering or by a comparator provided at queue
        //construction time.
        //ArrayDeque is a resizable array implementation of the Deque(Double Ended Queue) interface, which can be used
        //as a stack, queue or deque


        /*
        Java Queue Interface methods:

        1) boolean add(E e): Inserts the specified element into the queue.
        2) boolean offer(E e): Inserts the specified element into the queue. Returns true if element was added
           successfully, or false if queue is full.
           -> Both add() and offer() do the same thing, but add() throws an exception if somehow we fail to add an
              element, whereas offer() returns true or false. So we should use offer() to avoid headache of handling
              exceptions.
        3) E remove(): Removes and returns the element at the front of the queue, throws an exception if queue is empty.
        4) E poll(): Removes and returns the element at the front of the queue. Returns null if the queue is empty.
           -> Both remove() and poll() do same thing of removing element from front of queue. remove() throws exception
              if queue is empty, whereas poll() only returns null, so we should use poll() while solving DSA questions
              to avoid headache of handling exceptions.
        5) E element(): Retrieves but does not remove the element at the front of the queue, throws exception if queue
           is empty.
        6) E peek(): Retrieves but does not remove the element at the front of the queue. Returns null if the queue is
           empty.
           -> Here also, we should use peek() more often to avoid handling exceptions.
         */

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());

        //traverse in queue
        while(!q.isEmpty()) {
            System.out.println(q.poll());
        }
        System.out.println(q.poll()); //If I would have used remove() here, exception would have occurred.





        //https://chatgpt.com/c/c94863f8-a970-44b9-923c-33e1fc90e694

    }
}
