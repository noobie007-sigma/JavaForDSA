package oops4;

public class LearnAbstract {

    //oops4: abstract keyword, abstraction, java interfaces, inner class and nested static class, anonymous class,
    //functional interfaces, lambda expressions

    //abstract means a concept, which doesn't exist in reality - hence abstract classes cannot be instantiated, and
    //abstract methods do not have body.

    //Abstract Classes: The abstract class in Java cannot be instantiated (we cannot create objects of abstract classes).
    //We use abstract keyword to declare an abstract class.
    /*
    - An abstract class can have both the regular methods and abstract methods.
    - A method that doesn't have it's body is known as an abstract method.
    - Though abstract classes cannot be instantiated, we can create subclasses from it. We can access members of the
      abstract class using the object of its subclass.
    - If the abstract class includes any abstract method, then all the child classes inherited from the abstract
      superclass must provide the implementation of the abstract method.
    - Also, if in a normal class, if you have even one abstract method, then that class has to be abstract otherwise it
      will throw error. That means, an abstract method can only be inside an abstract class.
     */


    //Abstraction: Abstraction is an important concept of object-oriented programming that allows us to hide unnecessary
    //details and only show the needed information. This allows us to manage complexity by omitting or hiding details
    //with a simpler, higher level idea.

    public static void main(String[] args) {
//        Vehicle v1 = new Vehicle(); -> instantiation of abstract classes not allowed!
        //Vehicle is an abstract class, i.e. it has abstract methods, which do not have any implementation. That is why
        //abstract classes cannot be instantiated. Though subclasses of an abstract class, which are themselves
        //non-abstract can definitely be instantiated.


        Car car1 = new Car();
        car1.accelerate();
        int numberOfBrakes = car1.brakes(4);
        //To be able to use these methods here, we have to implement them in Car class first.

    }
}
abstract class Vehicle {
    abstract void accelerate(); //abstract methods do not have method body.
    abstract int brakes(int wheels);

    //Abstract classes can have non-abstract methods(concrete methods). We can override this method in child class, if
    //we want, otherwise there is no need to implement this unlike other abstract methods.
    void honks() {
        System.out.println("Vehicle is honking");
    }

}

class Car extends Vehicle {
    @Override //@Override is an annotation jiska sole purpose hota hai method ki spelling check karna. Agar maanlo maine
              //galti se spelling mistake kardi method name me aur koi aise method ko implement kar diya, jo parent
              //class me hai hi nahi.
    void accelerate() {
        System.out.println("Car is accelerating");
    }

    @Override
    int brakes(int wheels) {
        System.out.println("Brakes are applied.");
        return wheels;
    }
    //subclasses of abstract methods must provide implementation of abstract methods of abstract class.

    //Rules for implementing Abstract methods:
    //1) Immediate subclass requirement: If a class inherits from an abstract class, it must either implement all
    //   abstract methods of the abstract class or be declared as abstract itself.
    //2) Propagation of Implementation: Once an abstract method is implemented by a subclass, any further subclasses
    //   down the hierarchy do not need to provide an implementation for that method. However, they can choose to
    //   override it.

}
class Scooter extends Vehicle {

    @Override
    void accelerate() {
        System.out.println("Scooter is accelerating");
    }

    @Override
    int brakes(int wheels) {
        System.out.println("Brakes are applied");
        return wheels; 
    }
}
