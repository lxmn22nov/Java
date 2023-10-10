//Question05: Armstrong Number.
import java.util.*;

public class DigitConcept5 {
      static int power(int N, long counter){
            if(counter == 0){
                  return 1;
            }
            if(counter % 2 == 0){
                  return power(N, counter/2) * power(N, counter/2);
            }
            return N * power(N, counter/2) * power(N, counter/2);
      }
      static void isArmstrong(int N){
            int duplicate = N;
            int sum = 0;
            int reverseNum = 0;
            int counter = 0;

            while(N > 0){
                  int lastDigit = N % 10;
                  counter += 1;
                  sum = sum + power(lastDigit, counter);
                  reverseNum = (reverseNum * 10) + lastDigit;
                  N = N / 10;
                  
            }
            if(sum == duplicate){
                  System.out.println("The given number "+duplicate+" is an Armstrong Number.");
            }
            else{
                  System.out.println("The given number "+duplicate+" is not an Armstrong Number.");
            }
      }
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of N: ");
            int N = input.nextInt();
            isArmstrong(N);
      }      
}
