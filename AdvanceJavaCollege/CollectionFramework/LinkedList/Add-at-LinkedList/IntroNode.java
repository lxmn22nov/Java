//Adding element into the LinkedList at the specified indices.
import java.util.*;

public class IntroNode
{
      public static class Node
      {
            int data;
            Node next;

            Node(int val)
            {
                  this.data = val;
            }
      }
      public static void main(String[] args)
      {
            //Declaring the elements of the LinkedList.
            Node n1 = new Node(10);
            Node n2 = new Node(20);
            Node n3 = new Node(30);
            Node n4 = new Node(40);
            Node n5 = new Node(50);
            Node n6 = new Node(60);

            //Addresses of the nodes.
            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
            n4.next = n5;
            n5.next = n6;

            Node head = n1;
            head = addAt(head, 69,2);

            Node temp = head;
            while(temp != null)
            {
                  System.out.print(temp.data+" ");
                  temp = temp.next;
            }
            System.out.println();
      }
      public static Node addAt(Node head, int val, int idx)
      {
            Node n = new Node(val);
            Node temp = head;
            //What is "k" in the for loop?
            for(int i = 0; i < k-1; i++)
            {
                  temp = temp.next;
            }
            Node tempPlus1 = temp.next;
            temp.next = n;
            n.next = tempPlus1;

            return head;
      }
}