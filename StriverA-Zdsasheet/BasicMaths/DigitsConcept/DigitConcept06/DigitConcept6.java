/*Question06: Print all divisors.
###BRUTE FORCE SOLUTION###
*/
import java.util.*;

/*public class DigitConcept6 {
      static void printDivisors(int N){
            System.out.print("Divisors of "+N+" are: ");
            for(int i = 1; i <= N; i++){                    //TIME COMPLEXITY-O(N)
                  if(N % i == 0){
                        System.out.print(" "+i);
                  }
            }
            System.out.println();
      }
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of N: ");
            int N = input.nextInt();
            printDivisors(N);
      }
}*/
public class DigitConcept6{
      static void printDivisors(int N){
            ArrayList<Integer> ls = new ArrayList<>();
            for(int i = 1; i <= Math.sqrt(N); i++){
                  if(N % i == 0){
                        ls.add(i);
                        if(N / i != i){
                              ls.add(N / i);
                        }
                  }
            }
            Collections.sort(ls);
            System.out.println("Divisors of "+N+" in ArrayList: "+ls);
      }
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of N: ");
            int N = input.nextInt();
            printDivisors(N);
      }
}