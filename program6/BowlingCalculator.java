// Name: Nico Rojas
// Instructor: Krumpe
// CSE 174-F
// Date: 10/1/2015
// Filename: BowlingCalculator.java
// Description: Asks the user for the score of each roll in a game of bowling
//              and computes the total score along w/ strikes and spares.

import java.util.Scanner;

public class BowlingCalculator {
   
   public static void main(String[] args) { 

      Scanner kb = new Scanner(System.in);
      boolean isSpare = false, isStrike = false, isStrikePass = false;
      int score1 = 0, score2 = 0, score3 = 0, score4 = 0, score5 = 0,
          score6 = 0, score7 = 0, score8 = 0, score9 = 0, score10 = 0,
          score11 = 0, score12 = 0, score13 = 0, score14 = 0, score15 = 0,
          score16 = 0, score17 = 0, score18 = 0, score19 = 0, score20 = 0,
          totalscore = 0, strike = 0, spare = 0, rollCount = 0,
          extra_score1 = 0, extra_score2 = 0;
      
      //////////////////////// Frame 1 ////////////////////////
      System.out.print("Frame 1  -- Ball 1:");
      score1 = kb.nextInt();
      totalscore+= score1;
      
      // Not Strike
      if(score1 != 10){
       
         System.out.print("         -- Ball 2:");
         score2 = kb.nextInt();
         totalscore+= score2;
         
         // Spare
         if(score1 + score2 == 10){ 
            spare++;
            isSpare = true;
         }
      }
      // Strike
      else{
         strike++;
         isStrike = true;
      }
      
      //////////////////////// Frame 2 ////////////////////////
      System.out.print("Frame 2  -- Ball 1:");
      score3 = kb.nextInt();
      totalscore+= score3;
            
      if(isStrikePass == true)
         isStrike = false;
      
      if(isStrike == true){
         totalscore+= score3;
         rollCount = 1;
      }
  
      if(isSpare == true){
         totalscore+= score3;
         isSpare = false;
      }
      
      isStrikePass = true;
      
      if(score3 != 10){
       
         System.out.print("         -- Ball 2:");
         score4 = kb.nextInt();
         totalscore+= score4;
         
         if(isStrike == true){
            totalscore+= score4;
            rollCount = 2;
            isStrike = false;
            isStrikePass = false;
         }
         
         if(score3 + score4 == 10){
            spare++;
            isSpare = true;;
         }
      }
      else{
         strike++;
         isStrikePass = false;
         isStrike = true;
      }
      
      //////////////////////// Frame 3 ////////////////////////
      System.out.print("Frame 3  -- Ball 1:");
      score5 = kb.nextInt();
      totalscore+= score5;
      
      if(rollCount == 1){
         totalscore+= score5;
         rollCount = 0;
      }
      
      if(isStrikePass == true)
         isStrike = false;
      
      if(isStrike == true){
         totalscore+= score5;
         rollCount = 1;
      }
      
      if(isSpare == true){
         totalscore+= score5;
         isSpare = false;
      }

      isStrikePass = true;
      
      if(score5 != 10){
       
         System.out.print("         -- Ball 2:");
         score6 = kb.nextInt();
         totalscore+= score6;
         
         if(isStrike == true){
            totalscore+= score6;
            rollCount = 2;
            isStrike = false;
            isStrikePass = false;
         }
         
         if(score5 + score6 == 10){
            spare++;
            isSpare = true;
         }
      }
      else{
         strike++;
         isStrikePass = false;
         isStrike = true;
      }    

      //////////////////////// Frame 4 ////////////////////////
      System.out.print("Frame 4  -- Ball 1:");
      score7 = kb.nextInt();
      totalscore+= score7;
      
      if(rollCount == 1){
         totalscore+= score7;
         rollCount = 0;
      }
      
      if(isStrikePass == true)
         isStrike = false;
      
      if(isStrike == true){
         totalscore+= score7;
         rollCount = 1;
      }
      
      if(isSpare == true){
         totalscore+= score7;
         isSpare = false;
      }
      
      isStrikePass = true;
      
      if(score7 != 10){
       
         System.out.print("         -- Ball 2:");
         score8 = kb.nextInt();
         totalscore+= score8;
         
         if(isStrike == true){
            totalscore+= score8;
            rollCount = 2;
            isStrike = false;
            isStrikePass = false;
         }
         
         if(score7 + score8 == 10){
            spare++;
            isSpare = true;
         }
      }
      else{
         strike++;
         isStrikePass = false;
         isStrike = true;
      }      
      
      //////////////////////// Frame 5 ////////////////////////
      System.out.print("Frame 5  -- Ball 1:");
      score9 = kb.nextInt();
      totalscore+= score9;

      if(rollCount == 1){
         totalscore+= score9;
         rollCount = 0;
      }
      
      if(isStrikePass == true)
         isStrike = false;
      
      if(isStrike == true){
         totalscore+= score9;
         rollCount = 1;
      }
      
      if(isSpare == true){
         totalscore+= score9;
         isSpare = false;
      }
      
      isStrikePass = true;
      
      if(score9 != 10){
       
         System.out.print("         -- Ball 2:");
         score10 = kb.nextInt();
         totalscore+= score10;
         
         if(isStrike == true){
            totalscore+= score10;
            rollCount = 2;
            isStrike = false;
            isStrikePass = false;
         }
         
         if(score9 + score10 == 10){
            spare++;
            isSpare = true;
         }
      }
      
      else{
         strike++;  
         isStrikePass = false;
         isStrike = true;
      }
      
      //////////////////////// Frame 6 ////////////////////////
      System.out.print("Frame 6  -- Ball 1:");
      score11 = kb.nextInt();
      totalscore+= score11;
      
      if(rollCount == 1){
         totalscore+= score11;
         rollCount = 0;
      }
            
      if(isStrikePass == true)
         isStrike = false;
      
      if(isStrike == true){
         totalscore+= score11;
         rollCount = 1;
      }
      
      if(isSpare == true){
         totalscore+= score11;
         isSpare = false;
      }
      
      isStrikePass = true;
      
      if(score11 != 10){
       
         System.out.print("         -- Ball 2:");
         score12 = kb.nextInt();
         totalscore+= score12;
         
         if(isStrike == true){
            totalscore+= score12;
            rollCount = 2;
            isStrike = false;
            isStrikePass = false;
         }
         
         if(score11 + score12 == 10){
            spare++;
            isSpare = true;
         }
      }
      else{
         strike++;
         isStrikePass = false;
         isStrike = true;
      }
      
      //////////////////////// Frame 7 ////////////////////////
      System.out.print("Frame 7  -- Ball 1:");
      score13 = kb.nextInt();
      totalscore+= score13;
      
      if(rollCount == 1){
         totalscore+= score13;
         rollCount = 0;
      }
            
      if(isStrikePass == true)
         isStrike = false;
      
      if(isStrike == true){
         totalscore+= score13;
         rollCount = 1;
      }
      
      if(isSpare == true)
         totalscore+= score13;
         isSpare = false;
      
      isStrikePass = true;
      
      if(score13 != 10){
       
         System.out.print("         -- Ball 2:");
         score14 = kb.nextInt();
         totalscore+= score14;
         
         if(isStrike == true){
            totalscore+= score14;
            rollCount = 2;
            isStrike = false;
            isStrikePass = false;
         }
         
         if(score13 + score14 == 10){
            spare++;
            isSpare = true;
         }
      }
      else{
         strike++;  
         isStrikePass = false;
         isStrike = true;
      }
            
      //////////////////////// Frame 8 ////////////////////////
      System.out.print("Frame 8  -- Ball 1:");
      score15 = kb.nextInt();
      totalscore+= score15;
      
      if(rollCount == 1){
         totalscore+= score15;
         rollCount = 0;
      }
      
      if(isStrikePass == true)
         isStrike = false;
      
      if(isStrike == true){
         totalscore+= score15;
         rollCount = 1;
      }
      
      if(isSpare == true){
         totalscore+= score15;
         isSpare = false;
      }
      
      isStrikePass = true;
      
      if(score15 != 10){
       
         System.out.print("         -- Ball 2:");
         score16 = kb.nextInt();
         totalscore+= score16;
         
         if(isStrike == true){
            totalscore+= score16;
            rollCount = 2;
            isStrike = false;
            isStrikePass = false;
         }
         
         if(score15 + score16 == 10){
            spare++;
            isSpare = true;
         }
      }
      else{
         strike++;  
         isStrikePass = false;
         isStrike = true;
      }   

      //////////////////////// Frame 9 ////////////////////////
      System.out.print("Frame 9  -- Ball 1:");
      score17 = kb.nextInt();
      totalscore+= score17;
      
      if(rollCount == 1){
         totalscore+= score17;
         rollCount = 0;
      }
            
      if(isStrikePass == true)
         isStrike = false;
      
      if(isStrike == true){
         totalscore+= score17;
         rollCount = 1;
      }
      
      if(isSpare == true){
         totalscore+= score17;
         isSpare = false;
      }
      
      isStrikePass = true;
      
      if(score17 != 10){
       
         System.out.print("         -- Ball 2:");
         score18 = kb.nextInt();
         totalscore+= score18;
         
         if(isStrike == true){
            totalscore+= score18;
            rollCount = 2;
            isStrike = false;
            isStrikePass = false;
         }
         
         if(score17 + score18 == 10){
            spare++; 
            isSpare = true;
         }
      }
      else{
         strike++;  
         isStrikePass = false;
         isStrike = true;
      }      
            
      //////////////////////// Frame 10 ////////////////////////
      System.out.print("Frame 10 -- Ball 1:");
      score19 = kb.nextInt();
      totalscore+= score19;
      
      if(rollCount == 1){
         totalscore+= score19;
         rollCount = 0;
      }
            
      if(isStrikePass == true)
         isStrike = false;
      
      if(isStrike == true){
         totalscore+= score19;
         rollCount = 1;
      }
      
      if(isSpare == true){
         totalscore+= score19;
         isSpare = false;
      }
      
      isStrikePass = true;
      
      if(score19 != 10){
       
         System.out.print("         -- Ball 2:");
         score20 = kb.nextInt();
         totalscore+= score20;
         
         if(isStrike == true){
            totalscore+= score20;
            rollCount = 2;
            isStrike = false;
            isStrikePass = false;
         }
         
         if(score19 + score20 == 10){
            spare++;
            isSpare = true;
         }
      }
      else{
         strike++;  
         isStrikePass = false;
         isStrike = true;
      }
      
      //////////////////////// Extra Roll ////////////////////////
      if(rollCount == 1){
         totalscore+= score19;   
         rollCount = 0;
      }
      
      if(isSpare == true){

         System.out.print("Extra    -- Ball 1:");
         extra_score1 = kb.nextInt();
         totalscore+= extra_score1;
      }
      
      if(isStrike == true){
       
         System.out.print("Extra    -- Ball 1:");
         extra_score1 = kb.nextInt();
         totalscore+= extra_score1;
         
         System.out.print("Extra    -- Ball 2:");
         extra_score2 = kb.nextInt();
         totalscore+= extra_score2;
         
         if(extra_score1 + extra_score2 == 10)
            spare++;
      }

      // Output
      System.out.println("Your total score is " + totalscore + ".");
      System.out.println("You rolled " + strike + " strike(s) and " + spare
                        + " spare(s).");
   }
}