//Question06: Left Rotate array by one place.
import java.util.*;

public class Array01{
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Size of an array: ");
            int n = input.nextInt();
            int[] arr = new int[6];

            System.out.print("Elements into an array: ");
            //taking user input.
            for(int i = 0; i < n; i++){
                  arr[i] = input.nextInt();
            }

            int temp = arr[0];
            for(int i = 1; i < n; i++){
                  arr[i - 1] = arr[i];
            }
            arr[n - 1] = temp;
            // System.out.println("Array after left rotation: "+Arrays.toString(arr));
            System.out.print("Array after left rotation: ");
            for(int i = 0; i < n; i++){
                  System.out.print(arr[i]+" ");
            }
            System.out.println();
      }
}