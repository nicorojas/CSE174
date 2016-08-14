// Name: Nico Rojas
// Instructor: Krumpe
// CSE 174-F
// Date: 9/1/2015
// Filename: HelloName.java
// Description: Display user-inputted name.

import javax.swing.JOptionPane;

public class HelloName {
   
   public static void main(String[] args) { 
      
      String name = JOptionPane.showInputDialog("What is your name?");
      JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
   }
}