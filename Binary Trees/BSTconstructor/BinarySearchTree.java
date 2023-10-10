public class BinarySearchTree 
{
      private Node root;

      class Node
      {
            int data;
            int left;
            int right;

            private Node(int data)
            {
                  this.data = data;
            }
      }
      public static void main(String[] args)
      {
            BinarySearchTree myBST = new BinarySearchTree();
            System.out.println("Root = "+myBST.root);
      }
}
