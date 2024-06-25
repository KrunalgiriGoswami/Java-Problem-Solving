//  Write a Java program to convert seconds to hours, minutes and seconds.

import java.util.Scanner;

public class Exercise55 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of seconds
        System.out.print("Enter the number of seconds: ");
        int totalSeconds = scanner.nextInt();

        // Calculate hours, minutes and seconds
        int hours = totalSeconds / 3600;
        int remainingSecondsAfterHours = totalSeconds % 3600;
        int minutes = remainingSecondsAfterHours / 60;
        int seconds = remainingSecondsAfterHours % 60;

        // Print the result
        System.out.printf("%d seconds is equivalent to %d hours, %d minutes, and %d seconds.%n", totalSeconds, hours, minutes, seconds);

        // Close the scanner
        scanner.close();
    }
}
