package oops3.learnEncapsulation;
import oops3.learnPackages.Person;

public class Encapsulation {
    //Java Encapsulation: Encapsulation refers to the bundling of fields and methods inside a single class. It prevents
    //outer classes from accessing and changing fields and methods of a class. This also helps to achieve data hiding.


    //Data Hiding: Data hiding is a way of restricting the access of our data members by hiding the implementation
    //details. Encapsulation also provides a way for data hiding. We can use access modifiers to achieve data hiding.

    //NOTE: People often consider encapsulation as data hiding, but that's not entirely true, Encapsulation refers to
    //the bundling of related fields and methods together. This can be used to achieve data hiding. Encapsulation in
    //itself is not data hiding.


    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(21);
        System.out.println(p1.getAge());
    }


    //static keyword: If we want to access class members without creating an instance of the class, we need to declare
    //the class member as static. Static variables can be accessed by calling the class name of the class. There is no
    //need to create an instance of the class for accessing the static variables because static variables are class
    //variables and are shared among all the class instances.

    //Static Variables:
    /*
    - Only a single copy of the static variable is created and shared among all the instances of the class.
    - Because it is a class level variable, memory allocation of such variables only happens once when the class is
      loaded in the memory. All the static things get allocated memory at compile time. Memory allocation for objects
      happens during runtime.
    - If an object modifies the value of a static variable, the change is reflected across all objects.
    - Static variables can be used in any type of method, static or non-static.
    - Non-static variables cannot be used inside static methods, it will throw a compile-time error.
     */

    //Static Methods:
    /*
    - The static members and methods belong to the class rather than the instance of the class. When the implementation
      of the particular method is not dependent on the instance variables and instance methods, in this case we can make
      that method as static.
    - They are accessed by the name of their class.
    - The keywords such as this and super are not used in the body of the static method. Because this refers to current
      object and super calls constructor of parent object. If object is not created, how can we refer to current object
      or call parent object's constructor.
    - The modification of the static field value is not allowed (It is allowed, but not encouraged).

     */

    //Static Block:
    //Generally, class is loaded first then main method is loaded and then execution starts. But if you want to run
    //something, even before the main method, when class is loaded into the memory, use static block.
    //If there are multiple static blocks, they will get executed line by line as they appear.

    static {
        System.out.println("Called from static block");
    }
}
