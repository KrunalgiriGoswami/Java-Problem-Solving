// Write a Java program to accept an integer and count the factors of the number.

import java.util.Scanner;

public class Exercise57 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize a counter for the number of factors
        int count = 0;

        // Loop through all numbers from 1 to the given number to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Print the result
        System.out.printf("The number %d has %d factors.%n", number, count);

    }
}
