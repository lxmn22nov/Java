//Using nested for loops.
import java.util.Scanner;
public class nestedLoops 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("No.of Rows(r): ");
        int r = input.nextInt();
        System.out.print("No.of Columns(c):");
        int c = input.nextInt();

        System.out.println("The elements inside are: ");
        //Printing rows & columns with the help of for nested loops.
        for(int i = 1; i <= r; i++)
        {
            for(int j = 1; j <= c; j++)
            {
                System.out.print("("+i+","+j+") ");
            }
            System.out.println();
        }
    }
}
