//Creating and Accessing the elements of an array.
public class Intro2DArray
{
    public static void main(String[] args)
    {
        //TYPE-1:declaring 2D array.
        int arr1[][] = new int[3][4];
        System.out.println("The size of arr1: "+arr1.length);
        //Printing arr1 elements.
        System.out.println("Elements present into arr1: ");
        //accessing elements of arr1.
        for(int i = 0; i <arr1.length; i++)                 //outer loop defines no.of rows.
        {
            for(int j = 0; j < arr1[0].length; j++)         //inner loop defines no.of columns.
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        //TYPE-2:declaring 2D array.
        int arr2[][] = {{1,2,3,4},{5,6,7,8},{2,4,6,8}};
        System.out.println("The size of arr2: "+arr2.length);
        //Printing arr2 elements.
        System.out.println("Elements present into arr2: ");
        //accessing elements of arr2.
        for(int i = 0; i < arr2.length; i++)                //outer loop defines no.of rows.
        {
            for(int j = 0; j < arr2[0].length; j++)         //inner loop defines no.of columns.
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}