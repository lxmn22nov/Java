//Displaying the digits of a number.
import java.util.Scanner;
public class displayDigitsOfNumber 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //Taking user input.
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        int rem;
        // Using while loop.
        while(n > 0)                        //while loop used for repitition.
        {
            rem = n % 10;
            n = n / 10;
            System.out.println(rem);
        }
        System.out.println(n);
    }
}