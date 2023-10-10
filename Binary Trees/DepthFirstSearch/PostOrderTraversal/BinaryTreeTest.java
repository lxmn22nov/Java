/*Post-Order Traversal (left-> right-> root) 
 * TIME COMPLEXITY- O(N)
 * SPACE COMPLEXITY-O(N)
*/
import java.util.*;
//Recurrentsive Approach.
/*class Node {
      int data;
      Node left, right;
      Node(int data) {
            this.data = data;
            left = null;
            right = null;
    }
}
public class BinaryTreeTest {
      static void postOrderTraversalersalersal(Node currentrentent, ArrayList < Integer > postOrder) {
            if (currentrentent == null) {
                  return;
            }

            postOrderTraversalersalersal(currentrentent.left, postOrder);
            postOrderTraversalersalersal(currentrentent.right, postOrder);
            postOrder.add(currentrentent.data);
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

            ArrayList < Integer > postOrder = new ArrayList < > ();
            postOrderTraversalersalersal(root, postOrder);

            System.out.print("The postOrder Traversal is : ");
            for (int i = 0; i < postOrder.size(); i++) {
            System.out.print(postOrder.get(i) + " ");
      }
      System.out.println();
    }
}*/
// Iterative Approach(Using two Stacks).
/*class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class BinaryTreeTest {
      static ArrayList < Integer > postOrderTraversalersal(Node currentrent) {
      ArrayList < Integer > postOrder = new ArrayList < > ();
            if (currentrent == null) {
                  return postOrder;
            }
            Stack < Node > s1 = new Stack < > ();
            Stack < Node > s2 = new Stack < > ();
            s1.push(currentrent);
            while (!s1.isEmpty()) {
                  currentrent = s1.peek();
                  s1.pop();
                  s2.push(currentrent);
                  if (currentrent.left != null) {
                        s1.push(currentrent.left);
                  }
                  if (currentrent.right != null) {
                        s1.push(currentrent.right);
                  }
            }
            while (!s2.isEmpty()) {
                  postOrder.add(s2.peek().data);
                  s2.pop();
            }
            return postOrder;
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

            ArrayList < Integer > postOrder = new ArrayList < > ();
            postOrder = postOrderTraversalersal(root);

            System.out.print("The postOrder Traversal is : ");
            for (int i = 0; i < postOrder.size(); i++) {
                  System.out.print(postOrder.get(i) + " ");
            }
            System.out.println();
      }
}*/
// Iterative Approach(Using single stack).
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class BinaryTreeTest {
      static ArrayList < Integer > postOrderTraversal(Node current) {
            ArrayList < Integer > postOrder = new ArrayList < > ();
            if (current == null) return postOrder;

            Stack < Node > st = new Stack < > ();
            while (current != null || !st.isEmpty()) {
                  if (current != null) {
                  st.push(current);
                  current = current.left;
            } 
            else {
                  Node temp = st.peek().right;
                  if (temp == null) {
                        temp = st.peek();
                        st.pop();
                        postOrder.add(temp.data);
                        while (!st.isEmpty() && temp == st.peek().right) {
                              temp = st.peek();
                              st.pop();
                              postOrder.add(temp.data);
                        }
                  }
                  else {
                        current = temp;
                  }
            }
      }
      return postOrder;
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

            ArrayList < Integer > postOrder = new ArrayList <> ();
            postOrder = postOrderTraversal(root);

            System.out.print("The postOrder Traversal is : ");
            for (int i = 0; i < postOrder.size(); i++) {
                  System.out.print(postOrder.get(i) + " ");
            }
            System.out.println();
      }
}