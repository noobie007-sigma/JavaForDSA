package basics;

public class Main1 {
    public static void main(String[] args) {
        //How a java file executes: https://chatgpt.com/c/90446050-5233-465d-8a04-ccc305a68cef
        //javac compiler present in JDK converts the human-readable java code into byte code.
        //Then class loader of JVM loads the public class into the main memory. It is responsible for loading all
        //necessary classes into the memory.
        //Then byte code verification occurs by JVM to check if the code follows java security standards.
        //Now execution starts. JVM first looks for main method signature in the loaded class. This main method must be
        //public, static, has return type void and should take a single argument of string array.

        //Execution of Java code always starts from main method with signature public static void main(String[] args)
        //present in the public class. That is why all java files have only 1 public class.


        // Java is a platform independent, robust, multithreaded and secure programming language.

        //Java is a robust language: Robustness refers to the language's ability to handle unexpected situations and
        //errors effectively. It can withstand erroneous situations during  a program without crashing or causing
        //severe malfunctions. Instead, it ensures that program continues running in a controlled manner, gracefully
        //recovering from errors. Robustness makes java applications more resistant to failures and better equipped to
        //handle unforeseen situations.

        //Working of a Java program:
        /*
        1) First of all, file saved with .java is compiled by javac compiler. If any compilation error exists, it
           reports it to us, otherwise compiles the java file into bytecode having extension .class
        2) Then this bytecode is sent to JVM, where it is converted to machine-readable 0s and 1s, with the help of some
           libraries and packages present in JRE. Interpreter converts machine independent bytecode into machine
           dependent machine code line by line.

         */

        //JVM: JVM is an abstract machine that enables our computer to run java programs.
        //JRE: JRE is a software package that provides Java class libraries, Java Virtual Machine and other components
        //     that are required to run Java applications.
        //JDK: JDK is a software development kit required to develop applications in Java. In addition to JRE, JDK
        //     contains a number of development tools(compiler, JavaDoc, JavaDebugger, etc.)


        //JDK = (javac, JavaDoc, JavaDebugger) + JRE
        //JRE = Class libraries and additional files + JVM


        //Java keywords: These are reserved words
        //Java variables naming conventions: Should not start with a number. Can have only _ and $ as special
        //characters. It should not be a Java keyword.

        //Java primitive datatypes: They are most basic datatypes in java. They are predefined by Java language
        /*
        boolean: size=1bit, default value=false, stores true or false values
        byte: size=1byte/8bits, default value=0, stores numbers from -128 to 127
        short: size=2bytes/16bits, default value=0, stores numbers from -32768 to 32767
        int: size=4bytes/32bits, default value=0, stores numbers from -2^31 to (2^31 - 1)
        long: size=8bytes/64bits, default value=0L, stores numbers from -2^63 to (2^63 - 1)
        float: size=4bytes/32bits, default value=0.0f, stores fractional numbers upto 6-7 decimal digits
        double: size=8bytes/64bits, default value=0.0, stores fractional numbers upto 15 decimal digits
        char: size=2bytes/16bits, default value='\u0000', stores single character/letter/ASCII values. Stored in ''
         */


        //Type casting:
        //Long to float is implicit conversion: Though float is 4bytes as compared to long which is 8bytes, still it is
        //implicit. This is because, float can represent wide range of values. When long is converted to float, there is
        //some loss of precision, but still long number can be represented in float. Every integer can be expressed in
        //scientific notation n X 10^m, but there will be some loss of precision.

        //If you are assigning out of range value to a variable (ex- byte a = 150), this will throw an error. But if
        //an expression's result is out of range, then value gets rotated. Error is not thrown but results are unexpected
        //Also doesn't matter what datatypes are of variables a and b, during expression, they are treated as integers
        //only. You have to type case them to store them in another datatype variable.

        byte a = 3;
        byte b = 50;
        byte c = (byte) (a * b);
        System.out.println(c);

        //In Java, unlike other languages, there is no type conversion involving boolean datatype. Therefore, there is
        //no concept of truthy and falsy values in Java, because Java is strictly types language unlike JavaScript or
        //Python.

        int variableA = 12;
        int variableB = 7;
        double result = (double)variableA / variableB;
        System.out.println(result);
        //operation between integer variables gives integers as result. So to get accurate results, convert(typecast)
        //one of the operands into double. Division operation involving integer operands gives an integer result. If any
        //one of the operands is double, result will be in double.

        //Diving an integer by 0 results in ArithmeticException, but division of a double number by 0 results in
        //Infinity.






        

        //Non-primitive datatypes: They are known as reference types, more complex data structures. Refer to object and
        //include classes, interfaces, arrays, enums.

        //Primitive types hold their values directly in the memory allocated for them, whereas non-primitive types hold
        //references to objects in the heap memory.
        //Non-primitive types have default value as 'null'.


        //Memory management for primitives: Values are stored in stack memory. When we declare an int variable, the
        //actual integer is stored in stack memory. Variables stored in stack are local to the methods in which they are
        //defined and are automatically deallocated when the method finishes execution.

        //Memory management for non-primitives: These types are stored in heap memory, but their references are stored
        //in stack memory. Objects  in heap have a longer lifespan. they remain in memory as long as there are
        //references pointing to them. The garbage collector automatically deallocates memory when objects are no longer
        //reachable.

        //https://chatgpt.com/c/90446050-5233-465d-8a04-ccc305a68cef



        //By default, integers are have int datatype in java, and decimal numbers have double datatype by default.
        //To make a decimal number float, we have to put suffix f.

        //There is no concept of truthy and falsy values in java. That means only compatible types can be converted from
        //one datatype to another. int cannot e converted to boolean


        //https://chatgpt.com/c/6a4ffa0c-7511-48d4-942e-bfe247921c31
    }
}
