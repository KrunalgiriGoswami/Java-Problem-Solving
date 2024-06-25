// Write a Java program and compute the sum of an integer's digits

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to input an integer
        System.out.print("Input an integer: ");
        
        // Read the integer from the user
        int n = input.nextInt();

        // Calculate and display the sum of the digits
        System.out.println("The sum of the digits is: " + sumDigits(n));
    }

    public static int sumDigits(int n) {
        int sum = 0;
        
        // Calculate the sum of the digits
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        
        return sum;
    }
}
