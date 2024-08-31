package collection_framework.collectionAndLists;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        //Java Stack:
        /*
        In stack, elements are stored and accessed in Last In First Out (LIFO) manner. That is, elements are added to
        the top of the stack and removed from the top of the stack.

        - void push(E item): Pushes given item to top of stack
        - void pop(): Removes and returns element at top of stack. Throws EmptyStackException if stack is empty.
        - E peek(): Returns element at top of stack, without removing it. Throws EmptyStackException if stack is empty.
        - boolean empty(): Returns true if stack is empty
         */

        Stack<String> st = new Stack<>();
        //Pehle ki tarah yaha pe List<String> st = new Stack<>() nahi chalega, kyunki isme variable type List hai, jisme
        //push(), pop() methods support karne ki aukaat nahi hai. Stack related methods cannot be called from List type
        //collection. Basically, stack ke methods use karne ke liye stack type ka variable/object banana padega.

        st.push("A");
        st.push("B");
        st.push("C");
        st.push("D");
        System.out.println(st); //elements are printed in the order they were inserted
        System.out.println(st.pop()); //last inserted element got popped out
        System.out.println(st); //updated stack
        System.out.println(st.peek()); // tells element at top of stack
        System.out.println(st); // but seek doesn't pop out the element at tos


//        https://chatgpt.com/c/760fb558-49b1-4b8e-96a7-26d438898e85


    }
}
