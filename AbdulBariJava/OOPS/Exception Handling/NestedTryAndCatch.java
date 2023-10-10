//Implementing Nested Try and Catch.
public class NestedTryAndCatch 
{
    public static void main(String[] args)
    {
        int [] arr = {12,33,6,4,0};

        try
        {
            int c = arr[0] / arr[3];
            System.out.println("Division is "+c);

            try
            {
                System.out.println(arr[5]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Index is Invalid!");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0");
        }
        System.out.println("Bye!");
    }
}