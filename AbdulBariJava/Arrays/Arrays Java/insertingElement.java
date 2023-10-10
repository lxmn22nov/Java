//Inserting an element into an array.
import java.util.Scanner;
public class insertingElement 
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

        //"n" is no.of elements present in the array.
        int n = 6;

        System.out.println("The size of an array: "+arr.length);
        System.out.print("Elements into an array: ");
        
        //Acccessing the elements of an array.
        for(int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //Taking user inputs for inserting an particular element into a particular index.
        System.out.print("Element value is to inserted: ");
        int x = input.nextInt();
        System.out.print("Index value where is to inserted: ");
        int index = input.nextInt();

        //Shifting the elements, so that we can place "x" into an array.
        for(int i = n; i > index; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[index] = x;

        System.out.print("Elements after insertion: ");
        //Accessing array after insertion.
        for(int i =0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}