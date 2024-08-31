package oops2;

public class MethodOverriding {
    public static void main(String[] args) {
        //Method Overriding: If a subclass provides a specific implementation of the method that has been declared by
        //one of its parent class, it is known as method overriding.

        //Method overriding is also known as runtime polymorphism. Hence, we can achieve polymorphism in Java with the
        //help of inheritance.

        //Key points of method overriding:
        /*
        1) Same method signature: Overridden method must have same name, return type and parameters.
        2) Instance Methods:  Only instance methods can be overridden. Static methods and constructors cannot be
           overridden. Static methods also cannot be overridden.
        3) Annotations: @override annotation is used to indicate that a method is intended to override a method in the
           superclass. This helps catch errors at compile time.
        4) Access Modifier: The overriding method cannot have a more restrictive access modifier that the overridden
           method. It can have a less restrictive one.
           - If superclass method is protected, subclass method can be protected or public.
           - If the superclass method is public, subclass method must be public.
         5) Final methods: A method declared as final in superclass cannot be overridden.
         6) Private methods: Private methods remain in that class only, so they are not visible in subclass, hence
            cannot be overridden.
         */

        /*
        class A {
           void start(){
           ..
           }

        }
        class B extends A {
           void start(){
           ..
           }
        }
        class C extends B {
            void start() {
             ..
             }
        }

        While executing C.start(), compiler will first check if start() method exists in class C. If yes, it executes it
        but if not, then it checks for start() method in its immediate parent class, which is class B in this case.
        Similarly, going on, if start() method is not found in even class A, then it checks for this method in Object
        class. This is a concept of Inheritance chaining.

        If I call C.start() and C doesn't have specific implementation of start(), and B also doesn't have, but class A
        has start() implementation, then it will run class A's start() method implementation.
         */
        //https://chatgpt.com/c/1e5af8cb-d945-4dfa-86dd-97c3032bd340


        //super keyword in Java: super is a special keyword in Java that is used to refer to the instance of the
        //immediate parent class.
           //It is used to refer to an instance variable of the immediate parent class.
           //It is used to invoke a method of the immediate parent class.
           //It is used to invoke a constructor of immediate parent class.
    }
}
