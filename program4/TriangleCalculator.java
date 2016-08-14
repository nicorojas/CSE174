// Name: Nico Rojas
// Instructor: Krumpe
// CSE 174-F
// Date: 9/16/2015
// Filename: TriangleCalculator.java
// Description: Calculate side lengths, perimeter, area, and the centroid of a
//              triangle from user-inputted coordinates. 

import java.util.Scanner;

public class TriangleCalculator {
   
   public static void main(String[] args) { 
    
      Scanner kb = new Scanner(System.in);
      String triangle, letter1, letter2, letter3;
      double x1, y1, x2, y2, x3, y3;
      double length1, length2, length3, perimeter, area, temp, max,
             min, middle, centroid_x, centroid_y;
      
      //User-Input
      System.out.println("Enter the three-letter name of triangle:");
      triangle = kb.next();
      
      letter1 = triangle.substring(0,1);
      letter2 = triangle.substring(1,2);
      letter3 = triangle.substring(2,3);
     
      System.out.println("Enter the coordinates of vertex " 
                            + letter1.toUpperCase() + ":");
      x1 = kb.nextDouble(); //x1
      y1 = kb.nextDouble(); //y1
      
      System.out.println("Enter the coordinates of vertex " 
                            + letter2.toUpperCase() + ":");
      x2 = kb.nextDouble(); //x2
      y2 = kb.nextDouble(); //y2      
      
      System.out.println("Enter the coordinates of vertex " 
                            + letter3.toUpperCase() + ":");
      x3 = kb.nextDouble(); //x3
      y3 = kb.nextDouble(); //y3
      
      //Calculations
      
          //Side Lengths
          length1 = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
          length2 = Math.sqrt(((x3-x2)*(x3-x2)) + ((y3-y2)*(y3-y2)));
          length3 = Math.sqrt(((x3-x1)*(x3-x1)) + ((y3-y1)*(y3-y1)));  
         
          //Perimeter, Area, Centroid
          perimeter = length1 + length2 + length3;
          area = ((x1*(y2 - y3)) + (x2*(y3 - y1)) + (x3*(y1 - y2)))/2;
          area = Math.abs(area);
          centroid_x = (x1 + x2 + x3)/3;
          centroid_y = (y1 + y2 + y3)/3;
          
          //Sorted
          temp = Math.max(length1, length2);
          max = Math.max(temp, length3);
          temp = Math.min(length1, length2);
          min = Math.min(temp, length3);
          middle = perimeter - max - min;
      
      //Display
      System.out.println("\n--- Side Lengths ---");
      System.out.printf(letter1.toUpperCase() + letter2.toUpperCase() 
                           + ": %.3f%n", length1);
      System.out.printf(letter2.toUpperCase() + letter3.toUpperCase() 
                           + ": %.3f%n", length2);
      System.out.printf(letter3.toUpperCase() + letter1.toUpperCase() 
                           + ": %.3f%n", length3);
      
      System.out.println("\n--- Sorted ---");
      System.out.printf("%.3f",min);
      System.out.printf(", %.3f", middle);
      System.out.printf(", %.3f%n", max);
      
      System.out.println("\n--- Other Measures ---");
      System.out.printf("Perimeter = %.3f%n", perimeter);
      System.out.printf("Area      = %.3f%n", area);
      System.out.printf("Centroid  = (%.3f", centroid_x);
      System.out.printf(", %.3f", centroid_y);
      System.out.println(")");
   }
}
