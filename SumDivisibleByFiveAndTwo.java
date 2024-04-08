import java.util.Scanner;

public class SumDivisibleByFiveAndTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.print("Enter the number to define the size of an  array: ");
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] numbers = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Variable to store the sum
        int sum = 0;

        // Loop through the array to find numbers divisible by both 5 and 2
        for (int i = 0; i < numbers.length; i++) {
            // Check if the number is divisible by 5 and 2
            if (numbers[i] % 5 == 0 && numbers[i] % 2 == 0) {
                // If divisible, add it to the sum
                sum += numbers[i];
            }
        }

        // Print the sum
        System.out.println("Sum of numbers divisible by 5 and 2: " + sum);
        
        scanner.close(); // Close the scanner to prevent resource leak
    }
}
