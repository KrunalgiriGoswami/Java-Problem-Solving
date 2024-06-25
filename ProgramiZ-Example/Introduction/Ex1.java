// How to Print an Integer entered by an user.

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        // Creates a sc instance which takes
        // input from standard input - keyboard
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // nextInt() reads the next integer from the keyboard
        int number = sc.nextInt();

        // println() prints the following line to the output screen
        System.out.println("You entered: " + number);
    }
}
