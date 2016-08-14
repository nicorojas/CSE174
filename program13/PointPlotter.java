// Name: Nico Rojas
// Instructor: Krumpe
// CSE 174-F
// Date: 12/1/2015
// Filename: PointPlotter.java
// Description: Reads and removes strings from messyData.txt. Converts doubles
//              to ints and displays the points.

/**
 * A program that displays a set of points on the screen.
 * Begin with an array of Point objects.  Send that array
 * to a PointDisplay object.  The PointDisplay object will
 * handle all the necessary drawing for you.
 *
 * @author Norm Krumpe
 * @version 2.0
 */

import javax.swing.JFrame;
import java.awt.Point;
import java.util.*;
import java.io.*;

public class PointPlotter  {
  public static void main(String[] args) throws FileNotFoundException{
    // For now, how JFrames work is unimportant. Our
    // focus is on using a PointDisplay object,
    // which requires an array of Point objects in order
    // to work.
    JFrame frame = new JFrame("Show Some Points");
    frame.setBounds(300, 300, 615, 650);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // call rewriteData method, program13
    rewriteData();
    
    // PointDisplay objects "consume" arrays of Point objects.
    // In other words, if you have an array of Point objects,
    // and pass that array to PointDisplay, it will draw
    // those points for you.
    boolean connect = false;
    int pointDiameter = 10;
    Scanner kb = new Scanner(System.in);

    ArrayList<Point> myPoints = outputCleanData();
    
    // DON'T CHANGE THE REST OF THE CODE IN THIS METHOD:
    PointDisplay display = new PointDisplay(myPoints,
                                            pointDiameter, connect);
    frame.add(display);
    frame.setVisible(true);
  }
  
  public static void rewriteData() throws FileNotFoundException{

    Scanner fileIn = new Scanner(new File("messyData.txt"));
    PrintWriter fileOut = new PrintWriter(new File("cleanData.txt"));
    int enter = 0;
 
    while(fileIn.hasNext()){
       
       if(fileIn.hasNextDouble()){ // if its a double

          double numDouble = fileIn.nextDouble();
          int numInt = (int)(numDouble);
          
          fileOut.print(numInt + " ");
          enter++;
       
          if(enter % 2 == 0)
             fileOut.println();
       }
       
       else // skip next input
          fileIn.next();
    }
    fileOut.close();
  }
  
  public static ArrayList<Point> outputCleanData() throws FileNotFoundException{
    
    ArrayList<Point> resultArray = new ArrayList<Point>();
    Scanner fileIn = new Scanner(new File("cleanData.txt"));
    
    while(fileIn.hasNextInt())
      resultArray.add(new Point(fileIn.nextInt(), fileIn.nextInt()));
    
    fileIn.close();

    return resultArray;
  }
}