//Deleting an element from the array.
import java.util.Scanner;
public class deletingElement
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //Declaring an array.
        int arr[] = new int[10];
        arr[0] = 5;
        arr[1] = 9;
        arr[2] = 6;
        arr[3] = 10;
        arr[4] = 12;
        arr[5] = 7;

        //"n" no.of elements present into an array.
        int n = 6;

        System.out.println("The size of an array: "+arr.length);
        System.out.print("Elements present into an array: ");
        //Accessing elements of an array.
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //Taking user inputs for deleting particular element from particular index value.
        System.out.print("Index value from element has to be deleted: ");
        int delElement = input.nextInt();

        //Deleting element from its index value and shifting the rest elements.
        for(int i = delElement; i < arr.length-1; i++)
        {
            arr[i] = arr[i+1];
        }
        n=n-1;

        //After the deletion the array is.
        System.out.print("Elements present into an array(after deletion): ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}