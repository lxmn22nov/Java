public class reverseArrayString
{
    static void reverseArrayString1(char arr[], int start, int end)
    {
        char temp;

        while(start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void printArrayString(char arr[], int size)
    {
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        char arr[]={'L','A' ,'X' ,'M' ,'A', 'N'};
        int size=arr.length;
        System.out.print("String before Reversal:");
        printArrayString(arr, size);
        reverseArrayString1(arr,0,5);
        System.out.print("String after Reversal:");
        printArrayString(arr, size);
    }
}