import java.util.Scanner;

public class RecursiveMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // User will input five different numbers, which will fill the array of ints
        System.out.println("Enter 5 numbers: ");
        for(int i = 0; i < 5; i++) {
            System.out.println("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate the product using the calculateProduct method
        int product = calculateProduct(numbers, 0);
        System.out.println("The product of the numbers is: " + product);

        scanner.close();
    }

    public static int calculateProduct(int[] numbers, int index) {
        // Base case - index reaching the length of the array
        if(index == numbers.length) {
            return 1;
        }
        // Recursive case - multiply current number with the current product
        return numbers[index] * calculateProduct(numbers, index + 1);
    }
}

// In the feedback from my submission, there were no indications of specific corrections to be made.