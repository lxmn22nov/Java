//Increasing the size of an array.

public class increasingSizeOfArray 
{
    public static void main(String[] args)
    {
        //declaring arr1.
        int arr1[] = {12,10,9,8,18};
        System.out.println("The size of arr1: "+arr1.length);

        //declaring arr2.
        int arr2[] = new int[2*arr1.length];
        System.out.println("The size of arr2: "+arr2.length);

        System.out.print("Elements present into arr1: ");
        //accessing elements of arr1.
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        //copying elements of arr1 into arr2(referenced).
        for(int i = 0; i < arr1.length; i++)
        {
            arr2[i] = arr1[i];
        }
        arr1 = arr2;
        // arr2 = null;

        System.out.print("Elements present into arr2(referenced): ");
        //accessing elements of arr2(referenced).
        for(int i = 0; i < arr2.length; i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println("The size of arr1: "+arr1.length);
        System.out.println("The size of arr2: "+arr2.length);
    }
}