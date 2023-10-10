import java.util.*;
public class Example01 
{
      public static void main(String[] args)
      {
            Stack<Integer> s = new Stack<>();
            System.out.println("Is stack empty? "+s.empty());

            //Adding elements into stack.
            s.push(3);
            s.push(6);
            s.push(9);
            s.push(12);
            System.out.println("Elements inside stack: "+s);
            
            //peek method.
            System.out.println("Element at top of stack: "+s.peek());

            //removing elements from stack.
            System.out.println("Removing element from the top: "+s.pop());
            System.out.println("Stack after pop: "+s);
            System.out.println("Element at top of stack: "+s.peek());
            System.out.println("Is stack empty? "+s.empty());

            //searching element into stack.
            System.out.println("Searching element: "+s.search(3));    
      }
}