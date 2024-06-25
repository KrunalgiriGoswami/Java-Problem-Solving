import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Define the decimal format pattern for rounding
        // "0.00" means round to two decimal places
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        // Format the number using the specified pattern
        String roundedNumber = decimalFormat.format(number);

        // Display the rounded number
        System.out.println("Rounded number: " + roundedNumber);

        // Close the scanner
        scanner.close();
    }
}
