//Searching element from array with the help of Linear Search.
public class searchingElement
{
    public static void main(String[] args)
    {
        int arr[]={12,10,9,8,18};
        int key=9;
        
        System.out.println("The size of an array: "+arr.length);

        //Acessing the elements of the array.
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==key)
            {
                System.out.println("Key Element "+key+" is present at index: "+i);
                System.exit(0);
            }
        }
        System.out.print("Element not found!");
    }
}
