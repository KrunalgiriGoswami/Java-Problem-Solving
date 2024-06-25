// Write a Java program to reverse a word.

import java.util.Scanner;

public class Exercise61 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Reverse the word using StringBuilder
        String reversedWord = new StringBuilder(word).reverse().toString();

        // Print the reversed word
        System.out.println("Reversed word: " + reversedWord);

        // Close the scanner
        scanner.close();
    }
}
