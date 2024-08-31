package arrays;

public class ProblemsOnArrays {
    public static void main(String[] args) {
        int[] numbers = {23, 12, 6, 7, 15, 3, 2, 56};

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int number : numbers) {
            if(number < min) {
                min = number;
            }
            sum += number;
        }
        System.out.println("Minimum value is " + min);
        System.out.println("Sum is " + sum);
    }
}
