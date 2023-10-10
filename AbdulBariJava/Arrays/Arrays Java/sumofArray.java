//Sum of the elements present into an array.
public class sumofArray
{
    public static void main(String[] args) 
    {
        int arr[]={12,10,9,8,18};
        int sum=0;

        System.out.println("The size of an array: "+arr.length);
        System.out.print("Elements present in the array: ");

        //Accessing the elements of an array.
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
            sum = sum + arr[i];
        }
        System.out.println();
        System.out.println("Sum of the elements present in the array: "+sum);

    }
}
