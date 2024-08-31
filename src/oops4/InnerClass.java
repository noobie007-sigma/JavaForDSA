package oops4;

public class InnerClass {
    public static void main(String[] args) {
        //Inner Classes and Nested Static Classes in Java:

        // - An inner class is a non-static nested class that is associated with an instance of the enclosing (outer)
        //   class. It has access to the members (including private members) of the enclosing class.
        // - Since it is non-static, that means it cannot be accessed from static scope.
        // - Since the inner class exists within the outer class, we must instantiate the outer class first, in order to
        //   instantiate the inner class.
        // - Just like other data fields and methods, this class is also a property of the outer class.
        // - An inner class must be defined within the scope of outer class, but outside any method.


        // - A static nested class is a nested class that is declared static. Unlike inner classes, a static nested
        //   class doesn't have a reference to an instance of the enclosing class.
        // - Unlike inner class, a static nested class cannot access the non-static members of the outer class. It is
        //   because the static nested class doesn't require us to create an instance of the outer class.
        // - A static nested class can be instantiated without an instance of its outer class.
        // - It can only access the static members of the outer class directly.


        //1st way to instantiate inner class:
        InnerClass innerClass = new InnerClass();
        Toy toy1 = innerClass. new Toy();

        //2nd way to instantiate inner class:
        Toy toy2 = new InnerClass(). new Toy();

        toy1.price = 100;

        PlayStation ps = new PlayStation(); //Static nested class can be instantiated directly from static scope of
                                            // outer class
        PlayStation ps2 = new InnerClass.PlayStation(); //This is a redundant way of instantiating a static nested class
                                                        //This only improves readability of code.
        ps.price = 20000;
        ps2.price = 25000;
        System.out.println("Price of Play Station: " + ps.price);


        //https://chatgpt.com/c/289cf4d6-5e0f-4a5a-bb11-034b73e6e72c
    }

    class Toy {

        int price;
    }

    static class PlayStation {
        int price;
    }


}
