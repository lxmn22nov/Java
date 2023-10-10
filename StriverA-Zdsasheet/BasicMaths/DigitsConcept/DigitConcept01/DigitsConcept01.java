//Question01: Extraction of digits.
import java.util.Scanner;

public class DigitsConcept01{
      public static void extractingDigits(int N){
            System.out.println("Extracted Digits in reverse- ");
            while(N > 0){
                  int lastDigit = N % 10;
                  System.out.println(lastDigit);
                  N = N / 10;
            }
      }
      public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of N: ");
            int N = input.nextInt();
            extractingDigits(N);
      }
}