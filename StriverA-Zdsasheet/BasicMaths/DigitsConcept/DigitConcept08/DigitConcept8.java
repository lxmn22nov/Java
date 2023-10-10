//Question08: Check the GCD of a number.
import java.util.*;

public class DigitConcept8 {
      static void isGCD(int N1, int N2){
            int gcd = 0;
            for(int i = 1; i <= Math.min(N1, N2); i++){
                  if(N1 % i == 0 && N2 % i == 0){
                        gcd = i;
                  }
            }
            System.out.println("The GCD of "+N1 +" and " + N2+": "+gcd);
      }
      public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of N1 and N2: ");
            int N1 = input.nextInt();
            int N2 = input.nextInt();
            isGCD(N1, N2);
      }
}
