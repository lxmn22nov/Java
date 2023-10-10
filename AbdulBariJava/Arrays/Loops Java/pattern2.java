//Printing the patterns with the help of nested for loops.
import java.util.Scanner;
public class pattern2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("No.of rows(r): ");
        int r = input.nextInt();

        //int count = 1;
        char count = 'A';
        System.out.println("The Pattern: ");
        //Using nested for loops.
        for(int i = 1; i <= r; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                // //Printing the indices of "i" as right angled triangle into matrix.
                // System.out.print(i+" ");

                // //Printing the indices of "j" as right angled triangle into matrix.
                // System.out.print(j+" ");

                // //Printing "*" as right angled triangle into matrix.
                // System.out.print("* ");

                // //Printing letter "L" into the matrix.
                // System.out.print("L ");
                
                // //Printing natural numbers in right angled triangle pattern into matrix.
                // System.out.format("%2d ",count++);

                // //Printing Alphabet in right angled triangle pattern into matrix.
                System.out.format("%2c ",count++);
            }
            System.out.println();
        }
    }
}