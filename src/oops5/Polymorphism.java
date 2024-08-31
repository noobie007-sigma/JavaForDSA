package oops5;

public class Polymorphism {
    public static void main(String[] args) {
        //Polymorphism allows us to perform a single action in different ways. In other words, polymorphism allows us to
        //define one interface and have multiple implementations.
        //2 types of polymorphism: Compile time polymorphism(Method Overloading) and Runtime polymorphism(Method Overriding)

        Data d1 = new ChildData();
        d1.printData();
        //In inheritance, superclass and subclass follow an  "is a" relationship. Here, an instance of ChildData class
        //is formed.

        //The concept involved with Data d = new ChildData() is called as Polymorphism, more specifically Runtime
        //polymorphism or Dynamic Method Dispatch. Polymorphism allows objects to be treated as instances of their
        //parent class rather than their actual class.

        //Here, Data is the reference type / non-primitive datatype
        //variable d is of type Data, but points to an instance of ChildData

        //Dynamic Method Dispatch: Also known as late binding or runtime polymorphism, is a mechanism by which a call to
        //overridden method is resolved at runtime. This allows Java to support overriding of methods in the subclass
        //and gives ability to invoke the correct method on an object based on the actual object type, not reference type.


        //Data d (Reference Type) determines what methods and properties are accessible at compile time.
        //new ChildData() (Object Type) determines which method implementation is executed at runtime.



        Data d2 = new Data();
        d2.printData();
    }
}

class Data {
    int data;
    public void printData() {
        System.out.println(data);
    }
}
class ChildData extends Data {
    @Override
    public void printData() {
        System.out.println("Overridden data " + data);
    }
}

//https://chatgpt.com/c/8b04c95f-4adb-4ae7-afe9-58db93ab142f