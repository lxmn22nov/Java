//Sum of "n" natural numbers using for loop.
import java.util.Scanner;
public class sumOfNno
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Taking user input.
        System.out.print("Enter the no.of elements: ");
        int n = input.nextInt();

        int sum = 0;
        //using for loop.
        for(int i = 0; i <= n; i++)
        {
            sum += i;
        }
        System.out.print("The sum of "+n+" numbers is: "+sum);
        System.out.println();
    }
}