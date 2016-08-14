// Name: Nico Rojas
// Instructor: Krumpe
// CSE 174-F
// Date: 10/26/2015
// Filename: Program10.java
// Description: Plays a game of Craps a user-specified amount of times.

import java.util.Scanner;

public class Program10 {
   
   public static void main(String[] args) { 

      Scanner kb = new Scanner(System.in);
      int games, winCount = 0;
      double percentWin;
      
      // -------------------------- User Input -------------------------- //
      System.out.print("How many rounds of craps do you want to play?");
      games = kb.nextInt();
      
      while(games < 1){
       
         System.out.print("Enter a positive number please: ");
         games = kb.nextInt();
         
      } // -------------------------------------------------------------- // 
 
      for(int i = 1; i <= games; i++){
         
         System.out.print("Round #" + i + ": ");
         boolean win = craps();
      
         if(win == true){
            System.out.println("(win)");
            winCount++;
         }
         
         else
            System.out.println("(lose)");
      }
      
      System.out.println("------------------------------");
      double winDouble = winCount;
      double gamesDouble = games;
      percentWin = (winDouble / gamesDouble)*100;
      System.out.printf("Wins: " + winCount + " out of " + games + " (%.1f"
                       , percentWin); 
      System.out.print("%)");
      
      // System.out.println(rollDice());
   }
   
   public static int rollDice(){
            
      int die1, die2;
      
      die1 = (int)(1 + 6*Math.random()); // die1
      die2 = (int)(1 + 6*Math.random()); // die2

      return (die1 + die2);
   }
   
   public static boolean craps(){
    
      boolean win = false, stop = false;
      int origSum, sum = rollDice();
      
      System.out.print(sum + " ");
      
      if((sum == 7)||(sum == 11)) // auto-win
         win = true;
      
      else if((sum == 2)||(sum == 3)||(sum == 12)){} // auto-lose
      
      else{
         origSum = sum;
         
         do{
            sum = rollDice();
            System.out.print(sum + " ");
            
            if(sum == origSum){ // win
               win = true;
               stop = true;
            }
            
            else if(sum == 7) // lose
               stop = true;
            
         }while(stop == false); 
      }
      return win;
   }
}