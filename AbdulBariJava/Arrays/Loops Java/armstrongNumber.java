//Checking whether the given is Armstrong number or not.
import java.util.Scanner;
public class armstrongNumber 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //Taking user input.
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        //Putting initial value of n into m, so that eventually dividing "n" by 10, the value of "n" remains 0.
        int m = n; 

        int rem, sum = 0;
        //Using while loop.
        while(n > 0)
        {
            rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        System.out.println("The cube and sum of a number "+m+" is: "+sum);

        if(m == sum)
        {
            System.out.println("The given number is an Armstrong Number!");
        }
        else
        {
            System.out.println("The given number is not an Armstrong Number!");
        }
    }
}
