/**
 * Auto Generated Java Class.
 */
public class InterviewMethods {
   
   
   public static void main(String[] args) { 
      
      int root = 2, exp = 6;
      
      pow(root, exp);
   }
   
   public static int pow (int root, int exp){
   
      int answer = 1;
      
      for(int i = 0; i < exp; i++)
         answer*= root;
      
      System.out.println(answer);
      
      return answer;
   }
}
