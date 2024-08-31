package oops1;

public class Constructors {
    public static void main(String[] args) {
        //Constructors: Constructors are invoked implicitly when you instantiate classes. They are used to initialise
        //objects. Whenever an object is created, its constructor is always invoked. There are 2 rules for creating a
        //constructor:
             //1) Name of the constructor should be same as name of class.
             //2) Java constructor should not have a return type.
        //If a class doesn't have a constructor, the Java compiler automatically creates a default constructor during
        //run-time. This default constructor initialises instance variables with default values.
        //Default Constructor - a constructor that is automatically created by the java compiler if it is not explicitly
        //defined.
        //A constructor cannot be abstract or static or final.
        //A constructor can be overloaded but cannot be overridden.


        //this keyword: In Java, this keyword is used to refer to the current object inside a method or a constructor.
        //We mostly use this keyword to remove any ambiguity in variable names. We can also use this to invoke methods
        //of current class or to invoke a constructor of the current class.
        //this keyword stores the reference of the current object.

        //this keyword is used in various contexts within an instance method or a constructor to make code more readable
        //and to avoid ambiguity between instance variables and parameters or local variables.

        //https://chatgpt.com/c/5cb7763e-4b8a-4e15-bc28-5ef7bd5041b6


        Dog dog1 = new Dog("Brownie");
        Dog dog2 = new Dog("Sheru", "Brown");
        System.out.println(dog1); // this prints the reference of object dog1. Same reference is stored in this as well.
        dog1.printDetails();
        dog2.printDetails();


    }
}

class Dog {
    String name;
    String color;
    Dog(String name) {
        this.name = name;
    }
    Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }
    //Constructor Overloading...

    void printDetails() {
        System.out.println(this); //This is done to actually show that this refers to current object on which this
        //method has be called.
        if(this.color == null) {
            System.out.println("Name of Dog is " + this.name);
        } else {
            System.out.println("Name of Dog is " + this.name + " and color is " + this.color);
        }
    }
}
