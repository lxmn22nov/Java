//Calculating discount using varargs.
public class VarArgs3 
{
    //P=price of article.
    static double discount(double ... P)
    {
        //sum of prices.
        double sum = 0;
        for(int i = 0; i < P.length; i++)
        {
            sum = sum + P[i];
        }
        if(sum < 500)
        {
            return sum * 0.05;
        }
        else if(sum >= 500 && sum <= 1000)
        {
            return sum * 0.10 ;
        }
        else
        {
            return sum * 0.20;
        }
    }
    //Main Method.
    public static void main(String[] args)
    {
        System.out.println(discount(250,300));
    }

}