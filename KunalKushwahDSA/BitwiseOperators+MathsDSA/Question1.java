//Question01: Given a number "n". Find if it is odd or even?
import java.util.Scanner;

//implementing using BITWISE OR(|).
/*public class Question1{
      //using BITWISE OR operation of the even number by 1 increment the value of the number by 1, 
      //otherwise it remains unchanged. 
      public static boolean isOdd(int n){
            return ((n | 1) == n);
            // return ((n | 1) > n);
      }
      public static void main(String[] args) {
            // int n = 6;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of integer: ");
            int n = input.nextInt();
            System.out.println(isOdd(n));
      }
}*/

//implementing using BITWISE AND(&).
/*public class Question1{
      //Using BITWISE AND operation of the odd number by 1 will be 1 because 
      //the last bit will be already set, otherwise it will give 0.
      public static boolean isOdd(int n){
            //return true for odd integers.
            return ((n & 1) == 1);
            //return true for even integers.
            // return ((n & 1) == 0);
      }
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of integer: ");
            int n = input.nextInt();
            System.out.println(isOdd(n));
      }
}*/

//implementing using BITWISE XOR(^).
public class Question1{
      //Using BITWISE XOR operation of even number by 1 increment the value of the number by 1.
      //Otherwise, it decrements the value of the number by 1, if the value is odd.
      public static boolean isOdd(int n){
            //return for odd integers.
            return ((n ^ 1) == n - 1);
            //return for even integers.
            // return ((n ^ 1) == n + 1);
      }
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of integer: ");
            int n = input.nextInt();
            System.out.println(isOdd(n));
      }
}