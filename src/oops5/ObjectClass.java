package oops5;

public class ObjectClass {
    public static void main(String[] args) {
        //Java Object Class:

        /*
        Object class is present in java.lang package. Every class in java is directly or indirectly derived from the
        Object class. If a class does not extend any other class then it is a direct child class of Object and if it
        extends another class then it is indirectly derived. Therefore, Object class methods are available to all Java
        classes. Hence, Object class is the root of the inheritance hierarchy in any java program.
        */


        //toString() method of Object class-
        Car car1 = new Car("BMW 5 series", 2024);
        System.out.println(car1.toString()); // This prints the location of car1 object, but we ca override toString()
        //method.


        //equals() method of Object class-
        Car car2 = new Car("BMW 5 series", 2024);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1 == car2); //false because == checks memory locations of the 2 operands, not their values

        System.out.println(car1.equals(car2)); //this also returns false because default implementation of equals()
        //method uses == to compare 2 objects. We need to override equals() method.
        //After overriding equals() method, it returns true.



        //hashCode() method of Object class:   https://chatgpt.com/c/63c43eb8-925b-4d39-b50b-b1ac61819f09
        /*
        hashCode() method in Java is used to distinguish between different object by providing each object with a
        specific integer value. It's main purpose is to return an integer hash code value for the object, which is used
        in hashing-based collections HashMap, HashSet and HashTable.
        The hashCode() method provides a way for hashing algorithms to distribute objects evenly across a hash table. A
        good hash function should minimize the chances of different objects having same hash codes (collisions).


        Contract between equals() and hashCode():
        1) If 2 objects are equal, they must have same hash code.
        2) If 2 objects have same hash code, they are not necessarily equal.

        So when we are overriding equals() method, we must also override hashCode() method to maintain contract between
        these 2 methods.

         */
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        //Both generated same hash code because both objects are equal.

    }

}
class Car {
    String model;
    int year;
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
//    @Override
//    public String toString() {
//        return "Car model " + this.model + " was released in year " + this.year;
//    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Car that = (Car) obj;
        return this.model.equals(that.model) && this.year == that.year;

    }
    @Override
    public int hashCode() {
        int initialNumber = 31; //any random number
        initialNumber += year;
        initialNumber += model.hashCode();
        return initialNumber;
        //hashCode() method can have different implementations for different same objects. It depends on developer.
        //Basically our idea is to generate an integer number based on their properties.


        //If 2 objects have different year / model, their hash codes will be different.
    }


}
