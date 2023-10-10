import java.util.*;
public class Example01
{
      public static void main(String[] args) 
      {
            //Initializing first arraylist.
            ArrayList<Integer> arrl1 = new ArrayList<>(20);
            arrl1.add(22);
            arrl1.add(22);
            arrl1.add(0, 11);
            System.out.println("ArrayList first: "+arrl1);

            //Initializing second arrayList.
            ArrayList<Integer> arrl2 = new ArrayList<>(List.of(12, 44, 67, 98 ,190));
            System.out.println("ArrayList second: "+arrl2);

            //Adding first & second arrayList withoutout prioritizing index.
            arrl1.addAll(arrl2);
            System.out.println("ArrayList first after adding ArrayList second: "+arrl1);

            //Adding first & second arrayList prioritizing indices.
            arrl1.addAll(1, arrl2);
            System.out.println("ArrayList first after adding second(prioritizing index): "+arrl1);

            //Checking contains method-gives the boolean value if the element is present.
            System.out.println(arrl1.contains(22));//true
            System.out.println(arrl2.contains(3));//true
            System.out.println(arrl1.contains(33));//false

            //checking get method-gives the value present at index.
            System.out.println("Value present at the index: "+arrl1.get(1));
            System.out.println("Value present at the index: "+arrl1.get(10));

            //Checking indexOf- gives the index value of the element.
            System.out.println("Element's index value present in the ArrayList: "+arrl1.indexOf(11));

            //checking remove method.
            System.out.println("Element removed: "+arrl1.remove(0));

            //checking retainAll method- 
            System.out.println("Retained element: "+arrl1.retainAll(arrl2));
            System.out.println("After retaining ArrayList first: "+arrl1);

            //checking set method- 
            System.out.println("Replaced Element at index 3: "+arrl1.set(3, 33));
            System.out.println("Element replaced at index 3 in first ArrayList: "+arrl1);

            //Using "for" loop for iteration.
            /*System.out.print("ArrayList first elements: ");
            for(int i = 0; i < arrl1.size(); i++)
            {
                  System.out.print(arrl1.get(i)+" ");
            }
            System.out.println();*/

            //Using "for-each" loop for iteration.
            /*System.out.print("ArrayList first elements: ");
            for(Integer x : arrl1)
            {
                  System.out.print(x+" ");
            }
            System.out.println();*/

            //Using Iterator method for array.
            /*Iterator<Integer> it = arrl1.iterator();
            System.out.print("ArrayList first elements: ");
            while(it.hasNext())
            {
                  System.out.print(it.next()+" ");
            }
            System.out.println();*/

            //Using Iterator method for arrayList using "while" loop.
            /*ListIterator<Integer> it = arrl1.listIterator();
            System.out.print("ArrayList first elements: ");
            while(it.hasNext())
            {
                  System.out.print(it.next()+" ");
            }
            System.out.println();*/

            //Using Iterator method for arrayList using "for" loop.
            /*System.out.print("ArrayList first elements: ");
            for(ListIterator<Integer> it = arrl1.listIterator(); it.hasNext();)
            {
                  System.out.print(it.next()+" ");
            }
            System.out.println();*/

            //Using "for-each" loop(Lambda Expression) for arrayList.
            System.out.print("ArrayList first Element: ");
            arrl1.forEach(n -> System.out.print(n+" "));
            System.out.println();
      }
}