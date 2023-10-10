import java.util.*; 
public class HashSetEg1
{
    public static void main(String args[])
    {
    //creating a HashSet
    HashSet<String> str= new HashSet<String>();
    
    //displaying the initial size
    System.out.println("Size at the beginning "+str.size());
    
    //add elements
    str.add("Hello");
    str.add("Hi");
    str.add("Namaste");
    str.add("Bonjour");
    
    //displaying the HashSet
    System.out.println(str);
    
    //displaying the size
    System.out.println("Size after addition "+str.size());
    
    //remove element using value 
    str.remove("Bonjour");
    
    //display the new HashSet
    System.out.println(str);
    
    //display the new size
    System.out.println("Size after removal "+str.size());
    }
}