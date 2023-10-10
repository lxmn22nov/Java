//Question07: Move all the zeroes at the end of the array.
import java.util.*;
//BRUTE FORCE.
/*public class Array01{
      static int[] moveZeros(int n, int[] arr){
            // temporary array.
            ArrayList<Integer> temp = new ArrayList<>();
            //copy non-zero elements from original array to temporary array.
            for(int i = 0; i < n; i++){
                  if(arr[i] != 0){
                        temp.add(arr[i]);
                  }
            }
            //number of non-zero elements.
            int nonZero = temp.size();

            //copy elements from temp fill first non-zero fields of original array.
            for(int i = 0; i < nonZero; i++){
                  arr[i] = temp.get(i);
            }
            //fill rest of the cells with zero.
            for(int i = nonZero; i < n; i++){
                  arr[i] = 0;
            }
            return arr;
      }
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Size of the array: ");
            int n = input.nextInt();
            //declaration of an array.
            int[] arr = new int[8];
            System.out.print("Elements into an array: ");
            //taking user input.
            for(int i = 0; i < n; i++){
                  arr[i] = input.nextInt();
            }
            int[] ans = moveZeros(n,arr);
            System.out.print("Elements after moving zeroes at the end: ");
            for(int i = 0; i < n; i++){
                  System.out.print(ans[i]+" ");
            }
            System.out.println();
      }
}*/
//OPTIMAL APPROACH.
public class Array01{
      static int[] moveZeros(int n, int[] arr){
            int j = -1;
            //place the pointer j.
            for(int i = 0; i < n; i++){
                  if(arr[i] == 0){
                        j = i;
                        break;
                  }
            }
            //no non-zero elements.
            if(j == -1){
                  return arr;
            }
            //move the pointer i and j & swap accordingly.
            for(int i = j+1; i < n; i++){
                  if(arr[i] != 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        j++;
                  }
            }
            return arr;
      }
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Size of an array: ");
            int n = input.nextInt();
            //declaring an array.
            int[] arr = new int[8];
            System.out.print("Elements into an array: ");
            //taking user input.
            for(int i = 0; i < n; i++){
                  arr[i] = input.nextInt();
            }
            int[] ans = moveZeros(n, arr);
            System.out.print("Array after moving zeros at the end: ");
            for(int i = 0; i < n; i++){
                  System.out.print(ans[i]+" ");
            }
            System.out.println();
      }
}