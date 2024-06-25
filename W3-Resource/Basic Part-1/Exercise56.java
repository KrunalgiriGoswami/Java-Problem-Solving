// Write a Java program to find the number of values in a given range divisible by a given value.

import java.util.Scanner;

public class Exercise56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the range start value from the user
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        // Get the range end value from the user
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        // Get the divisor from the user
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Ensure the range is valid
        if (start > end) {
            System.out.println("Invalid range. The start value should be less than or equal to the end value.");
            return;
        }

        // Calculate the number of values in the range divisible by the divisor
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % divisor == 0) {
                count++;
            }
        }

        // Print the result
        System.out.printf("There are %d values in the range [%d, %d] that are divisible by %d.%n", count, start, end, divisor);

        // Close the scanner
        scanner.close();
    }
}
