/*Question: Given a binary tree print the pre-order traversal? */
import java.util.*;
/*
Time Complexity- O(n)
Space Complexity-O(n)
*/
//Iterative Approch.
/*class Node {
      int data;
      Node left, right;

      Node(int data) {
            this.data = data;
            left = right = null;
      }
}
public class PreOrderTraversalImplementation {
      static ArrayList<Integer> preOrderTraversal(Node current) {
            ArrayList<Integer> preOrder = new ArrayList<Integer>();

            if(current == null) {
                  return preOrder;
            }
            Stack<Node> s = new Stack<>();
            s.push(current);

            while(!s.isEmpty()) {
                  Node topNode = s.peek();
                  preOrder.add(topNode.data);
                  s.pop();

                  if(topNode.right != null) {
                        s.push(topNode.right);
                  }
                  if(topNode.left != null) {
                        s.push(topNode.left);
                  }
            }
            return preOrder;
      }
      public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.left.right.left = new Node(8);
            root.right.left = new Node(6);
            root.right.right = new Node(7);
            root.right.right.right = new Node(10);

            ArrayList<Integer> preOrder = new ArrayList<>();
            preOrder = preOrderTraversal(root);
            System.out.print("The preOrder traversal is: ");

            for(int i = 0; i < preOrder.size(); i++) {
                  System.out.print(preOrder.get(i) + " ");
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
            left = right = null;
      }
      Node() {

      }
}
public class PreOrderTraversalImplementation {
      static  void preOrderTraversal(Node current, ArrayList<Integer> preOrder) {
            if(current == null) {
                  return;
            }
            preOrder.add(current.data);
            preOrderTraversal(current.left, preOrder);
            preOrderTraversal(current.right, preOrder);
      }
      public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.left.right.left = new Node(8);
            root.right.left = new Node(6);
            root.right.right = new Node(7);
            root.right.right.right = new Node(10);

            ArrayList<Integer> preOrder = new ArrayList<>();
            preOrderTraversal(root, preOrder);
            System.out.print("The preOrder traversal is: ");

            for(int i = 0; i < preOrder.size(); i++) {
                  System.out.print(preOrder.get(i) + " ");
            }
            System.out.println();
      }
}