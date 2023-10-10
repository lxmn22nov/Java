import java.util.*;
public class LinkedListEg1
{
    public static void main(String args[])
    {
    //creating a LinkedList
    LinkedList<String> list= new LinkedList<String>();
    
    //displaying the initial size
    System.out.println("Size at the beginning "+list.size());
    
    //add elements
    list.add("Java");
    list.add("C++");
    list.add("JavaScript");
    list.addFirst("C#");
    list.addLast("Kotlin");
    
    list.add(2,"Python");
    
    //displaying the LinkedList
    System.out.println("Original Linked List " + list);
    
    //displaying the size
    System.out.println("Size after addition "+list.size());
    
    //remove element at index 5 
    list.remove(5);
    list.remove("C#");
    
    //display the new LinkedList
    System.out.println("New Linked List "+ list);
    
    //display the new size
    System.out.println("Size after removal "+list.size());
    }
}
