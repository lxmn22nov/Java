//Basics of VarArgs.
public class VarArgDemo 
{
    static void SumArgs(int i, int ... j)
    {
        System.out.println("No.of variable arguements: "+j.length);
        int sum = i;
        for(int x: j)
        {
            sum = sum + x;
        }
        System.out.println("Sum of the arguements: "+sum);
    }
    public static void main(String[] args)
    {
        //No variable arguement.
        SumArgs(1);
        //3 variable arguement.
        SumArgs(1,2,3,4);
        //2 variable arguement.
        SumArgs(4,5,10);
    }
}