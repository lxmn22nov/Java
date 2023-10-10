//Max method avoiding static declaration, using Object class and calling.
import java.util.Scanner;
public class maxMethod1
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first value(x): ");
        int x = input.nextInt();
        System.out.print("Enter the second value(y): ");
        int y = input.nextInt();

        //Using object class to implement the max method.
        maxMethod1 mp = new maxMethod1();
        System.out.println(mp.max(x, y));
    }

    //Avoided static field into max method via using object class.
    int max(int x, int y)
    {
        if(x > y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
}