//Method overloading to validate name and age.
public class methodOverloading3 
{
    //method to validate name.
    static boolean validateName(String name)
    {
        return name.matches("[a-zA-Z\\s]*");
    }
    //method to validate age.
    static boolean validateAge(int age)
    {
        return age >= 3 && age <= 15;
    }
    //Main method.
    public static void main(String[] args)
    {
        System.out.println(validateName("Laxman Singh Koranga"));
        System.out.println(validateAge(15));
    }

}