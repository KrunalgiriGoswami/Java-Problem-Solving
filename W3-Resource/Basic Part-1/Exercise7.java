// Write a Java program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;
 
public class Exercise7 {
 
 public static void main(String[] args) {
  // Create a Scanner object to read input from the user
  Scanner in = new Scanner(System.in);
   
  // Prompt the user to input a number
  System.out.print("Input a number: ");
  
  // Read and store the input number
  int n = in.nextInt();
   
  // Use a loop to calculate and print the multiplication table for the input number
  for (int i = 1; i <= 10; i++) {
     // Calculate and print the result of num1 multiplied by (i+1)
     System.out.println(n + " * " + i + " = " + (n * i));
  }
 }
}
