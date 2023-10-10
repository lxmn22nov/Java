import java.util.Scanner;

public class printElement 
{
    public static void main(String[] args) 
    {
        // int arr[]={10,5,9,12,5};
        //Array as a object.
        int arr[]=new int[4];
        arr[0]=9;
        arr[1]=12;
        arr[3]=33;
        
        // System.out.print("Elements present in the array:");

        //for accessing elements of array.
        for(int i=0; i<arr.length; i++)
        {
            System.out.print("Element present at index: " +i+ " is: "+arr[i]+"\n");
        }
    }
}
