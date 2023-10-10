//ArrayList Basic Operations.
import java.util.Scanner;
import java.util.ArrayList;
public class arrayListBasicOperations 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        // System.out.println("The elements inside the ArrayList: "+list1);

        //Method 1:Adding elements into the ArrayList.
        list1.add(53);
        list1.add(26);
        list1.add(79);
        list1.add(63);
        list1.add(86);
        list1.add(19);
        System.out.println(list1);

        //Method 2:Inserts specific element into specific index. 
        // list1.add(1, 69);
        // System.out.println(list1);

        //Method 3:Add elements present in a specified collection at the end of the list.
        // list1.addAll(list1);
        // System.out.println(list1);

        //Method 4:inserts all the elements present in a specified collection, starting with the specified index into the list.
        // list1.addAll(1, list1);
        // System.out.println(list1);

        //Method 5:get element by index value.
        // System.out.println(list1.get(1));

        //Method 6:removes the first occurence of the specified element from the list if present.
        // list1.remove(list1);
        // System.out.println(list1);

        //Method 7:removes the element present at specified index.
        // list1.remove(1);
        // System.out.println(list1);

        //Method 8:removes all the elements present in a specified collection.
        // list1.removeAll(list1);
        // System.out.println(list1);

        //Method 9:used to remove all the elements.
        // list1.clear();
        // System.out.println(list1);

        //Method 10:returns true if the list contains the specified element.
        // System.out.println(list1.contains(63));

        //Method 11:returns the index of the first occurence of the specified element or -1, if list doesn't contain element.
        // System.out.println(list1.indexOf(633));

        //Method 12: returns no elements if list doesn't contain elements.
        // System.out.println(list1.isEmpty());

        //Method 13:return the index of the last occurence of the specified element or -1, if list doesn't contain element.
        // System.out.println(list1.lastIndexOf(63));

        //Method 14:returns list iterator over the elements in proper sequence.
        // System.out.println(list1.listIterator(1));

        //Method 15:returns a list iterator over the elements in proper sequence, starting at the specified index in the list.
        // System.out.println(list1.listIterator(2));

        //Method 16:set element by index value.
        // list1.set(1, 33);
        // System.out.println(list1.get(1));
        // System.out.println(list1);

        //Method 17:returns  an array containing all the elements present in the proper sequence.
        // System.out.println(list1.toArray());

        //Method 18:returns a view of the porion of this list between the specified from index(inclusive) & toIndex(exclusive).
        // System.out.println(list1.subList(1, 3));

        //Method 19:trims the capacity of list instance to the list's current size.
        // list1.trimToSize();
        // System.out.println(list1);

        //Method 20:returns the no.of elements preent in the list.
        System.out.println(list1.size());

        
        
        
    }
}