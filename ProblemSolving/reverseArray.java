public class reverseArray
{
    static void reverseArray1(int arr[], int start, int end)
    {
        int temp;

        while(start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void printArray(int arr[], int size)
    {
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
        public static void main(String[] args)
        {
            int arr[]={12,24,36,48,60,72,84,96,108};
            int size=arr.length;
            System.out.print("Array before Reversal:");
            printArray(arr, size);
            reverseArray1(arr, 0,8);
            System.out.print("Array after Reversal:");
            printArray(arr, size);
        }
}