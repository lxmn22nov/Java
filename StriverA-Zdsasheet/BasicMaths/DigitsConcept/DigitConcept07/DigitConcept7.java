//Question07: Check whether the number is Prime.
import java.util.*;
//BRUTE FORCE SOLUTION
/*public class DigitConcept7 {
      static void isPrime(int N){
            int counter = 0;

            for(int i = 1; i <= N; i++){              //T.C-O(N)
                  if(N % i == 0){
                        counter++;
                  }
            }
            if(counter == 2){
                  System.out.println("The given number "+N+" is a Prime Number!");
            }
            else{
                  System.out.println("The given number "+N+" is not a Prime Number!");
            }
      }
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of N: ");
            int N = input.nextInt();
            isPrime(N);
      }
}*/
public class DigitConcept7{
      static void isPrime(int N){
            int counter = 0;
            for(int i = 1; i <= Math.sqrt(N); i++){         //T.C-O(sqrtN)
                  if(N % i == 0){
                        counter++;
                        if((N / i) != i){
                              counter++;
                        }
                  }
            }
            if(counter == 2){
                  System.out.println("The given number "+N+" is a Prime Number!");
            }
            else{
                  System.out.println("The given number "+N+" is not a Prime Number!");
            }
      }
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of N: ");
            int N = input.nextInt();
            isPrime(N);
      }
}