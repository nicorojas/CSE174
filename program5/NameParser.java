// Name: Nico Rojas
// Instructor: Krumpe
// CSE 174-F
// Date: 9/24/2015
// Filename: NameParser.java
// Description: Gather name, address, and phone number from user.
//              Then output the user-inputted info in a neat manner.

import java.util.Scanner;

public class NameParser {
   
   public static void main(String[] args) { 

      Scanner kb = new Scanner(System.in);
      String nameOrig, addressOrig, phoneOrig, lastName,  titleName, firstName,
             cityStateZip, streetNumName, phoneNew;
      int firstComma, secComma, lastComma, space;
      
      System.out.println("Name: ");
      nameOrig = kb.nextLine();
      
      System.out.println("Address: ");
      addressOrig = kb.nextLine();
      
      System.out.println("Phone: ");
      phoneOrig = kb.nextLine();
      
      // Name Parser
      nameOrig = nameOrig.toLowerCase();
      firstComma = nameOrig.indexOf(",");
      secComma = nameOrig.lastIndexOf(",");
      
         // last
         lastName = nameOrig.substring(0,firstComma);
         lastName = lastName.trim();
         lastName = lastName.substring(0,1).toUpperCase()
                  + lastName.substring(1);
         
         // first
         firstName = nameOrig.substring(firstComma + 1, nameOrig.length());
         space = firstName.lastIndexOf(" ");
         firstName = firstName.substring(space, firstName.length());
         firstName = firstName.trim();
         firstName = firstName.substring(0,1).toUpperCase()
                   + firstName.substring(1);
                                 
      // Address Parser
      lastComma = addressOrig.lastIndexOf(",");
      
         // City, State, Zip Code
         // always second to last comma and forward
         cityStateZip = addressOrig.substring(0, lastComma);
         secComma = cityStateZip.lastIndexOf(",");
         cityStateZip = addressOrig.substring(secComma + 1,
                                              addressOrig.length());
         cityStateZip = cityStateZip.trim();
         
         // Street Number, Name, Apt
         streetNumName = addressOrig.substring(0, secComma);
      
      // Phone Parser
      phoneNew = phoneOrig.replaceAll("[^0-9]","");
      phoneNew = phoneNew.substring(0,3) + "-" + phoneNew.substring(3,6) + "-"
               + phoneNew.substring(6,10);
         
      // Output
      System.out.println("***** Results *****");
      System.out.println(firstName + " " + lastName);
      System.out.println(streetNumName);
      System.out.println(cityStateZip);
      System.out.println(phoneNew);
   }
}