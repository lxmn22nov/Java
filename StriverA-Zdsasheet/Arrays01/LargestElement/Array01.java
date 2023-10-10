//Question01: Largest element in the array.
import java.util.*;
//Brute Force Solution.

/*public class Array01 {
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] arr = new int[5];
            System.out.print("Enter the size of an array: ");
            int n = input.nextInt();
            System.out.print("Enter the elements of the array: ");
            //elements input taking from user.
            for(int i = 0; i < n; i++) {
                  arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("Elements after sorting: "+Arrays.toString(arr));
            System.out.println("Largest element in an array: "+arr[n-1]);
      }
}*/

//Optimal Solution
public class Array01 {
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] arr = new int[5];
            System.out.print("Enter the size of an array: ");
            int n = input.nextInt();
            System.out.print("Elements inside the array: ");
            //taking user input.
            for(int i = 0; i < n; i++) {
                  arr[i] = input.nextInt();
            }
            int largest = arr[0];
            for(int i = 0; i < n; i++) {
                  if(arr[i] > largest) {
                        largest = arr[i];
                  }
            }
            System.out.println("Largerst element: "+largest);
      }
}
