// Name: Nico Rojas
// Instructor: Krumpe
// CSE 174-F
// Date: 9/9/2015
// Filename: EasterSunday.java
// Description: Output the day on which Easter falls depending on the user-inputted year.

import java.util.Scanner;

public class EasterSunday {
   
   public static void main(String[] args) { 
    
      Scanner kb = new Scanner(System.in);
      
      int y, a, b, c, d, e, g, h, j, k, m, r, n, p;
      
      System.out.println("Enter a year:");
      y = kb.nextInt();
      
      //Calculations
      a = y % 19;
      b = y / 100;
      c =  y % 100;
      d = b / 4;
      e = b % 4;
      g = (8 * b + 13) / 25;
      h = (19 * a + b - d - g + 15) % 30;
      j = c / 4;
      k = c % 4;
      m = (a + 11 * h) / 319;
      r = (2 * e + 2 * j - k - h + m + 32) % 7;
      n = (h - m + r + 90) / 25;
      p = (h - m + r + n + 19) % 32;
      
      // month/day : n/p
      
      //Output
      System.out.println("Easter Sunday is on " + n + "/" + p + "/" + y);
   }
}
