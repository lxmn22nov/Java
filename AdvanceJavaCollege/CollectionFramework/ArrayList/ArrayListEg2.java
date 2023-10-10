import java.util.*;
    
public class ArrayListEg2
{
    public static void main(String args[])
    {
    //creating an ArrayList
    ArrayList<String> str= new ArrayList<String>();
    
    //displaying the initial size
    System.out.println("Size at the beginning "+str.size());
    
    //add elements
    str.add("Hello");
    str.add("Hi");
    str.add("Namaste");
    str.add("Bonjour");
    
    //displaying the ArrayList
    System.out.println(str);
    
    //displaying the size
    System.out.println("Size after addition: "+str.size());
    
    //remove element at index 0 
    str.remove(0);
    
    //display the new ArrayList
    System.out.println(str);
    
    //display the new size
    System.out.println("Size after removal "+str.size());
    }
}