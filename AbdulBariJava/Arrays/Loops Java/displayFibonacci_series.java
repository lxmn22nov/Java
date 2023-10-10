//Displaying the Fibonacci Series without recursion.
import java.util.Scanner;
public class displayFibonacci_series
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Total number of terms: ");
        int n = input.nextInt();
        System.out.print("Zero'th term of the series(a): ");
        int a = input.nextInt();
        System.out.print("first term of the series(b): ");
        int b = input.nextInt();

        //Declaring third term.
        int c;
        //Printing the first two terms of the series.
        System.out.print("The Fibonacci Series: "+a+" "+b+" ");
        //Condition is "n-2" because two terms are printed already, and iteration starts from 0.
        for(int i = 0; i < n-2; i++)
        {
            //Sum of "first+second" term stored into "third" term.
            c = a + b;
            //Printing the value of "c".
            System.out.print(c+" ");
            //Inter-changing the values of second(b) into first(a), third(c) into second(b), and so on. 
            a = b;
            b = c;
        }
        System.out.println();
    }
}
