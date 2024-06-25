// Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.

import java.util.Scanner;

public class Exercise44 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        
        // Prompt the user to input a number.
        System.out.print("Input number: ");
        n = in.nextInt();
        
        // Display the number in a specific pattern.
        System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
    }
}
