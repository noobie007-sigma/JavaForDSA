package collection_framework.comparableAndComparator;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class LearnComparableAndComparators {
    public static void main(String[] args) {
        //Comparable and Comparator:
        //To sort custom objects like Student or Employee, we need to provide explicit sorting logic. To achieve this,
        //Java provides the Comparable and Comparator interfaces. Comparable and Comparator in Java allows us to define
        //custom sorting behaviour for objects, including sorting based on multiple data members.


        //Comparable Interface:
        //This interface is found in java.lang package and contains only one method named compareTo(Object o). It
        //provides a single sorting sequence only, i.e. you can sort the elements on the basis of single data member
        //only. For example, it may be rollNo, name, age or anything else.

        //public int compareTo(Object o): It is used to compare the current object wit the specified object. It returns:
        //- positive integer, if the current object is greater than the specified object.
        //- negative integer, if the current object is less than the specified object.
        //- zero, if current object is equal to the specified object.



        //Comparator Interface:
        //The Comparator interface defines a compare(arg1, arg2) method with 2 argumnts that represent compared objects,
        //and works similarly to the Comparable.compareTo() method.




        Animal a1 = new Animal("Leo", 2, 14);
        Animal a2 = new Animal("Sher", 3, 12);
        Animal a3 = new Animal("Bruno", 5, 18);
        Animal a4 = new Animal("Don", 5, 15);


        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);

        System.out.println(dogs);

        Collections.sort(dogs);

        dogs.sort((o1, o2) ->  o1.name.compareTo(o2.name));
    }
}
class Animal implements Comparable<Animal>{
    String name;
    int age;
    int weight;


    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}' + "\n";
    }

    @Override
    public int compareTo(Animal that) {
        if(this.age == that.age) return this.name.compareTo(that.name);
        return this.age - that.age;
    }
}
