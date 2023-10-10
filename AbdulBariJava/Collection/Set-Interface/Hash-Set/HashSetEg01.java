import java.util.*;
class HashSetEg01
{
      public static void main(String[] args) 
      {
            HashSet<Integer> hs = new HashSet<>();

            //initial size of HashSet.
            System.out.println("Size of HashSet: "+hs.size());
            //Adding elements into hashset.
            hs.add(11);
            hs.add(22);
            hs.add(33);
            hs.add(69);
            //repitition is not allowed in set.
            // hs.add(22);

            //checking "contains" method.
            System.out.println("HashSet contains the element? "+hs.contains(22));

            //Removing element from the hashset.
            System.out.println("Removing element from HashSet: "+hs.remove(11));

            //Iteration using "for-each" loop.
            System.out.print("Elements inside HashSet: ");
            for (Integer n : hs) 
            {
                  System.out.print(n+" ");
            }
            System.out.println();
      
            //Final size of HashSet.
            System.out.println("Size of HashSet: "+hs.size());
      }
}