import java.util.Vector;
public class Example02 
{
      public static void main(String[] args)
      {
            //declaration of vector.
            Vector<Integer> v = new Vector<>(3,3);
            System.out.println("Vector size: "+v.size());
            System.out.println("Vector capacity: "+v.capacity());

            //adding elements into vector.
            v.add(3);
            v.add(6);
            v.add(9);
            v.add(12);
            // v.addElement(3);
            // v.addElement(6);
            // v.addElement(9);
            // v.addElement(12);

            //Iteration using "for" loop.
            // System.out.print("Elements inside Vector(for loop iteration): ");
            // for(int i = 0; i < v.size(); i++)
            // {
            //       System.out.print(v.get(i)+" ");
            // }
            // System.out.println();

            //Iteration using "for-each" loop.
            // System.out.print("Elements inside Vector(for-each iteration): ");
            // for (Integer n : v) 
            // {
            //       System.out.print(n+" ");
            // }
            // System.out.println();
            System.out.println("Elements inside vector: "+v);
            System.out.println("Vector size: "+v.size());
            System.out.println("Vector capacity: "+v.capacity());

            //removing element from vector.
            System.out.println("Removal of element: "+v.remove(3));
            System.out.println("Vector after element removal: "+v);


      }
}
