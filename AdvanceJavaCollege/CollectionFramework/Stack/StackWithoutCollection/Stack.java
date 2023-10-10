import java.util.*;
//Stack class.
public class Stack 
{
      //top of the stack.
      int top;
      //max size of the stack.
      int maxSize = 5;
      //defining array that will hold stack elements.
      int[] StackArray = new int[5];

      //Stack constructor, initially top = -1;
      Stack()
      {
            top = -1;
      }
      //If top is less than "0", then stack is Empty.
      boolean isEmpty()
      {
            return (top < 0);
      }
      boolean push(int val)
      {
            if(top == maxSize -1)
            {
                  System.out.println("Stack Overflow!!!");
                  return false;
            }
            else
            {
                  top++;
                  StackArray[top] = val;
                  return true;
            }
      }
      boolean pop()
      {
            if(top == -1)
            {
                  System.out.println("Stack Underflow!!!");
                  return false;
            }
            else
            {
                  System.out.println("\nItem popped: "+StackArray[top--]);
                  return true;
            }
      }
      //Printing Stack elements.
      void display()
      {
            System.out.print("Printing Stack Elements: ");
            for(int i = top; i >= 0; i--)
            {
                  System.out.print(StackArray[i]+" ");
            }
            System.out.println();
      }
      public static void main(String[] args)
      {
            //declare a stack object.
            Stack s = new Stack();
            System.out.println("Initial Stack Empty: "+s.isEmpty());

            //push elements.
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
            s.push(50);
            System.out.println("After push operation!");

            //print the elements.
            s.display();

            //pop two elements from stack.
            s.pop();
            s.pop();
            System.out.println("After Pop Operation!");

            //Print the stack again.
            s.display();
      }
}
