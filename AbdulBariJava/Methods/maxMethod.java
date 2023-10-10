//Method practice using static.
import java.util.Scanner;
public class maxMethod 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first value(x): ");
        int x = input.nextInt();
        System.out.print("Enter the second value(y): ");
        int y = input.nextInt();

        int c = max(x,y);
        // System.out.println("The maximum element: "+c);
    }

    static int max(int x, int y)
    {
        if(x > y)
        {
            System.out.println("x is greater than y.");
            return x;
        }
        else
        {
            System.out.println("y is greater than x.");
            return y;
        }
    }
}