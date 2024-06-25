// Write a Java program to convert a string into uppercase.

import java.util.Scanner;

public class Exercise58 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");

        // Read a string from the user
        String line = in.nextLine();

        // Convert the string to uppercase
        line = line.toUpperCase();

        // Print the lowercase version of the input string
        System.out.println(line);
    }

}