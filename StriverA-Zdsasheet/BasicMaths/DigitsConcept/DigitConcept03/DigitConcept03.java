//Question03: Reverse the number.
import java.util.Scanner;

public class DigitConcept03 {
      static void reverseTheNumber(int N){
            int reverseNum = 0;
            while(N > 0){
                  int lastDigit = N % 10;
                  reverseNum = (reverseNum * 10) + lastDigit;
                  N = N / 10;
            }
            System.out.println("The reversed number: "+reverseNum);
      }
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of N: ");
            int N = input.nextInt();
            reverseTheNumber(N);
      }    
}