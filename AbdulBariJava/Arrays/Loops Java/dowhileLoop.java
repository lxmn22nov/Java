//Implementation of do while Loop.
public class dowhileLoop 
{
    public static void main(String[] args)
    {
        //Conventional implementation of do-while loop.
        /*int i = 1;
        System.out.print("The sequence is: ");
        do
        {
            System.out.print(i+" ");
            i *= 2;
        }
        while(i < 99);*/

        //Implementation of do while loop when "i != i", then also the value of "i" gets printed.
        //Because of the do-while loop post-checking condition. 
        int i =99;
        System.out.print("The sequence is: ");
        
        do
        {
            System.out.print(i+" ");
            i *= 2;
        }
        while(i < 99);
        System.out.println();

    }
}
