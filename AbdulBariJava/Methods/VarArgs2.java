//Sum of all elements using VarArgs.
public class VarArgs2 
{
    static int sum(int ... A)
    {
        int s = 0;
        for(int i = 0; i < A.length; i++)
        {
            s = s +A[i];
        }
        return s;
    }
    //Main Method.
    public static void main(String[] args)
    {
        System.out.println("Sum of VarArgs: "+sum(10,20,30,40,50));
    }
    
}