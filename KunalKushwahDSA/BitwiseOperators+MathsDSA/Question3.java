/*Question03: Given all the numbers on the array, contains negative of that number and positive of that number 
but only one number is present by itself. Find that number?
Eg: array = {-2, 3, -3, 4, -4, 2, 1} 
*/
public class Question3{
      public static int ans(int[] arr){
            int unique = 0;

            for(int n : arr){
                  unique += n;
            }
            return unique;
      }
      public static void main(String[] args){
            int[] arr = {-2, 3, -3, 4, -4, 2, 1};
            System.out.println("The unique number is: "+ans(arr));
      }
}