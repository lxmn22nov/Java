//Right shift implementation.
import java.util.Scanner;
public class BitwiseRightShift
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of (x): ");
        int x = input.nextInt();

        int z;
        z = x >> 1;
        System.out.println("The result of right shift (z): "+z);
    }
} 