package basics;

import java.util.Scanner;
public class Main2 {

    public static void main(String[] args) {
        //Taking user input: In order to use the object of Scanner, we need to import java.util.Scanner class.

        Scanner sc = new Scanner(System.in);

        //Scanner class is part of java.util package and is used to read input from various sources such as keyboard input,
        //files, and streams.
        //While creating Scanner object, we pass an input stream to its constructor. Most common one is System.in, which
        //represents the keyboard.

        //Methods of Scanner class:
    /*
    nextInt() - Reads an integer value
    nextLong() - Reads a long integer value
    nextDouble() - Reads a double value
    nextFloat() - Reads a float value
    nextBoolean() - Reads a boolean value
    next() - Reads a single word (a sequence of characters until a space)
    nextLine() - Reads an entire line of text
    nextByte() - Reads a byte value
    nextShort() - Reads a short value
     */

        //It is recommended to close the scanner object once the input is taken using the close() method. This is done when
        //it is no longer needed, too free system resources.

        //Consuming New Line Character: Methods like nextInt(), nextDouble(), etc do not consume newline character after
        //reading input. If you call nextLine() after any of these methods, you need to call nextLine() again ot consume the
        //leftover newline.


        //To take input from a file, create a file object and pass this file into the constructor of Scanner class.


        //if-else statements: If condition inside if is true, if block will run, otherwise else block will run

        //Ternary Operator: condition ? expression1 : expression 2
        int age = 21;
        String type = (age >= 18) ? "You are an adult" : "You are not an adult";
        System.out.println(type);
        //Ternary operator ko as an expression use karna chahiye. Just as above. Ternary operator se operation ke baad
        //kuch value return honi chahiye.


        //Break and Continue in loops:
        //break: If you want to move out of current scope/block, based on some condition, use break.
        //The break statement is used to terminate the loop immediately. When a break statement is encountered inside a
        //loop, the loop stops executing, and the control is transferred to the statement immediately following the loop.

        //continue: Whenever continue statement is encountered in a loop, it skips current iteration and moves to next
        //one.
        //The continue statement skips the current iteration of the loop and proceeds with the next iteration. Unlike
        //break, continue does not terminate the loop but only skips the remaining code inside the loop for the current
        //iteration.

        //labelled break and continue: In Java, labels can be used to identify loops. This feature is particularly
        //useful when working with nested loops, allowing you to control the flow more precisely by specifying which
        //loop to break out of or continue.

        outerLoop:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i == 3 && j == 4) break outerLoop;
                if(i == 2 && j == 1) continue outerLoop;
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}
