//Implementing the exception demo.
import java.util.Scanner;
class ExceptionDemo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();

        try 
        {
            int c = a / b;
            System.out.println("Division of c: "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0,try again!");
        }
        System.out.println("Thanks!");
    }
}