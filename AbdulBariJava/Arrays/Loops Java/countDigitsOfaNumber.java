//Counting digits of a number.
import java.util.Scanner;
public class countDigitsOfaNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //Taking user input.
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        //Using while loop.
        int count = 0;
        while(n > 0)
        {
            n = n / 10;
            count++;
        }
        System.out.print("The number of digits present in a number is: "+count);
        System.out.println();
    }
} 