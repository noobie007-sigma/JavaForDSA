package oops4;

public class AnonymousClass {
    public static void main(String[] args) {
        //Anonymous Classes in Java:
        //In Java, a class can contain another class known as nested class. It is possible to create a nested class
        //without giving it any name. A nested class that doesn't have any name is known as an anonymous class.
        //Anonymous classes usually extend subclasses or implement interfaces.
        //Here type can be:
            //- a superclass that an anonymous class extends.
            //- an interface that an anonymous class implements.

        //In Java, anonymous classes are a way to define and instantiate a class simultaneously. They are used when we
        //need a class for a short period of time, usually to override the methods of a class or interface, and we don't
        //want to write a separate named class. An anonymous class is defined and instantiated in a single expression
        //using the new keyword.

        //https://chatgpt.com/c/abd83a27-12a4-45e7-b766-9bc8a170bb43

        //Creating an anonymous class by extending OuterClass:
        OuterClass obj = new OuterClass() {
            //From this statement it seems that we are creating object obj of OuterClass class, but we are actually
            //creating an anonymous class that is extending its parent class OuterClass. This anonymous class is defined
            //as well as instantiated here itself. This anonymous class cannot be used anywhere else, because it does
            //not even exist by name.
            //A class comes into use when we create its object, because class is just a blueprint. Anonymous class can
            //be instantiated only once, when it is defined. So there exists only 1 object per anonymous class.
            @Override
            public void outerMethod() {
                sing();
                System.out.println("From Anonymous class outerMethod . This is inherited method from its parent class OuterClass");
            }
            public void sing() {
                System.out.println("From Anonymous class sing method. This is its own method defined in Anonymous class");
            }

        };

//        obj.sing(); As you can see, I am not able to call sing() method defined in Anonymous class which is extending
//        OuterClass. In Java, when we create an anonymous class, the resulting object is types as the superclass or
//        interface that the anonymous class is extending or implementing. This means that I can only call the methods
//        defined in the superclass or interface through this reference variable.

        //But this doesn't mean that anonymous classes cannot have their own methods. They can, but they cannot be called
        //using reference variable of its superclass. These methods which are defined inside anonymous classes can only
        //be used inside that anonymous class. Just like I called sing() method from overridden method outerMethod().
        obj.outerMethod();

        SuperInterface obj2 = new SuperInterface() {
            @Override
            public void interfaceMethod() {
                System.out.println("This is the implemented method of interface which has been implemented by an anonymous class");
            }
        };
        //Here it seems like we are creating an object of the interface. But we are actually creating an anonymous class
        //which is implementing this SuperInterface, and object of this anonymous class is referenced at variable obj2.
        //class AnonymousClass implements SuperInterface {}: Here we delete the name of class, because anonymous class
        //do not have name.
        obj2.interfaceMethod();

    }
}

class OuterClass {
    public void outerMethod() {
        System.out.println("From OuterClass");
    }
}


interface SuperInterface {
    void interfaceMethod();
}
