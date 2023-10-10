//Question03: Check if the given array is sorted.
import java.util.*;

public class Array01 {
      static boolean isArraySorted(int[] arr, int n){
            for(int i = 1; i < n; i++){
                  if(arr[i] >= arr[i-1]){

                  }
                  else{
                        return false;
                  }
            }
            return true;
      }
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Size of an array: ");
            int n = input.nextInt();
            int[] arr = new int[5];
            System.out.print("Elements into an array: ");
            //taking user input.
            for(int i = 0; i < n; i++){
                  arr[i] = input.nextInt();
            }
            System.out.println("Is the array sorted: "+isArraySorted(arr, n));
      }      
}
