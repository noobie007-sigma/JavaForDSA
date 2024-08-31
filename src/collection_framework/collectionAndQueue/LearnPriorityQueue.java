package collection_framework.collectionAndQueue;

import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        //https://chatgpt.com/c/3abefeaa-7880-4415-8607-560ff5dfc5e0

        //Priority Queue is a queue in which elements are entered normal First In format. But processing of elements
        //depends on priority basis.

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(40);
        pq.add(10);
        pq.add(20);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        //though I entered 30 first, so 30 should be polled out first in a queue, but since it is a priority queue, by
        //default ordering of elements is done by natural ordering, i.e. smaller ones ahead and bigger ones after
        //smaller ones. So irrespective of the order I am entering elements, they will get settled in a queue based on
        //their natural ordering or by a comparator provided by us to constructor.

        //In the output, we notice that ordering of elements inside a priority queue is not always sorted, but it is
        //made sure that smallest element stays at the front of queue always (at the root of heap internally)

        //We can also pass custom comparator with primitive as well as custom objects. Refer chatgpt link

    }
}
