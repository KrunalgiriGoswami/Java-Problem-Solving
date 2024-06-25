import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Remove all whitespaces using replaceAll method
        String stringWithoutWhitespaces = inputString.replaceAll("\\s", "");

        // Display the string without whitespaces
        System.out.println("String without whitespaces: " + stringWithoutWhitespaces);

        // Close the scanner
        scanner.close();
    }
}
