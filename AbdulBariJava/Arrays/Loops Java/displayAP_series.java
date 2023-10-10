//Displaying Arithmetic Progression(AP) series.
import java.util.Scanner;
public class displayAP_series
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Total numbers in the series: ");
        int n = input.nextInt();
        System.out.print("First term of the AP(a): ");
        int a = input.nextInt();
        System.out.print("Comman Difference of the AP(d): ");
        int d = input.nextInt();

        int term = a;
        System.out.print("The Arithmetic Progression: ");
        //Using for loop for printing the series.
        for(int i = 0; i < n; i++)
        {
            System.out.print(term+" ");
            term = term + d;
        }
        System.out.println();
    }
}
