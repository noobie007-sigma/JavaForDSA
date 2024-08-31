package oops4;

public class FunctionalInterface {
    public static void main(String[] args) {
        //Functional Interfaces:
        /*
        An interface that contains exactly one abstract method is known as a functional interface. Functional Interfaces
        introduced in Java 8 allow us to use a lambda expression to initiate the interface's method and avoid using
        lengthy codes for the anonymous class implementations.

        A functional interface in Java is an interface that has exactly one abstract method. These interfaces are
        designed to be used with lambda expressions and method references, which provide a clear and concise way to
        express instances of a single-method interfaces(functional interfaces) in line.

        A functional interface can have multiple default and static methods. These methods do not count as abstract
        methods. A functional interface should have only 1 abstract method, but can have any number of static and
        default methods.



         */

        Livable obj1 = () -> {
            System.out.println("Inhale Oxygen and exhale Carbon Dioxide");
        };
        obj1.breathe();
        Eatable obj2 = new Eatable() {
          @Override
          public void khurak(int mealsPerDay) {
                System.out.println("I have " + mealsPerDay + " meals per day");
            }
        };
        obj2.khurak(4);

        //I have implemented Livable and Eatable interfaces above in anonymous classes in 2 different ways. Both ways are
        //correct, but the way Eatable has been implemented, is redundant. It can be replaced by a lambda expression.
        //If we are implementing a functional interface, then it is certain, that interface contains only one method. And
        //if that interface is been implemented by an anonymous class, then it is certain that anonymous class will
        //contain implementation of that single method. So it is better to use lambda expression in that case.
        //Though when interface which is being implemented by an anonymous class is not a functional interface, i.e.
        //contains more than 1 method, then we cannot use lambda expression.

        //https://chatgpt.com/c/3a0fbee0-e6b5-4049-998b-64180f3d31d9
    }
}
@java.lang.FunctionalInterface
interface Livable {
    void breathe();
}
@java.lang.FunctionalInterface
interface Eatable {
    void khurak(int mealsPerDay);

}

//Lambda Expression: Introduced in Java 8, lambda expressions provide aa clear and concise way to represent instances of
//single method interfaces. They enable us to treat functionality as a method argument or treat a code as data.

/*
(int x) -> x + 1               //Single declared type argument
(int x) -> {return x + 1;}     //same as above
(x) -> x + 1                   //Single inferred-type argument, same as below
x -> x + 1                     //Parenthesis optional for single inferred-type case


(String s) -> s.length()       //Single declared type argument
(Thread t) -> {t.start();}     //same as above
s -> s.length()                //Single inferred-type argument
t -> {t.start();}              //Single inferred-type argument


(int x, int y) -> x + y        //Multiple declared-type parameters
(x, y) -> x + y                //Multiple inferred-type parameters
 */
