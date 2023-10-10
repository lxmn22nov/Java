//XOR implementation.
import java.util.Scanner;
public class BitwiseXORoperation 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first value (x): ");
        int x = input.nextInt();
        System.out.print("Enter the second value(y): ");
        int y = input.nextInt();

        int z;
        
        z = x ^ y;
        System.out.println("The result of XOR operation (z):"+z);
    }
}