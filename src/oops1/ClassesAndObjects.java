package oops1;

public class ClassesAndObjects {
    public static void main(String[] args) {
        //Class is a blueprint which defines some properties and behaviours. An object is an instance of a class which
        //has those properties and behaviours attached.

        //A class is not allocated memory when it is defined. An object is allocated memory when it is created.

        //Class is a logical entity whereas objects are physical entities.

        //A class is declared only once whereas we can create multiple objects of a class.

        //Classes are a sort of non-primitive datatypes in Java.

        //A class is a way to arrange data and behavior information. It is a template that must be implemented by its
        //objects.

        //A class can also be seen as a user-defined datatype where any object of defined datatype has some predefined
        //properties and behaviors.
        
        //Objects are stored in heap memory, and references to those objects are stored in stack memory. But classes are
        //stored in different type of memory known as meta space. It loads the meta-data of the class into meta space
        //when class loader loads that class into main memory.

        //All the objects of a class will share the memory space where all static members are defined of a particular
        //class. Static members are allocated space only once and that space is shared among all objects of that class.






        ComplexNumber num1 = new ComplexNumber(2, 3);
        num1.printComplexNumber();

        ComplexNumber num2 = new ComplexNumber(3, 6);
        num2.printComplexNumber();

        ComplexNumber result = num1.addition(num2);
        result.printComplexNumber();

        ComplexNumber product = num1.multiplication(num2);
        product.printComplexNumber();

    }


}
class ComplexNumber {
    int real;
    int imaginary;

    ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    void printComplexNumber() {

        System.out.println(real + " + " + imaginary + "i");
    }

    ComplexNumber addition(ComplexNumber num2) {
        return new ComplexNumber(real + num2.real, imaginary + num2.imaginary);
    }

    ComplexNumber multiplication(ComplexNumber num2) {
        return new ComplexNumber((real * num2.real) - (imaginary * num2.imaginary), (real * num2.imaginary)
                + (imaginary * num2.real));

    }

    //by making addition and multiplication methods, we learnt that jispe hum method call kar rahe hain, vo object hamare
    //current context me aa jata hai.


}
