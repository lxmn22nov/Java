//Question02: Second Largest Element in the array.
import java.util.*;
//Brute Force.                                       T.C-O(nlogn)
/*public class Array01 {
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Size of an array: ");
            int n = input.nextInt();
            int[] arr = new int[5];
            System.out.print("Elements inside the array: ");
            //taking user input.
            for(int i = 0; i < n; i++){
                  arr[i] = input.nextInt();
            }
            Arrays.sort(arr);                                     //T.C- n(log(n)
            System.out.println("Elements after sorting: "+Arrays.toString(arr));
            int largest = arr[n -1];
            int secondLargest = 0;
            
            for(int i = (n - 2); i >= 0; i--) {
                  if(arr[i] != largest){
                        secondLargest = arr[i];
                        break;
                  }
            }
            System.out.println("Second Largest element: "+secondLargest);
      }
}*/
//Better Solution.                                   T.C-O(2N)
/*public class Array01 {
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the size of an array: ");
            int n = input.nextInt();
            int[] arr = new int[6];
            System.out.print("Elements into an array: ");
            for(int i = 0; i < n; i++){
                  arr[i] = input.nextInt();
            }
            // PASS-1
            int largest = arr[0];
            for(int i = 0; i < n; i++){
                  if(arr[i] > largest){
                        largest = arr[i];
                  }
            }
            System.out.println("The First Largest Element: "+largest);
            int secondLargest = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
                  if(arr[i] > secondLargest && arr[i] != largest){
                        secondLargest = arr[i];
                  }
            }
            System.out.println("The Second Largest Element: "+secondLargest);
      }
}*/
//Optimal Solution.                                  T.C-O(N)
public class Array01{
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the size of an array: ");
            int n = input.nextInt();
            int[] arr = new int[6];
            System.out.println("Elements in the array: ");
            //taking user input.
            for(int i = 0; i < n; i++){
                  arr[i] = input.nextInt();
            }
            int largest = arr[0];
            int secondLargest = Integer.MIN_VALUE;

            for(int i = 0; i < n; i++){
                  if(arr[i] > largest){
                        secondLargest = largest;
                        largest = arr[i];
                  }
                  else if(arr[i] < largest && arr[i] > secondLargest){
                        secondLargest = arr[i];
                  }
            }
            System.out.println("The First Largest Element: "+largest);
            System.out.println("The Second Largest Element: "+secondLargest);
      }
}