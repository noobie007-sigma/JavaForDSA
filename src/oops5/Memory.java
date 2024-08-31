package oops5;

public class Memory {
    //https://chatgpt.com/c/8b892b23-e60c-4852-b21f-d0c1fb4e0085
    public static void main(String[] args) {
        //Java Heap Memory:
        //Java Heap space is used by java runtime to allocate memory to Objects and JRE classes. Whenever we create an
        //object, it's always created in the Heap space. Any object created in the heap space has global access and can
        //be referenced from anywhere of the application.


        //Java Stack Memory:
        //Java stack memory contains method-specific values that are short-lived and references to other objects in the
        //heap that is getting referenced from th method. Whenever a method is invoked, a new block is created in the
        //stack memory for the method to hold local primitive values and references to other objects in the method. As
        //soon as the method ends, the block becomes unused and becomes available for the next method. Stack memory size
        //is very less as compared to heap memory.

        //Value of primitive datatypes are stored with the reference variable itself in the stack memory, while value of
        //complex datatypes are stored in heap memory.

        //The class variables, which do not belong to a particular method, can be called by any object of this class,
        //are stored in heap memory, instead of stack. Because, this variable (primitive or non-primitive, doesn't matter)
        //should be accessible to all the objects of this class.


        //Stack memory is considered Thread safe, while Heap memory is not:
        /*
        - The heap is shared by all threads in a Java application. Since multiple threads can access and modify objects
          in the heap concurrently, it can lead to race conditions, where the outcome of operations depends on the
          sequence or timing of uncontrollable events, which can lead to data inconsistency and corruption if proper
          synchronization mechanisms are not used.

        - Since each thread has its own stack, local variables and method calls stored in the stack are not accessible
          by other threads. This isolation makes stack memory inherently thread-safe.
         */



        //Autoboxing and Unboxing in Java:
        /*
        In Java, autoboxing and unboxing are features that facilitate conversion between primitive types and their
        corresponding wrapper classes.

        Each of 8 datatypes in Java have their corresponding wrapper class in java.lang package:
        Byte, Short, Integer, Long, Float, Double, Character, Boolean.

        Autoboxing is the automatic conversion that Java compiler makes between the primitive types and their
        corresponding object wrapper classes.
        For ex- ArrayList<Integer> list = new ArrayList<>();
        list.add(10); Here int 10 is automatically converted to an Integer object.


        Unboxing is the reverse process of autoboxing, where the Java compiler automatically converts the wrapper class
        object back into their corresponding primitive types.
        For ex- Integer intObj = new Integer(100);
                int intValue = intObj;
         */
    }
}
