//Printing right angled triangle inverted to top-right side.
import java.util.Scanner; 
public class pattern4 
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
                if(i <= j)                      //(j >= i)
                {
                    //Printing index value "i".
                    // System.out.print(i+" ");

                    //Printing index value "j".
                    // System.out.print(j+" ");

                    //Printing "*" pattern.
                    // System.out.print("* ");

                    //Printing letter "A".
                    // System.out.print("A ");

                    //Printing natural numbers.
                    System.out.format("%2d ",count++);

                    //Printing Alphabet.
                    // System.out.print((count++)+" ");
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
