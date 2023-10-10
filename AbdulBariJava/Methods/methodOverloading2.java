//Method Overloading for reversal of integer and array(1D).
public class methodOverloading2 
{
    static int reverse(int n)
    {
        int rev = 0;

        while(n > 0)
        {
            rev = (rev * 10) + (n % 10);
            n = n/10;
        }
        return rev;
    }
    //Reversal of array(1D).
    static int [] reverse(int A[])
    {
        int B[] = new int[A.length];
        for(int i = A.length -1, j = 0; i >= 0;  i--, j++)
        {
            B[j] = A[i];
        }
        return B;
    }
    //Main Method.
    public static void main(String[] args)
    {
        System.out.println(reverse(22111996));
        // System.out.println(reverse({1,2,4,2,44,26}));
    }
    
}