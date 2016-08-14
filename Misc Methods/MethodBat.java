
public class MethodBat {
   
   
   public static void main(String[] args) { 
      
//      int[] nums = {3, 4};
//      
//      int [] newArray = new int[nums.length];
//      int temp = 0;
//      
//      for(int i = 0; i < nums.length; i++){
//         
//         newArray[i] = nums[i];
//      }
//      
//     if(nums == newArray)
//        System.out.println("yes");
//      
//      System.out.println(newArray[5]);
//      System.out.println(nums[5]);
      
      
      int[] array = {3, 4};
      
      // System.out.println(hasSymmetry(array));
      // System.out.println(swap(array));
      // System.out.println(reverseArray(array));
      System.out.println(repeat(array, 2));
   }
   
   
   public static int[] swap(int[] nums){
      
      int[] newArray = new int[nums.length];
      
      int midLength = nums.length/2;
      
      
      for(int x = 0; x < midLength; x++){
         newArray[x] = nums[x+midLength];      
      }
      for(int i = midLength; i < midLength; i++){
         newArray[i-midLength] = nums[i];
      }
      //System.out.println(newArray);
      return newArray;
   }
   
   
   
   
   
   public static int[] swapHalves(int[] nums) {
      
      int[] newArray = {};
      int length = nums.length, halfLength = nums.length/2, temp = 0;
      
      for(int i = 0; i < halfLength/2; i++){
         
         temp = nums[i];
         nums[i] = nums[nums.length - 1 - i];
         nums[(nums.length) - 1 -i] = temp;
      }
      
      
      for(int i = halfLength; i < length; i++){
         
         temp = nums[i];
         nums[i] = nums[nums.length - 1 - i];
         nums[(nums.length) - 1 -i] = temp;
      }
      
      
      return nums;   
   }
   
   
   
   
   public static int[] reverseArray(int[] nums) {
      
      int length = nums.length, halfLength = nums.length/2, temp = 0;
      
      for(int i = 0; i < halfLength; i++){
         
         temp = nums[i];
         nums[i] = nums[nums.length - 1 - i];
         nums[(nums.length) - 1 - i] = temp;
      }
      return nums;
   }
   
   
   
   
   
   
   public static boolean hasSymmetry(int[] nums) {
      
      int [] newArray = new int [nums.length];
      int length = nums.length, halfLength = nums.length/2, temp = 0;
      
      
      for(int i = 0; i < length; i++){
         
         newArray[i] = nums[i];
      }
      
      
      for(int i = 0; i < halfLength; i++){
         
         temp = nums[i];
         nums[i] = nums[nums.length - 1 - i];
         nums[(nums.length) - 1 - i] = temp;
      }
      
      System.out.println(nums);  
      System.out.println(newArray); 
      
      if(newArray == nums)
         return true;
      
      else
         return false;
      
      
   }
   
   
   
   public static int[] sortedInsert(int n, int[] nums) {
      
      int [] newArray = new int [nums.length + 1];
      
      if(nums.length < 1)
         newArray[0] = n;
      
      if(n <= nums[0]){
         newArray[0] = n;   
         
         for(int i = 0; i < nums.length; i++){
            
            newArray[i+1] = nums[i];
         }
      }   
      
      else{
         
         for(int i = 0; i < nums.length; i++){
            
            newArray[i] = nums[i];
            
            if(n > nums[i] && n < nums[i+1])
               nums[i+1] = n;
         }
      }   
      
      return newArray;
   }
   
   
   
   public static int[] repeat(int[] nums, int n) {
  
   int[] newArray = new int[nums.length * n];
   
   for(int i = 0; i < nums.length; i++){
      
      for(int x = 0; x < newArray.length; x++){
         
         newArray[x] = nums[i];
   
      }
   
   }
   return newArray;
   
   
   
  
}

   
  // 'index of' Method
  

//  
//  if(sub.length == 3){
//  
//     for(int i = 0; i < nums.length-2; i++){
//  
//        if(nums[i] == sub[0] && nums[i+1] == sub[1] && nums[i+2] == sub[2])
//           return i;
//     }
//  }
//  
//  else if(sub.length > 1){
//  
//     for(int i = 0; i < nums.length-1; i++){
//  
//        if(nums[i] == sub[0] && nums[i+1] == sub[1])
//           return i;
//      }
//  }
//  
//  else if(sub.length == 0){
//  
//     return 0;
//  }
//  
//  else{
//  
//     for(int i = 0; i < nums.length-1; i++){
//  
//        if(nums[i] == sub[0])
//           return i;
//     }
//  }
//  return -1;
   
   
   
}
