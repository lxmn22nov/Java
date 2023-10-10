//Adding element at the first place "0th" index of the LinkedList.
import java.util.*;
//Program to implement a Singly LinkedList.
public class IntroNode
{
      //LinkedList Node.
      //This inner class is made "static" so that "main()" method can access it.
      public static class Node
      {
            int data;
            Node next;

            //constructor to create a new node, 
            //"next" is by default initialized as null.
            Node(int val)
            {
                  this.data = val;
                  next = null;
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
            head = addFirst(head, 60);

            Node temp = head;
            while(temp != null)
            {
                  System.out.print(temp.data+" ");
                  temp = temp.next;
            }
            System.out.println();
      }
      public static Node addFirst(Node head, int val)
      {
            // return head;

            //create a new node with given data.
            Node n = new Node(val);
            n.next = head;
            head = n;

            return head;
      }
}
