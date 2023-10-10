//Printing the Inverted right angled triangle using nested for loops.
import java.util.Scanner;
public class pattern3 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("No.of rows(r): ");
        int r = input.nextInt();
        System.out.print("No.of Columns(c): ");
        int c = input.nextInt();

        int count = 1;
        // char count = 'A';
        System.out.println("The Pattern: ");
        //Implementing nested for loops.
        for(int i = 1; i <= r; i++)             //Outer loop using as rows.
        {
            for(int j = 1; j <= c - i + 1; j++) //Inner loop using as columns.
            {
                // //Printing the index value "i" into the matrix.
                // System.out.print(i+" ");

                // //Printing the index value "j" into the matrix.
                // System.out.print(j+" ");

                // //Printing "*" pattern into the matrix.
                // System.out.print("* ");

                // //Printing the letter "L" into the matrix.
                // System.out.print("L ");

                // //Printing the natural numbers into the matrix.
                System.out.format("%-2d ",count++);

                // //Printing the alphabet into the matrix.
                // System.out.format("%2c ",count++);
            }
            System.out.println();
        }
    }
}