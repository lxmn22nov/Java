//Checking prime number.
import java.util.Scanner;
public class checkingPrimeNo1
{
    static boolean isPrime(int n)
    {
        for(int i = 2; i < n/2; i++)
        {
            if(n % 2 == 0)
            {
                return false;
            }
        }
        return true;
    }

    //Main Method.
    public static void main(String[] args)
    {
        //91 is the prime number bacause it has two factors only 1 and 91.
        System.out.println(isPrime(91));
        //50 is the prime number because it has more than two factors which are 1,2,5,10,25,50
        System.out.println(isPrime(50));
    }

} 