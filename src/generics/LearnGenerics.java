package generics;
//https://chatgpt.com/c/24864317-bb35-4b17-b9e1-3905ae523e5e
public class LearnGenerics {
    public static void main(String[] args) {
        //Generics:
        /*
        Generics means parameterized types. Using Generics, it is possible to create classes that work with different
        datatypes. An entity such as class, interface, or method that operates on a parameterized type is generic entity.
        Generics allow us to define classes and methods with placeholder types, which are specified when the classes
        or methods are used. This enhances type safety and reusability by enabling us to write code that can work with
        different datatypes.

         */
        Dog<String, String> dog1 = new Dog<>("Sher123", "Kutta");
        Dog<Integer, Boolean> dog2 = new Dog<>(9211, true);
        System.out.println(dog1.getId());
        System.out.println(dog2.getName());



        //Java Generics Method:
        //Similar to the generics class, we can also create a method that can be used with any type
        //of data. Such a method is known as Generics method.
        //public <T> void genericMethod(T data) {...}
        //Here, the type parameter <T> is inserted after the access modifier and before the return type. We can call the
        //generics method by placing the actual type <String> and <Integer> inside the bracket before the method name.
        //demo.<String>genericMethod("Java");
        //demo.<Integer>genericMethod(21);
        //To make a generic method, you don't need to have a generic class, you can use generic method independently.

        printData("Hello");
        printData(9211);
        //You see that with help of generic methods, I don't have to do method overloading of printData() method to
        //support multiple datatypes. Using concept of generic methods, I can make this method support any kind of
        //datatype supported/available in Java. But remember, that using generics you cannot pass primitive datatypes as
        //type parameters.




    }
    //Generic Method:
    public static <A> void printData(A data) {
        System.out.println(data);
    }
}
class Dog<E, V> {
    //this E, V will be replaced by actual wrapper classes of datatypes or custom classes when this class will be
    //instantiated
    private E id;
    private V name;
    public Dog(E id, V name) {
        this.id = id;
        this.name = name;
    }
    E getId() {
        return this.id;
    }
    V getName() {
        return this.name;
    }

    //T for type, E for element, K for key, V for value.
}

//Bounded Generic Types:
//In general, the type parameter can accept any datatypes (except primitive types). However, if we want to use
//generics for some specific types (such as accept data of number of types) only, then we can use bounded types.
//In case of bounded types, we use the extends keyword.
//Here, GenericsClass is created with bounded type. This means GenericsClass can only work with datatypes that
//are children of Number (Integer, Double, and so on).
//Bounded generics is nothing just us providing some restrictions on what kind of data can be accepted in a generic
//method or a generic class. We just have to replace E by E extends Number or String , etc.


class GenericsClass <T extends Number> {
    public void display() {
        System.out.println("This is a bounded type generics class.");
    }
}

