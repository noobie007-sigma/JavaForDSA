package exceptionsInJava;
//Java Exceptions, Java Exception Handling, try catch block, finally block, throw and throws keyword
//https://chatgpt.com/c/abc7c643-7c73-4062-848a-8630ee624b11
public class ExceptionsInJava {
    public static void main(String[] args) {
        //Java Exceptions: An exception is an unexpected event that occurs during program execution. It affects the flow
        //of the program instructions which can cause the program to terminate abnormally.
        //Exception can occur due to: invalid user input, device failure, code errors, opening unavailable file,
        //physical limitations, etc.

        //Java Runtime Exceptions:
        /*
        A runtime exception happens due to a programming error. They are also known as unchecked exceptions.
        These exceptions are not checked at compile-time but run-time. For ex- NullPointerException,
        ArrayIndexOutOfBoundsException, ArithmeticException.


        If it is a runtime exception, it is our fault!!!
         */

        //Java IOExceptions: An IOException is also known as a checked exception. They are checked by the compiler at
        //the compile-time and programmer is prompted to handle these exceptions. For ex- FileNotFoundException, trying
        //to read past the end of file.

        //try-catch block: The try-catch block in Java is used to handle exceptions and prevents the abnormal
        //termination of the program.

//        int a[] = new int[5];
//        System.out.println(a[5]);
//        System.out.println("Hello");
        //From above 3 lines we got to know that if an unchecked exceptions occurs, code stops there. So we need try
        //catch to let code execution continue after handling errors.

        int[] a = new int[5];
        try {
//            System.out.println(a[6]);
            System.out.println(a[1] / 0);
            String s = null;
            System.out.println(s.length());
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Tried to access out of bound element");
        } catch(ArithmeticException e) {
            System.out.println("Do not divide an integer by 0");
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e);
        } finally {
            System.out.println("I will always be executed");
        }
        System.out.println("Bye world");
     //try-catch-finally: In Java, we can also use finally block after the try catch block. In this case, finally block
     //is always executed whether there is an exception inside the try block or not. It is a god practice to use finally
     //block to include important cleanup code like closing a file or a connection.
     //finally block will always run, whether exception occurs or not , handled or not. If an unhandled exception occurs
     //then also finally block will execute, then program will terminate.

     //There are some cases when a 'finally' block does not execute:
        //When you use System.exit() method (It terminates the program on the spot)
        //When an exception occurs in the 'finally' block.
        //Death of a thread

        //Java throw and throws: We use the throws keyword in the method declaration to declare the type of exception
        //that might occur within it The throw keyword is used to explicitly throw a single exception.


        //I am going to call getNumberFromArray() method, and I know beforehand that this method might throw an error,
        //so I will call it inside a try catch block.
        try {
            getNumberFromArray(a);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception from method with help of throws keyword");
            System.out.println(e.getMessage());
        }


    }
    public static int getNumberFromArray(int[] arr) throws ArrayIndexOutOfBoundsException {
        return arr[8];
        //here I am not checking length of arr, or is it null or not. I am directly returning a[8]. So error may occur.
        //So I must mention in declaration itself that this method might throw an ArrayIndexOutOfBoundError.
    }

}
