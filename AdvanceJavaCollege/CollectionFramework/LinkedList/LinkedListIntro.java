//Creation and Insertion of the LinkedList.
public class LinkedListIntro 
{
      //Head of LinkedList.
      Node head;

      //LinkedList Node, This inner class is made "static", so that "main()" method can access it.
      public static class Node
      {
            int data;
            Node next;

            //constructor.
            Node(int val)
            {
                  data = val;
                  next = null;
            }
      }
      //Method to insert a new node.
      public static LinkedListIntro insertion(LinkedListIntro list, int data)
      {
            //Creating a new node with given data.
            Node n = new Node(data);

            //If the LinkedList is empty, then make the new node as head.
            if(list.head == null)
            {
                  list.head = n;
            }
            else
            {
                  //else traverse till the last node & insert the "n" there.
                  Node last = list.head;

                  while(last.next != null)
                  {
                        last = last.next;
                  }
                  //insert the "n" at last node.
                  last.next = n;
            }
            //return the list by head.
            return list;
      }
      public static void printLinkedList(LinkedListIntro list)
      {
            Node currentNode = list.head;
            System.out.print("LinkedList: ");

            //Traverse through the LinkedList.
            while(currentNode != null)
            {
                  System.out.print(currentNode.data + " ");

                  //go to the next node.
                  currentNode = currentNode.next;
            }
            System.out.println();
      }
      //Method to create a Singly LinkedList with "n" nodes.
      public static void main(String[] args)
      {
            //Start with the empty LinkedList.
            LinkedListIntro list = new LinkedListIntro();

            //Inserting the values.
            list = insertion(list, 10);
            list = insertion(list, 20);
            list = insertion(list, 30);
            list = insertion(list, 40);
            list = insertion(list, 50);
            list = insertion(list, 60);

            printLinkedList(list);
      } 
}