// Name: Nico Rojas
// Instructor: Krumpe
// CSE 174-F
// Date: 9/9/2015
// Filename: Rectangle.java
// Description: Prints the area and perimeter of a rectangle.

import java.util.Scanner;

public class Rectangle {
   
   public static void main(String[] args) { 
      
      Scanner kb = new Scanner(System.in);
      double length, height, area, perimeter, diagonal;
      
      //User Input
      System.out.println("Enter the length of the rectangle:");
      length = kb.nextDouble();
      
      System.out.println("Enter the height of the rectangle:");
      height = kb.nextDouble();
      
      //Calculations
      area = length * height;
      perimeter = (length * 2) + (height * 2);
      diagonal = Math.sqrt((length * length) + (height * height));
      
      //Output
      System.out.println("Rectangle Calculations:");
      System.out.println("-------------------------------------");
      System.out.printf("Area = %.4f%n", area);
      System.out.printf("Perimeter = %.4f%n", perimeter);
      System.out.printf("Length of diagonal = %.4f%n", diagonal);  
   }   
}
