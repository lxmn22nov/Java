//Displaying Geometric Progression(GP) series.
import java.util.Scanner;
public class displayGP_series
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Total number of terms: ");
        int n = input.nextInt();
        System.out.print("First term of the GP(a): ");
        int a = input.nextInt();
        System.out.print("The comman ratio of the GP(r): ");
        int r = input.nextInt();


        int term = a;
        System.out.print("The Geometric Progression(GP) series: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(term+" ");
            //Multiplied "r" because the common ratio of second and first, is multiplied throughout the series.
            term = term * r;
        }
        System.out.println();
    }
} 