// Find Frequency of Character

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt the user to enter the character to find the frequency of
        System.out.print("Enter a character to find its frequency: ");
        char ch = scanner.next().charAt(0);

        // Initialize frequency counter
        int frequency = 0;

        // Iterate through the string to count the occurrences of the character
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == ch) {
                frequency++;
            }
        }

        // Display the frequency of the character
        System.out.println("The frequency of '" + ch + "' in the string is: " + frequency);

    }
}
