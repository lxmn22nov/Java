//OR implementatation.
import java.util.Scanner;
public class BitwiseORoperation
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first value (x): ");
        int x = input.nextInt();
        System.out.print("Enter the second value (y): ");
        int y = input.nextInt();

        int z;
        
        z = x | y;
        System.out.println("The result of OR operation (z): "+z);
    }
} 