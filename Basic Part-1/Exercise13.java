// Write a Java program to print the area and perimeter of a rectangle.

import java.util.Scanner;

public class Exercise13 {
   public static void main(String[] strings) {

       Scanner in = new Scanner(System.in);

        // read constants for the width and height of the rectangle
        // read width of the rectangle
        System.out.println("Enter width : ");
        double width = in.nextDouble();

        // read height of the rectangle
        System.out.println("Enter height : ");
        final double height = in.nextDouble();

        // Calculate the perimeter of the rectangle
        double perimeter = 2 * (height + width);
		
        // Calculate the area of the rectangle
        double area = width * height;			

        // Print the calculated perimeter using placeholders for values
        System.out.println("Perimeter is " + perimeter);

        // Print the calculated area using placeholders for values
        System.out.println("Area is + " + area);
    }
}
