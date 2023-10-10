//Checking whether the given number is palindrome or not.
import java.util.Scanner;
public class palindromeNumber 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //Taking user input.
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        int m = n;
        int rem, rev = 0;
        //Using while loop.
        while(n > 0)
        {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        System.out.println("The given number "+m+" is reversed: "+rev);
        if(m == rev)
        {
            System.out.println("The given number is a Palindrome Number!");
        }
        else
        {
            System.out.println("The given number is not a Palindrome Number!");
        }
    }
}
