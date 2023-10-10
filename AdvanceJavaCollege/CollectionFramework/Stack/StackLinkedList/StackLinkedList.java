import static java.lang.System.exit;
//Stack class using LinkedList.
public class StackLinkedList 
{
      //define node of the LinkedList.
      class node
      {
            //node data.
            int data;
            //Node link.
            Node nLink;
      }
      //top of the stack.
      Node top;
      //Stack class constructor.
      StackLinkedList()
      {
            this.top = null;
      }
      //push() operation.
      public void push(int val)
      {
            //create a new node.
            Node temp = new  Node();

            //checks if the stack is full.
            if(temp == null)
            {
                  System.out.print("Stack Overflow");
                  return;
            }
            //assign "val" to node.
            temp.data = val;

            //set top of the stack to node link.
            temp.nLink = top;

            //update top.
            top = temp;
      }
      //"isEmpty()" operation.
      public boolean isEmpty()
      {
            return top == null;
      }
      //"peek()" operation.
      public int peek()
      {
            //check if the stack is empty.
            if(!isEmpty())
            {
                  return top.data;
            }
            else
            {
                  System.out.println("Stack is empty!");
                  return -1;
            }
      }
      //pop() operation.
      public void pop()
      {
            //check if stack is out of elements.
            if(top == null)
            {
                  System.out.print("Stack Underflow!!!");
                  return;
            }
            //set top to point to next node.
            top = (top).nLink;
      }
      //print stack contents.
      public void display()
      {
            //check for stack underflow.
            if(top == null)
            {
                  System.out.print("Stack Underflow!!!");
                  exit(1);
            }
            else
            {
                  Node temp = top;
                  System.out.println("Stack elements: ");
                  while(temp != null)
                  {
                        //print node data.
                        System.out.print(temp.data+"->");
                        //assign temp link to temp.
                        temp = temp.nLink;
                  }
            }
      }
      public static void main(String[] args)
      {
            //create a stack class object.
            StackLinkedList sll = new StackLinkedList();
            //push values into the stack.
            sll.push(10);
            sll.push(20);
            sll.push(30);
            sll.push(40);
            sll.push(50);

            //print stack elements.
            sll.display();
            //print current stack top.
            System.out.println("Stack top: "+sll.peek());

            //pop elements twice.
            System.out.println("Pop two elements");
            sll.pop();
            sll.pop();

            //print Stack elements.
            sll.display();

            //print new stack top.
            System.out.println("New Stack top: "+sll.peek());
      }
}
