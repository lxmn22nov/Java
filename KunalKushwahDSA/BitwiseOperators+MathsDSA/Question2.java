/*Question2: Given an array of number and in that array every number appears twice only one number appears once. 
Find that number?
Eg: array = {2,3,3,4,2,6,4}
*/
public class Question2 {
      public static int ans(int[] arr){
            int unique = 0;

            for(int n : arr){
                  unique ^= n;
            }
            return unique;
      }
      public static void main(String[] args) {
            int[] arr = {2,3,3,4,2,6,4};
            System.out.println("The unique number is: "+ans(arr));
      }
}