//Question05: Remove duplicates in place from sorted array.
import java.util.*;
//Brute Force Solution.                         T.C-O(nlogn + n)
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
            //Storing array elements into set,because set doesn't contain duplicate data.
            Set<Integer> set = new HashSet<Integer>();
            for(int i = 0; i < n; i++){
                  set.add(arr[i]);
            }
            System.out.println("Elements into the set: "+set);
            //This method is optional.
            /*int index = 0;
            for(int element : set){
                  arr[index] = element;
                  index++;
            }
            System.out.println("The Last element at index: "+index);
      }
}*/
//Optimal Solution.
public class Array01{
      static int removeDuplicates(int[] arr, int n){
            int i = 0;
            for(int j = 1; j < n; j++){
                  if(arr[j] != arr[i]){
                        arr[i+1] = arr[j];
                        i++;
                  }
            }
            return (i+1);
      }
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the size of an array: ");
            int n = input.nextInt();
            int[] arr = new int[6];
            System.out.println("Elements into an array: ");
            //taking user input.
            for(int i = 0; i < n; i++){
                  arr[i] = input.nextInt();
            }
            System.out.println("Last Index value after removing duplicates: "+removeDuplicates(arr, n));
      }
}
