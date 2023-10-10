//Printing right angled triangle inverted down-right side.
import java.util.Scanner;
public class pattern5 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("No.of Rows(r): ");
        int r = input.nextInt();
        System.out.print("No.of Columns(c): ");
        int c = input.nextInt();

        int count = 1;
        // char count = 'A';
        System.out.println("The Pattern: ");
        for(int i = 1; i <= r; i++)
        {
            for(int j = 1; j <= c; j++)
            {
                if((i + j) > r)
                {
                    //Printing index value "i".
                    // System.out.print(i+" ");

                    //Printing index value "j".
                    // System.out.print(j+" ");

                    //Printing "*".
                    // System.out.print("* ");

                    //Printing letter "L".
                    // System.out.print("L ");

                    //Printing natual numbers.
                    System.out.format("%2d ", count++);

                    // Printing Alphabet.
                    // System.out.format("%2c ",count++);
                }
                else
                {
                    // System.out.print(" "+" ");
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
