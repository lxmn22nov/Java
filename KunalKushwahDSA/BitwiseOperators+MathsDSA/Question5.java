//Question5: Set the kth  bit of a number in binary representation?
import java.util.Scanner;
public class Question5 {
      static int setkthBit(int n, int k){
      //function to set kth bit.
            return ((1 << k) | n);
      }
      public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            int n = input.nextInt();
            System.out.print("Enter the value of k: ");
            int k = input.nextInt();
            System.out.println("kth bit set number: "+setkthBit(n,k));
      }  
}