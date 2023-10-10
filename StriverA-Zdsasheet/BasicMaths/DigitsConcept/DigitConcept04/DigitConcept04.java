//Question04: Palindrome of the number.
import java.util.Scanner;

public class DigitConcept04 {
      static void isPalindrome(int N){
            //storing the duplicate because the original value of N will shrink to 0 eventually.
            int duplicate = N;
            int reverseNum = 0;

            while(N > 0){
                  int lastDigit = N % 10;
                  reverseNum = (reverseNum * 10) + lastDigit;
                  N = N / 10;
            }
            if(reverseNum == duplicate){
                  System.out.println("The given number "+ duplicate+" is a palindrome number!");
            }
            else{
                  System.out.println("The given number "+ duplicate+ "is not the palindrome number!");
            }
      }
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of N: ");
            int N = input.nextInt();
            isPalindrome(N);
      }
}