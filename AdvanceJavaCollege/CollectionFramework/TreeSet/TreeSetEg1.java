import java.util.*;
class TreeSetEg1
{
    public static void main(String[] args)
    {
        // Creating a TreeSet
        TreeSet<String> ts = new TreeSet<>();

        //displaying the initial size
        System.out.println("Size at the beginning "+ts.size());

        // Elements are added using add() method
        ts.add("India");
        ts.add("USA");
        ts.add("Britain");

        //displaying the TreeSet
        System.out.println(ts);

        //displaying the size
        System.out.println("Size after addition "+ts.size());


        // Duplicates will not get inserted into the TreeSet
        ts.add("Britain");

        // Elements get stored in Ascending order
        System.out.println(ts);
    }
}