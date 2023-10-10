//Searching second maximum element from an array.
public class secondMaxElement 
{
    public static void main(String[] args) 
    {
        int arr[]={12,10,9,8,18};
        int max1, max2;
        max1=max2=arr[0];

        System.out.println("The size of the array: "+arr.length);
        System.out.print("Elements present into an array: ");

        //Accessing elements of an array.
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max1)
            {
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2)
            {
                max1 = arr[i];
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Max2 element is: "+max2);

    }
}