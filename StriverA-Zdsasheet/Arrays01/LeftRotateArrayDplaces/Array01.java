//Question07: Left rotate array by D places?
import java.util.*;
//BRUTE FORCE.
/*public class Array01 {
      static void leftRotate(int[] arr, int n, int d){
            if(n == 0){
                  return;
            }
            //To get the effective no.of rotations.
            d = d % n;
            //checking if d is a multiple of n.
            if(d == 0){
                  return;
            }
            //temporary array.
            int[] temp = new int[d];

            //STEP1: Copying first "d" elements in the temp array.
            for(int i = 0; i < d; i++){
                  temp[i] = arr[i];
            }
            //STEP2: Shift last(n-d) elements to the left by "d" places in the given array.
            for(int i = d; i < n; i++){
                  arr[i - d] = arr[i];
            }
            //STEP3: Place the elements of the temp array in the last "d" places of the given array.
            for(int i = (n - d); i < n ; i++){
                  arr[i] = temp[i - (n - d)];
            }
      }
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Size of the array: ");
            int n = input.nextInt();
            System.out.print("No.of places to rotate: ");
            int d = input.nextInt();
            //declaring an array.
            int[] arr = new int[7];
            System.out.print("Elements into an array: ");
            // taking user input.
            for(int i = 0; i < n; i++){
                  arr[i] = input.nextInt();
            }
            leftRotate(arr, n, d);
            System.out.print("Array after rotation: ");
            for(int i = 0; i < n; i++){
                  System.out.print(arr[i]+ " ");
            }
            System.out.println();
      }
}*/
//OPTIMAL APPROACH.
public class Array01{
      //function to reverse an array.
      static void reverse(int[] arr, int start, int end){
            while(start <= end){
                  int temp = arr[start];
                  arr[start] = arr[end];
                  arr[end] = temp;
                  start++;
                  end--;
            }
      }
      static void leftRotate(int[] arr, int n, int d){
            if(n == 0){
                  return;
            }
            //effective no.of rotations.
            d = d % n;
            //step01:
            reverse(arr, 0, (d - 1));
            //step02:
            reverse(arr, d, (n - 1));
            //step03:
            reverse(arr, 0, (n - 1));
      }
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Size of the array: ");
            int n = input.nextInt();
            System.out.print("No.of places left rotations: ");
            int d = input.nextInt();
            //declaring the array.
            int[] arr = new int[7];
            System.out.print("Elements into an array: ");
            //taking user input.
            for(int i = 0; i < n; i++){
                  arr[i] = input.nextInt();
            }
            leftRotate(arr, n, d);
            System.out.print("Array after rotation: ");
            for(int i = 0; i < n; i++){
                  System.out.print(arr[i]+" ");
            }
            System.out.println();
      }
}