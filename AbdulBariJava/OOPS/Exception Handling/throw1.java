//Implementing throw keyword to check age of the user.
public class throw1
{
    static void checkAge(int Age)
    {
        if(Age < 18)
        {
            throw new ArithmeticException("Access denied - You must be 18 years old!");
        }
        else 
        {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) 
    {
        checkAge(15);
    }
}