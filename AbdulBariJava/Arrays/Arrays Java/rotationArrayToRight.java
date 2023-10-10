
public class rotationArrayToRight
{
    public static void main(String[] args) 
    {
        int arr[]={12,10,9,8,18};

        System.out.print("Elements before rotation(to right): ");
        //Accessing the elements of an array.
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int temp = arr[arr.length-1];

        for(int i=arr.length-1; i>0; i--)
        {
            arr[i] = arr[i-1];
        }

        arr[0]=temp;
        System.out.print("Elements after rotation(to right): ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
