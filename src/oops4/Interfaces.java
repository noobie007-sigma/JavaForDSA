package oops4;

public class Interfaces {
    public static void main(String[] args) {
        //Java Interfaces: An interface is a fully abstract class (Though it is not a class which can be instantiated or
        //extended by a class). It includes a group of abstract methods (methods without a body). We use the interface
        //keyword to create an interface in Java.

        //Like abstract classes, we cannot create objects of interfaces. To use an interface, other classes must
        //implement it. We use implements keyword to implement an interface.

        //Before Java 8, interfaces used to provide 100% abstraction, but now they also allow default methods to be
        //defined in an interface. After Java 8, interfaces can have default methods and static methods and after
        //Java 9, interfaces can also have private methods.

        //Default methods: They are just already implemented methods in the interfaces. Objects of classes that
        //implement an interface can use these methods and override them also.

        //Static methods: Both abstract classes and interfaces can have static methods. These methods belong to the
        //abstract class or interface itself. To use static methods of an interface, we don't need any class to
        //implement it and then make an object of it, we can directly do InterfaceName.methodName(). And to use static
        //method of an abstract class, we don't need a subclass to extend it, then instantiate that class, we can
        //directly call static method through abstract class itself as AbstractClass.methodName().

        //Access Modifiers of methods in an Interface and Abstract class:
        // - All the methods in an interface are by default public, except private methods. We cannot use any other
        //   access modifier for methods in interfaces.
        // - Whereas we can explicitly define access modifiers of fields and methods in abstract classes.
        // - Default methods and static methods in an interface are implicitly public, but private methods, which are
        //   used within default methods to share code between them, are private.
        // - All fields in an interface are implicitly public static and final.
        // - In an abstract class, a method can be public/protected/default/private, but only concrete
        //   methods can be private, not abstract methods.
        // - Private fields in an abstract class are meant to be used only within that abstract class, they cannot be
        //   used by any of its subclasses.


        //Abstract classes can have constructors which will be invoked whenever its subclasses are instantiated, but an
        //interface cannot have constructors.

        //Advantage of interfaces over abstract classes is that a class can only extend one single class, which is going
        //to be an abstract class in this case, whereas, a class can implement any number of interfaces.



        //Use abstract classes when you have a base class that should not be instantiated on its own, and you want to
        //provide common functionality to subclasses.
        //Use when you need to define a common template that can be partially implemented by the abstract class and
        //further defined by concrete subclasses. For ex- Vehicle has a common functionality that it runs on some fuel,
        //has breaks, wheels, etc. Car, Scooter, Train, etc. have same base class Vehicle.
        //Another use case is Template method pattern, where we have a functionality which has been broken down into
        //steps, and some steps are same for all subclasses while others are specific to each subclass.

        //Use interfaces when you need to define a contract that multiple classes can implement, potentially from
        //different class hierarchies. Interfaces are ideal for defining capabilities or behaviours that can be shared
        //across different classes. Also, when we want to create a creature that can fly, swim, walk, dance etc., we use
        //interfaces. Also, to enhance existing classes, we use interfaces.

        //https://chatgpt.com/c/c2ba82d1-dece-484c-87eb-1846bc118b99


        //Multiple Inheritance: Java Interfaces allow multiple inheritance. But if 2 interfaces that are implemented in
        //a class, have a method in common, then what will happen?
        //Any class that implements an interface, will of course define all the methods. So the common method will have
        //only one implementation to avoid any ambiguity.



        //Point to Note: In Java, a class can implement interfaces as well as extend classes, but we need to declare
        //extends before implements.


        Duck duck1 = new Duck();
        duck1.fly();
        duck1.swim();
        duck1.eat();

        System.out.println("Duck has " + Bird.wings + " wings and " + Fish.eyes + " eyes.");
//        Bird.wings = 3; Even if I do not declare it final, all fields are by default implicitly public static and
//        final in an interface.


        //Why default methods were introduced in Java? Because since change is the constant, our application made in Java
        //will also need to be kept updated. So if 5 classes have implemented an interface, and while updating, I add
        //a new method in the interface, then there will be error in all those 5 classes. So to avoid this error, Java
        //introduced default methods which can have their own definition and implementing classes can override them if
        //required.
    }
}

interface Bird {
    void fly();
    void eat();
    public static final int wings = 2; //these fields can be accessed directly through interface and cannot be changed.


}
interface Fish {
    void swim();
    void eat();
    int eyes = 2;
}
class Duck implements Bird, Fish{

    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }

    @Override
    public void eat() {
        System.out.println("Duck eats"); //eat() is common in both interfaces, but no ambiguity because we have only one
        //implementation of eat().
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }


}
