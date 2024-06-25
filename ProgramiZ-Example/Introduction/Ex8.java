// Check whether an alphabet is vowel or consonant using if..else statement

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an alphabet
        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().toLowerCase().charAt(0);

        // Check if the character is a single alphabet
        if (Character.isLetter(ch)) {
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a single alphabetic character.");
        }

    }
}
