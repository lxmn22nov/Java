//Searching minimum second element from an array.
public class secondMinElement
{
    public static void main(String[] args)
    {
        int arr[]={12,10,9,8,18};
        int min1, min2;
        min1=min2=arr[0];

        System.out.println("The size of an array: "+arr.length);
        System.out.print("Elements present in an array: ");

        //Accessing the elements of an array.
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < min1)
            {
                min2 = min1;
                min1 =arr[i];
            }
            else if(arr[i] < min2)
            {
                min2 = arr[i];
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Min2 element is: "+min2);
    }
}