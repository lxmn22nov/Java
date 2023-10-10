//Printing the numbers in matrix using nested loops.
import java.util.Scanner;
public class pattern1 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("No.of Rows(r): ");
        int r = input.nextInt();
        System.out.print("No.of Columns(c): ");
        int c = input.nextInt();

        int count = 1;
        System.out.println("The Pattern: ");
        //Printing the numerals.
        for(int i = 1; i <= r; i++)
        {
            for(int j = 1; j <= c; j++)
            {
                //Printing the index value of "i".
                System.out.print(i+" ");

                // //Printing the index value of "j".
                // System.out.print(j+" ");

                // //Printing the "*" into the matrix.
                // System.out.print("*"+" ");

                // //Printing the letter into the matrix.
                // System.out.print("C"+" ");

                // //Adding the indices and storing them into matrix.
                // System.out.print((i+j)+" ");

                // //Prints the natural numbers into the matrix.
                // System.out.format("%02d ",count++);     
            }
            System.out.println();
        }
    }
}
