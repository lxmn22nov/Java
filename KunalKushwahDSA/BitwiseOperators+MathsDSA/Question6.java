//Question6: Rest kth bit of a number.
import java.util.Scanner;

public class Question6 {
      static int resetBit(int n, int k){
            return (n & (~(1 << (k - 1))));
      }
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            int n = input.nextInt();
            System.out.print("Enter the value of k: ");
            int k = input.nextInt();
            System.out.println("kth bit of the number: "+resetBit(n,k));
      }
}