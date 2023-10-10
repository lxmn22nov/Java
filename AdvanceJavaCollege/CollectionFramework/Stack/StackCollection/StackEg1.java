import java.util.*;
public class StackEg1
{
    public static void main(String args[])
    {
    //creating a Stack
    Stack<Integer> s= new Stack<Integer>();
    
    //displaying the initial size
    System.out.println("Size at the beginning "+s.size());
    
    //push elements
    s.push(99);
    s.push(28);
    s.push(17);
    s.push(74);
    s.push(1);
    
    
    //displaying the Stack
    System.out.println("New Stack: " + s);
    
    //displaying the size
    System.out.println("Size after addition "+s.size());
    
    //pop the element and display it
    System.out.println("Popped element " + s.pop());
    
    //display the new Stack
    System.out.println("New Stack after popping: "+ s);
    
    //display the new size
    System.out.println("Size after removal "+s.size());
    
    //peek method to find the top-most element and display it
    System.out.println("Top-most element " + s.peek());
    
    //the size remains the same as peek does not remove the element
    System.out.println("Size after Peek "+s.size());
    }
}
