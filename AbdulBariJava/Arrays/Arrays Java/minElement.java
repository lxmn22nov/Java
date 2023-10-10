//Searching minimum element from an array.
public class minElement
{
    public static void main(String[] args)
    {
        int arr[]={12,10,9,8,18};
        int min=arr[0];

        System.out.println("The size of the array: "+arr.length);
        System.out.print("Elements present into an array: ");

        //Accessing the elements of an array.
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Minimum element is: "+min);
    }

}