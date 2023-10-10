//Implementing compile time polymorphism.
class Compiletime
{
    // contact method, which takes two arguments String and long.
	static void contact(String name, int age) 
    {
		System.out.println("Name : "+name+"\nAge : "+age);
 	}
    // contact method, which takes two arguments and both are Strings(overloading).
	static void contact(String name, String mailId) 
    {
		System.out.println("Name : "+name+"\nEmail : "+mailId);
	}
}
class polymorphism1
{
    public static void main(String[] args) 
    {
        // calling first contact method
        Compiletime.contact("Laxman Singh Koranga.", 21);
        System.out.print("\n");

        // calling second contact method
        Compiletime.contact("Laxman Singh Koranga.", "lxmn22nov@gmail.com");
    }
}