//Finding factorial of a number.
import java.util.Scanner;
public class factorial 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //Taking user input.
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        long fact = 1;
        //Using for loop.
        for(int i = 1; i <= n; i++)
        {
            fact = fact  * i;
        }
        System.out.print("The factorial of "+n+" numbers is: "+fact);
        System.out.println();
    }
}