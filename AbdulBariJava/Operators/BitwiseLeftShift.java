//Implementation of Left Shift.
import java.util.Scanner;
public class BitwiseLeftShift 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value (x): ");
        int x = input.nextInt();

        int z;
        //Basically left shift work as the "x" multiplied to the power of 2, power of 2 will be defined after this "<<" sign.
        z = x << 1;
        System.out.println("The result of left shift: "+z);
    }
}