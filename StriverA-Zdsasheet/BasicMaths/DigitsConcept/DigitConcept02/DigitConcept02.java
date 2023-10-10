//Question02: Count the number of digits of the given number.
import java.util.Scanner;

public class DigitConcept02{
      static void NoOfDigits(int N){
            int counter = 0;

            while(N > 0){
                  // int lastDigit = N % 10;
                  // counter++;
                  counter += 1;
                  N = N / 10;
            }
            System.out.println("Number of Digits: "+counter);
      }
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of N: ");
            int N = input.nextInt();
            NoOfDigits(N);
      }      
}