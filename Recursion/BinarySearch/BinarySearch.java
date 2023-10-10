public class BinarySearch{
      //Returns index of target, if it is present in the arr[], else return -1.
      static int binarySearch(int[] arr, int target, int s, int e){
            if(s > e){
                  return -1;
            }
            int mid = s + (e - s)/2;
            //If the element is present at the middle itself.
            if(arr[mid] == target){
                  return mid;
            }
            //If element is smaller than mid, than it can only be present in left subarray.
            if(arr[mid] > target){
                  return binarySearch(arr, target, s, mid-1);
            }
            return binarySearch(arr, target, mid+1, e);
      }
      public static void main(String[] args){
            int[] arr = {1,2,3,4,55,66,77};
            int target = 77;
            System.out.println(binarySearch(arr, target, 0, arr.length-1));
      }
}