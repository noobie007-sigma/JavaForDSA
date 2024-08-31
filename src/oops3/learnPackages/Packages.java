package oops3.learnPackages;

import java.util.*; //util is a sub-package inside main package java. * imports all classes present inside util package.
public class Packages {

    //oops3: Java packages, Access modifiers, Java Encapsulation, data hiding, static keyword.

    //Java Packages: A package is simply a container that groups related types(classes, interfaces, enumerations and
    //annotations). To define a package in Java, we use the keyword package. Java uses file system directories to store
    //packages. For ex- package com.test;
//                   class Test {}
    //here |__com
    //        |__test
    //            |__Test.java

    //Importing a Package: Java has an import statement that allows us to import an entire package or use only certain
    //classes and interfaces defined in the package.
    //import java.util.Date -> imports only Date class
    //import java.io.* -> imports everything inside java.io package
    //In Java, import statement is written directly after the package statement(if any) and before class definition.
    //Packages are generally used to use already defined classes/functionalities provided by the language. It promotes
    //code reusability.

    //https://chatgpt.com/c/b1d3dc0d-fb3b-488b-9e8e-a1a9ffda6da4
    //Refer this for knowing about enums and annotations

    //What properties and methods of a class to export, is decided by the access modifiers.

    //Java Access Modifiers: In Java, access modifiers are used to set the accessibility (visibility) of classes,
    //interfaces, variables, methods, constructors, data members, and the setter methods.


    //default: A default member is accessible to classes only within the same package. Not accessible to classes in
    //different package. Also known as package private.
    //public: A public member is accessible from any part of the program.
    //private: A private member is accessible only within the class in which it is defined. Not visible to any other
    //classes, even those in the same package.
    //protected: A protected member is accessible by classes in the same package and by subclasses, including those in
    //different packages.

    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.teachingClass = 12;
//   obj.teacherID = 23;  -> private field is not accessible here. Only accessible in that class in which it is defined.



    }
}
