//Reverse copying elements of arr1 to arr2.
public class reverseCopyingElements 
{
    public static void main(String[] args)
    {
        //declaring elements of an array.
        int arr1[] = {12,10,9,8,18};

        //declaring the size of an array.
        int arr2[] =  new int[6];

        System.out.print("The size of arr1: "+arr1.length+"\n"+"The size of arr2: "+arr2.length+"\n");
        System.out.print("Elements present into arr1: ");
        //accessing elements of arr1.
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        //reversing, copying the elements into arr2.
        for(int i = arr1.length-1, j = 0; i >= 0; i--, j++)
        {
            arr2[j] = arr1[i];
        }

        System.out.print("Elements present into arr2: ");
        //accessing elements of arr2.
        for(int i = 0; i < arr2.length; i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
}