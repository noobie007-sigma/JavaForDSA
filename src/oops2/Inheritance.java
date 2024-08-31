package oops2;
//Topics: Java Inheritance, Method overriding, super keyword, this vs super, final keyword
public class Inheritance extends Vehicle {
    //Java Inheritance: Inheritance is one of the key features of OOP that allows us to create a new class from an
    //existing class This new class created is known as subclass(child or derived class) and the existing class from
    //where the child class is derived is known as superclass(parent or base class).

    //Types of inheritance:
    // Single inheritance: A subclass inherits from one superclass.
    // Multilevel inheritance: A subclass inherits from another subclass, forming a chain.
    // Hierarchical inheritance: Multiple subclasses inherit from a single superclass.

    //Java does not support multiple inheritance i.e. a subclass cannot inherit from more than one superclass to avoid
    //complexity and ambiguity. Instead,  Java provides interfaces to achieve multiple inheritance of type.

    //https://chatgpt.com/c/1e5af8cb-d945-4dfa-86dd-97c3032bd340

    String color;
    @Override
    public void start() {
        //this is the overridden method.
        //If I also want to see the implementation of start method by immediate parent class, use super()
        super.start();
        System.out.println(this.model + " vehicle having " + this.wheelsCount + " wheels is starting");
    }

    Inheritance() {
        //https://chatgpt.com/c/2822facb-9e16-4135-9685-ec753b236999
        //When I instantiate Inheritance class, Inheritance() constructor gets called. But since this is an extended
        //class, hence it will first call superclass (base class) constructor then the subclass constructor.
        //That's why you see Vehicle is being created as the first output, because java automatically inserts a no
        //argument constructor of superclass in constructor of subclass.

        //We have 2 constructors in Vehicle class - no parameters and parameterized.
        //If I want that when I instantiate Inheritance class, then parameterized constructor of Vehicle class should be
        //called, instead of default one (i.e. non parameterized).
        super(6, "Mercedes Benz");
        System.out.println("This is constructor of Inheritance class");

    }

    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        obj.wheelsCount = 4;
        obj.model = "Nano";
        obj.color = "Dark Blue";
        obj.start();
        //We can see that we didn't explicitly define wheels-count, model properties and start behaviour. Since this
        //Inheritance class has extended Vehicle class, so all properties and behaviours of Vehicle class are also
        //accessible to Inheritance class, given that they are not private.

        //Also observe that values of properties are changing as per the changes made. When Inheritance was instantiated,
        //Vehicle was initialised with "Mercedes-Benz" and 6 wheels. But as we moved further in main method, values got
        //updated to "Nano" and 4 wheels.
    }

}
class Vehicle {
    int wheelsCount;
    String model;
    Vehicle() {
        System.out.println("Vehicle is being created");
    }
    Vehicle(int wheelsCount, String model) {
        this.wheelsCount = wheelsCount;
        this.model = model;
        System.out.println(this.model + " vehicle having " + this.wheelsCount + " wheels is starting");

    }
    void start() {
        System.out.println("Vehicle is starting");
    }
}

//super keyword: super is a special keyword in Java that is used to refer to the instance of the immediate parent class.
//  - It is used to refer to an instance variable of the immediate parent class.
//  - It is used to invoke a method of the immediate parent class.
//  - It is used to invoke a constructor of immediate parent class.


//this vs super:
/*
   - this is an implicit reference variable keyword used to represent the current class.
   - this is used to invoke methods of the current class.
   - this is used to invoke a constructor of the current class.
   - this refers to the instance and static variables of the current class.
   - this can be used to return and pass as an argument in the context of a current class object.

   - super is an implicit reference variable keyword used to represent the immediate parent class.
   - super is used to invoke methods of the immediate parent class.
   - super is used to invoke a constructor of the immediate parent class.
   - super refers to the instance and static variables of the parent class.
   - super keyword is used to refer to the immediate parent class and access parent class members, but it cannot be used
     as a reference to be passed to methods or constructors or be returned as return value from methods.
     //https://chatgpt.com/c/94d49afb-3b9f-4ba9-a225-ad74660b0ad3

this and super cannot be used together in a constructor.
super() or this() has to be the first call in a constructor, hence both cannot be used because if I use super() then
this() would become the second call, which is not allowed in Java.
https://chatgpt.com/c/4a309318-fd68-42bf-9198-ff817525aa72

https://chatgpt.com/c/3f48c842-169c-420c-836b-de99374cc6ce
 */


//final keyword in Java:
/*
In Java, the final keyword is a non-access modifier that is used to define entities that cannot be changed or modified.

final variable - variable with final keyword cannot be reassigned.
final method - method with final keyword cannot be overridden by its subclasses.
final class - class with final keyword cannot be extended or inherited from other classes.
 */



