package methods;

public class BasicsOfMethods {
    public static void main(String[] args) {
//       functions inside a class is called a method


        /*
        Methods in Java are blocks of code that perform a specific task, are defined within a class, and can be called
        to execute when needed.

        Method Signature: A method signature includes method name and parameter list. It does not include return type or
        access modifier. Two methods in same class cannot have same method signature.

        Pass-by-value: In Java, method parameter are passed by value not by reference, meaning a copy of the argument is
        passed to the method. Changes made to the parameter do not affect the original argument.

        Static methods: Static methods belong to the class rather than an instance of the class. They can be called
        without creating an instance of the class. Static methods cannot access non-static members, they can only access
        static members.

        Instance methods: They require an object of the class to be called. They operate on the instance variables of
        the class.

        Final methods cannot be overridden by subclasses.

        Abstract methods are declared without an implementation and must be implemented by subclasses. They are defined
        in abstract classes.

        */

       //Components of a method:
        /*
        1) Access modifier: They determine visibility and accessibility of classes, methods and variables.
             - public classes, methods and variables can be accessed from any class in any package.
             - protected: This access modifier cannot be applied to classes. Protected members can be accessed within
                          the same package and by subclasses (including those in different packages).
             - default classes and members are accessible only within their own package.
             - private: This access modifier cannot be applied to classes. Private members can be accessed only within
                        the class they are declared in.

        2) static/non-static: static methods can access only static methods and variable. We don't need to instantiate
           a class to access static methods.
        3) Return type: A method can return a value of specified type. After return is called, program flow moves out of
           that method.
        4) Method name: A method should be named according to conventions of naming a variable.
        5) Parameter and Arguments: Parameters are the variables defined during method declaration while arguments are
           actual value passed to the method when it is called.


         */
        //https://chatgpt.com/c/cf24995d-10e6-4172-bac8-5ba45fab3bb9

        //Random value between 2 numbers a and b:
//        Math.random() * (b - a + 1) + a;

    }
}
