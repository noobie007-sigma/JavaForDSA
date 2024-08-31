package oops3.learnPackages2;

import oops3.learnPackages.Teacher;
public class MainInPackage2 extends Teacher {
    public static void main(String[] args) {
        //I want Teacher class here, but it is not available in this package, so I will have to import it.
        Teacher obj = new Teacher();
//        obj.id -> not accessible because it is private field
        obj.teachingClass = 4;
//        obj.degree -> //not accessible because it is default field in Teacher class, that means it is accessible only
//        in that package where Teacher class is defined.

//        obj.studentsCount = 23;
        //If you want to access protected fields in another package, then you will have to do inheritance. In this case,
        //MainInPackage2 class has to inherit Teacher class, to be able to access protected fields.

        MainInPackage2 mainInPackage2 = new MainInPackage2();
        mainInPackage2.studentsCount = 100;
//        mainInPackage2.degree -> degree is not public, so cannot be accessed from outside of class, even if it is
//        subclass of that class.

    }
}
