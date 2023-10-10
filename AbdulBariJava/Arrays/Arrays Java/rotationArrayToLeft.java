public class rotationArrayToLeft
{
    public static void main(String[] args) 
    {
        int arr[]={12,10,9,8,18};
        
        //Rotation of elements to left side.
        System.out.print("Array before rotation(to left): ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int temp=arr[0];
        for(int i=1; i<arr.length; i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;

        System.out.print("Array after rotation(to left): ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
