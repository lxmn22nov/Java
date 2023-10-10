//Searching maximum element from an array.
public class maxElement
{
    public static void main(String[] args)
    {
        int arr[]={12,10,9,8,18};
        int max=arr[0];

        System.out.println("The size of an array: "+arr.length);
        System.out.print("Elements present into the array: ");

        //Accessing the elements of an array.
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Maximum element is: "+max);
    }
}
