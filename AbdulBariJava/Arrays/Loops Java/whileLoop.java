//Implementation of while loop.
public class whileLoop 
{
    public static void main(String[] args)
    {
        //Conventional implementation of while loop.
        /*int i=1;
        System.out.print("The sequence is: ");
        while(i < 99)
        {
            System.out.print(i+" ");
            i *= 2;
        }*/

        //Implementation of while loop when condition is pre-checked.
        int i = 99;
        System.out.print("The sequence is: ");
        while(i < 99)
        {
            System.out.print(i+" ");
            i *= 2;
        }
        System.out.println();
    }
}