import java.util.*;
public class Example01 
{
     public static void main(String[] args)
     {
      LinkedList<Integer> ll1 = new LinkedList<>();
      LinkedList<Integer> ll2 = new LinkedList<>(List.of(3,6,9,12,15));

      //adding elements in LinkedList 1.
      ll1.add(11);
      ll1.add(22);
      ll1.add(33);
      ll1.addFirst(00);
      ll1.addLast(44);
      System.out.println("Elements in LinkedList 1: "+ll1);
      System.out.println("Elements in LinkedList 2: "+ll2);

      //removing the element.
     //  ll1.remove(1);
     //  System.out.println("Removing element from the LinkedList: "+ll1);
      //removing element using poll method.
     //  ll1.poll();
     //  System.out.println("Elements in LinkedList 1(after poll method): "+ll1);
     //  ll1.pollLast();
     //  System.out.println("Elements in LinkedList 1(after poll method): "+ll1);

      //Iteration using "for" loop.
      System.out.print("Elements in LinkedList 1(for loop): ");
      for(int i = 0; i < ll1.size(); i++)
      {
          System.out.print(ll1.get(i)+" ");
      }
      System.out.println();

      //Iteration using "for-each" loop.
      System.out.print("Elements in LinkedList 1(for-each): ");
      for (Integer n : ll1) 
      {
          System.out.print(n+" ");  
      }
      System.out.println();

      //Printing the first element of the LinkedList.
      System.out.println("First element of the LinkedList: "+ll1.get(1));
      System.out.println("First element of the LinkedList: "+ll1.peekFirst());

      //Removing the first element of the LinkedList.
      System.out.println("Removed first element: "+ll1.remove(0));
      System.out.println("Removed first element: "+ll1.poll());
      System.out.println("LinkedList after removal/poll(): "+ll1);
     } 
}
