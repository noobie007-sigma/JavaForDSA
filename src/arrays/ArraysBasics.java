package arrays;

public class ArraysBasics {
    public static void main(String[] args) {
        //Arrays are used to store same type of data. Arrays are stored in contiguous memory locations
        //Creating / Declaring an array: int[] arr; or int arr[];
        //Allocating memory to array: arr = new int[20];

        int[] ages = new int[5]; //declaration and allocation combined
        //When we declare an array, age in this case, it only points towards 0th index i.e. age[0].
        //It calculates other memory locations according to formula: address of age[0] + size * index.
        //address of age[3] = address of age[0] + (4 * 3).

        //Arrays are static in Java: Once an array is assigned memory, we cannot change (increase/decrease) it anymore.
        //If situation arises, we will have to create new array of modified length, copy data from previous array, then
        //store new data. Or we can use ArrayLists which are dynamic in nature.
        //i.e. Here ages array has been assigned memory of 20 integers. Now it cannot be changed.

        //Length of an array: arrayName.length; Length is a property of arrays in Java

        System.out.println(ages.length);

        //Directly initialising an array:
        //int[] arr2 = {1, 2, 3, 4, 5};

        //If we try to access index greater than available/allocated, we get ArrayIndexOutOfBoundException.

        //Iterating through an array:
        String[] names = {"Joe", "Jane", "Rahul", "Virat", "Bumrah"};
        for (String name: names) {
            System.out.println(name);
        }
        //https://chatgpt.com/c/aa0f9074-8074-4be1-a041-2867e55e484f
        //for each loop is an enhanced version of for loops, we can use it on iterable objects in Java. for ex- arrays,
        //lists, maps, etc.


        //Multidimensional arrays:
        int[][] multiDArray = new int[5][3]; //5 rows and 3 columns - total space of 15 integer elements is assigned to
        //multiDArray.

        //How multidimensional arrays are stored in Java:
        //An array of arrays gets created. Each index of top array/array of arrays points towards another 1D array
        //Main array contains references to other arrays(sub-arrays).
        //https://chatgpt.com/c/aa0f9074-8074-4be1-a041-2867e55e484f

    }
}
