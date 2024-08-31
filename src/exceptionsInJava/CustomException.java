package exceptionsInJava;
import java.util.*;
import java.lang.*;

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        try {
            if(age > 150) {
                throw new MyException("Your age cannot be more than 150");
                //Exception class constructor can accept a string argument also. So if you want to pass a message, which
                //will be displayed to the user through getMessage(), you can pass that message like this.
            }
        } catch (MyException e) {
            System.out.println("You are too old to live!");
            System.out.println(e.getMessage());
        }

    }
}
class MyException extends Exception{
    //I am trying to make my own custom exception. So for this, I will have to make a custom exception class, which
    //would be called whenever such exception would occur. This class must extend Exception class. All exception classes
    //are child classes of Exception class.

    String message;
    public MyException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }

}
//throw keyword in Java is used to explicitly throw an exception from any point in the code. It can throw both checked
//and unchecked exceptions. Unchecked exceptions do not need to be declared in a method's throws clause. They can be
//thrown directly.

//throws keyword in Java is used in method signatures to declare that a method might throw one or more exceptions. It
//informs the caller of the method about the exceptions that can be thrown, so the caller can handle them appropriately.