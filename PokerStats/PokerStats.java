// Name: Nico Rojas
// Instructor: Krumpe
// CSE 174-F
// Date: 11/22/2015
// Filename: PokerStats.java
// Description: Deals 'x' amount of poker hands and displays
//              probabilities of each hand type.

import java.util.*;

public class PokerStats {
   
   public static void main(String[] args) { 
      
      Deck deck = new Deck();
      Scanner kb = new Scanner(System.in);
      int hands = 0;
      
      System.out.print("How many poker hands should I deal?");
      hands = kb.nextInt();
      
      playAndShowStats(hands);
   }
   
   public static void printHand(Card[] cards){ // Outputs hand as a string
      System.out.println(cards.toString());
   }
   
   public static boolean hasFlush(Card[] cards){ // Checks for flush
      
      for(int i = 0; i < cards.length-1; i++){
         if(cards[i].getSuit() != cards[i+1].getSuit())
            return false;
      }
      return true;
   }
   
   public static boolean hasStraight(Card[] cards){ // Checks for straight
      
      for(int i = 0; i < cards.length-1; i++){
         if((cards[i].getValue()+1) != cards[i+1].getValue())
            return false;
      }
      return true;
   }
   
   public static boolean hasStraightFlush(Card[] cards){ // Check straightflush
      
      if(hasFlush(cards) && hasStraight(cards))
         return true;
      
      return false;
   }   
   
   public static boolean hasRoyalFlush(Card[] cards){ // Check for royal flush
      
      if(hasStraightFlush(cards)){
         if((cards[0].getValue() == 1))
            return true;
      }
      return false;
   }   
   
   public static boolean has4OfAKind(Card[] cards){ // Check for 4 of a kind
      
      boolean four1, four2;
      
      // x x x x a
      four1 = cards[0].getValue() == cards[1].getValue() &&
         cards[1].getValue() == cards[2].getValue() &&
         cards[2].getValue() == cards[3].getValue() ;
      
      // a x x x x 
      four2 = cards[1].getValue() == cards[2].getValue() &&
         cards[2].getValue() == cards[3].getValue() &&
         cards[3].getValue() == cards[4].getValue() ;
      
      return (four1 || four2);
   }   
   
   public static boolean has3OfAKind(Card[] cards){ // Check for 3 of a kind
      
      boolean three1, three2, three3;
      
      if(has4OfAKind(cards) || hasFullHouse(cards))
         return false;
      
      // x x x a b
      three1 = cards[0].getValue() == cards[1].getValue() &&
         cards[1].getValue() == cards[2].getValue() ;
      
      // a x x x b
      three2 = cards[1].getValue() == cards[2].getValue() &&
         cards[2].getValue() == cards[3].getValue() ;
      
      // a b x x x 
      three3 = cards[2].getValue() == cards[3].getValue() &&
         cards[3].getValue() == cards[4].getValue() ;
      
      return (three1 || three2 || three3);
   }   
   
   public static boolean hasPair(Card[] cards){ // Check for single pair
      
      boolean pair1, pair2, pair3, pair4;
      
      if(has4OfAKind(cards) || hasFullHouse(cards) || has2Pair(cards) ||
         has3OfAKind(cards))
         return false;
      
      // x x a b c
      pair1 = cards[0].getValue() == cards[1].getValue();
      
      // a x x b c
      pair2 = cards[1].getValue() == cards[2].getValue();
      
      // a b x x c
      pair3 = cards[2].getValue() == cards[3].getValue();
      
      // a b c x x
      pair4 = cards[3].getValue() == cards[4].getValue();   
      
      return (pair1 || pair2 || pair3 || pair4);
   }   
   
   public static boolean hasFullHouse(Card[] cards){ // Check for full house
          
      boolean full1, full2;
      
      // x x x y y
      full1 = cards[0].getValue() == cards[1].getValue() &&
              cards[1].getValue() == cards[2].getValue() &&
              cards[3].getValue() == cards[4].getValue() ;

      // x x y y y
      full2 = cards[0].getValue() == cards[1].getValue() &&
              cards[2].getValue() == cards[3].getValue() &&
              cards[3].getValue() == cards[4].getValue() ;
      
      return (full1 || full2);
   }   
   
   public static boolean has2Pair(Card[] cards){ // Check for 2 pairs
      
      boolean twoPair1, twoPair2, twoPair3;
      
      if(has4OfAKind(cards) || hasFullHouse(cards) || has3OfAKind(cards))
         return false;
      
      // a a b b x
      twoPair1 = cards[0].getValue() == cards[1].getValue() &&
                 cards[2].getValue() == cards[3].getValue() ;
      
      // a a x b b
      twoPair2 = cards[0].getValue() == cards[1].getValue() &&
                 cards[3].getValue() == cards[4].getValue() ;
      
      // x a a b b
      twoPair3 = cards[1].getValue() == cards[2].getValue() &&
                 cards[3].getValue() == cards[4].getValue() ;      
      
      return (twoPair1 || twoPair2 || twoPair3);
   }
   
   public static String evaluateOneHandOfPoker(){ // Runs checks for one hand
      
      Card[] hand = new Card[5];
      Deck deck = new Deck();
      String call = "";
      
      // Creates new deck
      deck.reset();
      deck.shuffle();
      
      // Deals 5 cards to hand
      for(int i = 0; i < 5; i++)
         hand[i] = deck.deal();
      
      // Sorts cards
      Arrays.sort(hand);
      
      // Determine hand type
      if(hasRoyalFlush(hand))
         call = "Royal Flush"; 

      else if(hasStraightFlush(hand))
         call = "Straight Flush";      
      
      else if(has4OfAKind(hand))
         call = "Four of a Kind";   
      
      else if(hasFullHouse(hand))
         call = "Full House";      
      
      else if(hasFlush(hand))
         call = "Flush";
      
      else if(hasStraight(hand))
         call = "Straight"; 
      
      else if(has3OfAKind(hand))
         call = "Three of a Kind";      
      
      else if(has2Pair(hand))
         call = "Two Pair";          
      
      else if(hasPair(hand))
         call = "One Pair";      
      
      else
         call = "Loser";

      return call;
   }
   
   public static void playAndShowStats(int n){ // Calculates and outputs stats
      
      // Start timer
      long timeStart = System.currentTimeMillis();
      
      int[] i = new int[10];
      int tempN = n;
      
      while(tempN > 0){
      
         String call = evaluateOneHandOfPoker(); 
         
         // Count hand occurrences
         if(call.equals("Loser"))
            i[0]++;
         
         else if(call.equals("One Pair"))
            i[1]++;
      
         else if(call.equals("Two Pair"))
            i[2]++;
         
         else if(call.equals("Three of a Kind"))
            i[3]++;        
         
         else if(call.equals("Straight"))
            i[4]++;         
         
         else if(call.equals("Flush"))
            i[5]++;         
      
         else if(call.equals("Full House"))
            i[6]++;        
         
         else if(call.equals("Four of a Kind"))
            i[7]++;         
         
         else if(call.equals("Straight Flush"))
            i[8]++;             
      
         else
            i[9]++; // Royal Flush       
                     
      tempN--;
      }

      // End timer
      long timeEnd = System.currentTimeMillis();
      long time = timeEnd - timeStart;
      double seconds = time / 1000.0;
      
      String[] s = {"Loser", "One Pair", "Two Pair", "Three of a Kind",
                    "Straight", "Flush", "Full House", "Four of a Kind",
                    "Straight Flush", "Royal Flush"};
      
      double[] d = new double[10];
      double n2 = n;
      // Calculate percentage
      d[0] = (i[0]*100) / n2;
      d[1] = (i[1]*100) / n2;
      d[2] = (i[2]*100) / n2;
      d[3] = (i[3]*100) / n2;
      d[4] = (i[4]*100) / n2;
      d[5] = (i[5]*100) / n2;
      d[6] = (i[6]*100) / n2;
      d[7] = (i[7]*100) / n2;
      d[8] = (i[8]*100) / n2;      
      d[9] = (i[9]*100) / n2;      
      
      // Output
      System.out.printf("%16s:%8d %10.5f%%%n", s[0], i[0], d[0]);
      System.out.printf("%16s:%8d %10.5f%%%n", s[1], i[1], d[1]);
      System.out.printf("%16s:%8d %10.5f%%%n", s[2], i[2], d[2]);
      System.out.printf("%16s:%8d %10.5f%%%n", s[3], i[3], d[3]);
      System.out.printf("%16s:%8d %10.5f%%%n", s[4], i[4], d[4]);
      System.out.printf("%16s:%8d %10.5f%%%n", s[5], i[5], d[5]);
      System.out.printf("%16s:%8d %10.5f%%%n", s[6], i[6], d[6]);
      System.out.printf("%16s:%8d %10.5f%%%n", s[7], i[7], d[7]);
      System.out.printf("%16s:%8d %10.5f%%%n", s[8], i[8], d[8]);
      System.out.printf("%16s:%8d %10.5f%%%n", s[9], i[9], d[9]);
      System.out.println("-------------------------------------------");
      System.out.println(n + " hands analyzed in " + seconds + " seconds.");
   }
}