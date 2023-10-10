//Copying elements from arr1 to arr2.

public class copyingElement 
{
    public static void main(String[] args)
    {
        //Declaring arr1.
        int arr1[] = {12,10,9,8,18};

        //Declaring size of arr2.
        int arr2[] = new int[6];

        System.out.print("The size of arr1: "+arr1.length +"\n"+"The size of arr2: "+arr2.length+"\n");
        System.out.print("Elements present into arr1: ");
        //Accessing elements of arr1.
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        //Copying the elements of arr1 into arr2.
        for(int i =0; i < arr1.length; i++)
        {
            arr2[i] = arr1[i];
        }
        arr1=arr2;

        System.out.print("Elements present into arr2: ");
        //Accessing elements of arr2.
        for(int i = 0; i < arr2.length; i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

    }
}