//Implementing throws keyword to check the age of the user.
public class throws1 
{
    static void checkAge(int Age) throws ArithmeticException
    {
        if(Age < 18)
        {
            throw new ArithmeticException("Access denied - You must be atleast 18 years old!");
        }
        else
        {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) 
    {
        checkAge(17);
    }
}