package strings;

public class BasicsOfStrings {
    public static void main(String[] args) {
        //What are strings ?
        //String is a non-primitive datatype in Java. It is immutable, once created it cannot be modified.
        //If you try to change already initialised string variable, it will point towards the newly created string,
        //it will not make any kind of changes in original string.
        //Since string is a non-primitive datatype, it is made up of primitive datatypes. That means, inside, a java
        //string is stored as an array of characters, where character is a primitive datatype.
        //In Java, string is basically an object that represents a sequence of character values.
        //An array of characters work same as Java String.
        //Strings are stored inside double quotes ("").


        //How to create a java string ?
        //By string literal: String name = "Suyash Kumar Jaiswal";
        //By using new keyword: String name = new String("Suyash Kumar Jaiswal");
        /*
        When you create strings using string literals: Java maintains a string pool for string literals. If a string
        already exists in the pool, a new reference to the existing string is returned. If it doesn't exist, it is added
        to the pool. This mechanism saves memory as identical strings are stored only once.
        These string literals are automatically interned i.e. all the references to the same literal will point to the
        same object in the memory. That's why accessing a string literal is faster due to interning mechanism.


        When you create strings using new keyword: This statement explicitly creates a new String object in heap memory
        regardless of whether an identical string exists or not in the string pool. The new object created is not
        automatically interned. If you want it to be interned, you need to explicitly call the intern() method.
        Each call to 'new String(..)' results is a distinct object, even if the content is identical. This leads to
        higher memory usage.
        //https://chatgpt.com/c/eb64677b-fabf-486f-b68d-83a15e926f9c
         */


        //Immutability of Strings in Java: String variables are mutable but String objects are not. That means,
        //String name = "Suyash";
        //name = "Kumar";
        //Here, name variable was pointing to "Suyash" object, but now it is pointing to "Kumar" object. String objects
        //"Suyash" and "Kumar" are immutable, they cannot be changed once created.
        //String objects are immutable. Immutable simply means unmodifiable or unchangeable. Once a String objects is
        //created, its data or state cannot be changed.
        //name = "Suyash " + name; name variable now points towards a new String object: "Suyash Kumar".


        //Comparing 2 Strings in Java: We can use == operator to check if 2 strings are equal or not, but it is advised
        //to use equals() method provided by String class. == operator checks the references of the objects, not their
        //values. a == b; here java will check if both a and b have same references or not, it will not check their
        //values. In case of objects, == checks references(memory location) of objects, not values. In case of
        //primitives, == checks values. Because, primitives are stored differently than non-primitives.
        //int a = 10;
        //int b = 10;
        //here a and b are not pointing towards same object, they're distinct. That's why == checks value when comparing
        //primitives
        // If you want to check values in case of objects, use equals() method which is
        //defined in Object class.
        /*
        String class provides 2 methods:
        public boolean equals(Object another) compares this string to the specified object.
        public boolean equalsIgnoreCase(String another) compares this string to another string ignoring the case.
         */

        //String methods:
        /*
        toUpperCase(): Returns a new String object with all characters converted to uppercase.
        toLowerCase(): Returns a new String object with all characters converted to lowercase.
        trim(): Returns a new String object with leading and trailing whitespaces(spaces+tabs) removed.
        startsWith(): Returns boolean result if string begins with a specific prefix. It's versatility with offset
                      version allows for flexible substring checking.
        endsWith(): Returns boolean result if a string ends with a specified suffix.
        equals(): It is used to compare 2 objects for equality. It is part of Object class, but overridden in String
                  class to provide value based comparison. It compares lengths of 2 strings and checks if corresponding
                  character is same.
                  '==' operator checks for reference equality (whether 2 references point to the same object), while
                  equals() checks for value equality (whether contents of 2 strings are same).
        equalsIgnoreCase(): Does same thing as equals() but ignores case of strings.
        charAt(): It is used to retrieve a specific character from a String based on its index.
        valueOf(): It is a static method provided by String class that converts different types of data into their
                   string representation. This method is overloaded to handle various datatypes, including primitives,
                   objects and arrays.
        replace(): It is used to replace occurrences of a specified character or substring with another character or a
                   substring. It returns a new string with specified replacements
        contains(): Returns a boolean value if specified substring is present in the given string or not
        substring(): It is used to extract a portion of a string, starting from a specified index and optionally ending
                     at another specified index. If only 1 argument is passed, it assumes it to be starting index and
                     assumes last index as end index. Extracts string from first index till (endIndex - 1). Negative
                     indexing don't work in Java as in JavaScript or Python.
        split(): Returns an array of substrings resulting from split operation based on specified delimiter. The
                 delimiter can be a regular expression, allowing more complex splitting patterns. It also allows us to
                 explicitly specify a limit on the number of substrings returned in the array by providing a limit
                 argument after delimiter.
        toCharArray(): It converts a string into a character array. It doesn't modify original string, creates and
                       returns a new array containing characters of the string.
        isEmpty(): Returns a boolean result depending on whether string is empty, containing no characters. Returns true
                   if string length is 0.
        isBlank(): It was introduced in Java 11. It checks if a string is empty or contains only white space characters.
                   Returns true if string is empty or contains only white space characters.
        length(): Returns length of the string. Not to be confused with length property of arrays. It is a method for
                  strings.

        https://chatgpt.com/c/0b0ae448-aac2-4a6f-b5da-430212d9b95e
         */
    }
}
