import java.util.*;
public class TreeSetEg01 
{
      public static void main(String[] args)
      {
            TreeSet<Integer> ts = new TreeSet<>();

            //checking initial size of the TreeSet.
            System.out.println("Initial size of TreeSet: "+ts.size());

            //Adding elements into Treeset.
            ts.add(3);
            ts.add(15);
            ts.add(75);
            System.out.println("Elements inside the TreeSet: "+ts);

            //ceiling method.
            System.out.println(ts.ceiling(5));

            //final size of the TreeSet.
            System.out.println("Initial size of TreeSet: "+ts.size());
      }
}
