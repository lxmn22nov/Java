//Implementation of the Doubly LinkedList.
public class DoublyLinkedList 
{
	//A node class for doubly LinkedList.
	class Node
	{
		int item;
		Node previous;
		Node next;
		
		public Node(int item)
		{
			this.item = item;
		}
	}
	//Initially, head & tail is set to null.
	Node head, tail = null;
	
	//Add a node to the list.
	public void addNode(int item)
	{
		//create a new node.
		Node newNode = new Node(item);
		
		//if list is empty, head & tail points to newNode.
		if(head == null)
		{
			head = tail = newNode;
			
			//head's previous will be null.
			head.previous = null;
			
			//tail's next will be null.
			tail.next = null;
		}
		else
		{
			//add newNode to the end of list. tail -> next set to newNode.
			tail.next = newNode;
			
			//newNode -> previous set to tail.
			newNode.previous = tail;
			
			//newNode becomes new tail.
			tail = newNode;
			
			//tail's next point to null.
			tail.next = null;
		}
	}
	//print all the nodes of doubly LinkedList.
	public void printNodes()
	{
		//Node current will point to head.
		Node current = head;
		if(head == null)
		{
			System.out.print("Doubly LinkedList is empty: ");
			return;
		}
		System.out.println("Node of Doubly LinkedList: ");
		while(current != null)
		{
			//Print each node & then go to next.
			System.out.print(current.item + " ");
			current = current.next;
		}
	}
	
	public static void main(String[] args) 
	{
		//Create a Doubly LinkedList object.
		DoublyLinkedList dll = new DoublyLinkedList();
		
		//Add nodes to the list.
		dll.addNode(10);
		dll.addNode(20);
		dll.addNode(30);
		dll.addNode(40);
		dll.addNode(50);
		
		//print the nodes of Doubly LinkedList.
		dll.printNodes();
	}
}