//Implementation of multiplication table using for loop.
import java.util.Scanner;
public class multiplicationTableByForLoop 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value(multiplication table): ");
        int n =input.nextInt();

        //Using for loop to print the multiplication table of the particular number.
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(n+" x "+i +" = "+n*i);
        }
        System.out.println();

    }
}