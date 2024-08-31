package oops1;

public class MethodOverloading {
    public static void main(String[] args) {
        //Method Overloading:
        /*
        1) Two or more methods can have same name inside the same class if they accept different arguments. This feature
           is known as method overloading.
        2) Method Overloading is achieved by either:
           - changing the number of arguments.
           - changing the datatype of arguments.
        3) It is not method overloading if we only change the return type of methods. There must be differences in the
           number of parameters.
        4) Method signature should be different for the overloaded methods.
           Method signature consists of method name and parameters. But in method overloading, method name should remain
           same and parameters should differ either in numbers or in datatypes.
        5) Compiler cannot guess which method to call if there are 2 methods having same name and parameters but
           different return types. That is why return type is not considered to be a part of method signature.
         */

        Greet obj = new Greet();
        obj.greetings();
        obj.greetings("Sher");
    }
}

class Greet {
    void greetings() {
        System.out.println("Hello, Good Morning!");
    }
    void greetings(String name) {
        System.out.println("Hello " + name + ", Good Morning!");
    }
}
