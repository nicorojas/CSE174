// Name: Nico Rojas
// Instructor: Krumpe
// CSE 174-F
// Date: 9/9/2015
// Filename: WidgetShipper.java
// Description: Figure out how many boxes are needed to ship 'x' widgets.

import java.util.Scanner;

public class WidgetShipper {
   
   public static void main(String[] args) { 
      
      Scanner kb = new Scanner(System.in);
      int widgets, w_in_box, boxes, b2, b3;
      
      //Prompt user input
      System.out.println("How many widgets do you need to ship?");
      widgets = kb.nextInt();
      
      System.out.println("How many widgets fit in a box?");
      w_in_box = kb.nextInt();
      
      //Calculations
      boxes = widgets / w_in_box;
      b2 = widgets % w_in_box;
      
      if(b2 > 0){
         boxes++;
      }
      
      //Output
      System.out.println("You will need " + boxes + " boxes to ship the widgets.");
   }
}