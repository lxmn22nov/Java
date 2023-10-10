//Reversing a number.
import java.util.Scanner;
public class reverse_a_Number 
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
        System.out.print("The given number "+m+"  is reversed: "+rev);
        System.out.println();
    }
}
