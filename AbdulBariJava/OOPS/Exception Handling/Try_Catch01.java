//Implementing try and catch keyword into program.
public class Try_Catch01
{
    public static void main(String[] args) 
    {
        try
        {
            int div = 509 / 0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("End of code!");
    }
}