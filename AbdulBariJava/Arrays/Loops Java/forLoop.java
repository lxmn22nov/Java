
public class forLoop 
{
    public static void main(String[] args)
    {
        // System.out.print("The numbers from 0 to 9: ");
        //Implementing for loop in increasing order.
        /*for(int i = 0; i <= 9; i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();*/

        /*System.out.print("The numbers from 10 to 0: ");
        //Implementing for loop in decreasing order.
        for(int i = 10; i >= 0; i--)
        {
            System.out.print(i+" ");
        }
        System.out.println();*/

        //Executing multiple variable into for loop (condition).
        System.out.println("The numbers: ");
        for(int i = 0, j = 1; i <= 9; i++, j *= 2)
        {
            System.out.println(i+" "+j);
        }
        System.out.println();
    }
}
