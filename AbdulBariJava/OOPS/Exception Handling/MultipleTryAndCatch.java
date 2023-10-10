//Implementing multiple try and catch block.
public class MultipleTryAndCatch 
{
    public static void main(String[] args)
    {
        int [] arr = {15,24,6,4,0};

        try
        {
            //When any one of the exception arises the other printing will not be printed.
            int c = arr[0] / arr[4];
            System.out.println("Division: "+c);
            System.out.println("Value present at the index: "+arr[2]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0.");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index is invalid!");
        }
        System.out.println("Bye!");
    }
}