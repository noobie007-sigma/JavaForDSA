package oops3.learnPackages;

public class Person {
    private int age;
    private String name;

    boolean canBeChanged = true;
    public void setAge(int age) {
        if(canBeChanged) {
            if(age > 0) {
                this.age = age; // in this way we can control when we can allow to change values
                //Encapsulation is not data hiding, but data hiding is a part of encapsulation.
                //In encapsulation, we bundle similar data together. Also, we can achieve data hiding using access
                //modifiers in front of properties and behaviours.
            }
        }
    }


    public int getAge() {
        return age;
    }
}
