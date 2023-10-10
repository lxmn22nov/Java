/*InOrder Traversal of Binary Tree (left-> root-> right) 
 * TIME COMPLEXITY- O(N)
 * SPACE COMPLEXITY- O(N)
*/
import java.util.*;

//Iterative Approach.
/*class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class BinaryTreeTest {
    static ArrayList < Integer > InOrderTraversalersal(Node currentent) {
        ArrayList < Integer > inOrder = new ArrayList < > ();
        Stack < Node > s = new Stack < > ();
        while (true) {
            if (currentent != null) {
                s.push(currentent);
                currentent = currentent.left;
            } else {
                if (s.isEmpty()) break;
                currentent = s.peek();
                inOrder.add(currentent.data);
                s.pop();
                currentent = currentent.right;
            }
        }
        return inOrder;
    }

    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        ArrayList < Integer > inOrder;
        inOrder = InOrderTraversalersal(root);

        System.out.print("The inOrder Traversal is : ");
        for (int i = 0; i < inOrder.size(); i++) {
            System.out.print(inOrder.get(i) + " ");
        }
        System.out.println();
    }
}*/
//Recursive Approach.
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class BinaryTreeTest {

      static void InOrderTraversal(Node current, ArrayList < Integer > inOrder) {
            if (current == null) {
                  return;
            }

            InOrderTraversal(current.left, inOrder);
            inOrder.add(current.data);
            InOrderTraversal(current.right, inOrder);
      }
      public static void main(String args[]) {

            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.left.right.left = new Node(8);
            root.right.left = new Node(6);
            root.right.right = new Node(7);
            root.right.right.left = new Node(9);
            root.right.right.right = new Node(10);

            ArrayList < Integer > inOrder = new ArrayList < > ();
            InOrderTraversal(root, inOrder);

            System.out.print("The inOrder Traversal is : ");
            for (int i = 0; i < inOrder.size(); i++) {
                  System.out.print(inOrder.get(i) + " ");
            }
            System.out.println();
      }
}