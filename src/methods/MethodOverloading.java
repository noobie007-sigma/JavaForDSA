package methods;

public class MethodOverloading {
    public static void main(String[] args) {
        //Two or more methods can have the same name inside the same class if they accept different arguments. This
        //feature is known as method overloading.

        //Method overloading can be achieved by either changing the number of arguments or by changing the datatype of
        //arguments. Basically method signature should be different for 2 or more methods to achieve method overloading.
        //That means overloaded methods either should have different number of parameters or datatype of parameters
        //should be different.
        //It is not method overloading if we only change the return type of methods. There must be differences in the
        //number of parameters or type of parameters.

        //Function Overloading happens at compile time, i.e. at compile time it decides which function to call based on
        //type/order of arguments.

        Greet greet1 = new Greet();
        greet1.greetings();
        greet1.greetings("Suyash");
    }
}
class Greet {
    void greetings() {
        System.out.println("Hello, Welcome!");
    }
    void greetings(String name) {
        System.out.println("Hello " + name + ", Welcome!");
    }
}
