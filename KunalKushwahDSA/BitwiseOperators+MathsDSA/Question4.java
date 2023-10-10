//Question04: Find "ith" bit of a number in binary representation?
/*NOTE: Bits are numbered from right(Least Significant Bit) to left(Most Significant Bit). 
*/
import java.util.Scanner;

public class Question4 {
      static void ithBit(long n, long k){
            System.out.println("The ith Bit of "+n+" is: "+((n & (1 << (k-1))) >> (k - 1)));
      }
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            long n = input.nextLong();
            System.out.print("Enter the value of k: ");
            long k = input.nextLong();
            ithBit(n, k);
      }      
}
