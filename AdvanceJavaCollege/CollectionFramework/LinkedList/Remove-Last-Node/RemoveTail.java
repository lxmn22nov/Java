//Removing the last node into the LinkedList.
import java.util.*;

public class RemoveTail
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

            //Addresses of the nodes.
            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
            n4.next = n5;

            Node head = n1;
            head = removeTail(head);

            Node temp = head;
            while(temp != null)
            {
                  System.out.print(temp.data+" ");
                  temp = temp.next;
            }
            System.out.println();
      }
      public static Node removeTail(Node head)
      {
            if(head == null)
            {
                  return null;
            }
            //when only one node in LinkedList present.
            else if(head.next == null)
            {
                  return null;
            }
            Node temp = head;

            while(temp.next.next != null)
            {
                  temp = temp.next;
            }
            temp.next = null;
            return head;
      }
}
