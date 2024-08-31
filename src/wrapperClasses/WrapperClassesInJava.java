package wrapperClasses;

public class WrapperClassesInJava {
    public static void main(String[] args) {
        //Wrapper Class: A wrapper class in Java is a class whose object wraps or contains primitive datatypes. When we
        //create an object of a wrapper class, it contains a field and in this field we store primitive datatypes.
        //Need of Wrapper Classes:
           //- The classes in java.util package handles only objects and hence wrapper classes help
           //  in that case.
           //- Data structures in the Collection framework, such as ArrayList and Vector, store only objects
           // (reference types) and not primitive types.
           //- An object is needed to support synchronization in multithreading.

        //Autoboxing and Unboxing:
        /*
        The automatic conversion of primitive types to the object of their corresponding wrapper classes is known as
        autoboxing. For ex- conversion of int to Integer, long to Long, etc.

        Unboxing is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its
        corresponding primitive type is known as unboxing.
         */

//        Integer obj1 = new Integer(12); This was also a way of making object of wrapper class, but is deprecated now.
        Integer obj2 = Integer.valueOf(13); //Recommended way of making objects of Integer wrapper class
        Integer obj3 = 14; //This is autoboxing because primitive value 14 is automatically converted to Integer object.

        int obj4 = obj3; //Unboxing

        //valueOf() method is present in all Wrapper classes. The purpose of this method in each wrapper class is to
        //convert a primitive value or a String to an object of the corresponding wrapper class, often using caching to
        //improve performance. valueOf() method accepts only 2 kinds of arguments - either a string, or primitive
        //datatype of their class.
//        https://chatgpt.com/c/6213545a-ceed-45c9-888d-3f9f7cfaeae4



    }

}
