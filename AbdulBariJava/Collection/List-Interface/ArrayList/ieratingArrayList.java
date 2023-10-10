//Iterating ArrayList using for loop.
import java.util.ArrayList;
import java.util.Collections;
public class ieratingArrayList
{
    public static void main(String[] args) 
    {
        ArrayList<String> color = new ArrayList<>();

        // System.out.println(color.isEmpty());
        //Adding elements into list.
        color.add("Red");
        color.add("Blue");
        color.add("Pink");
        color.add("Grey");
        color.add("Black");

        System.out.print("Colors in ArrayList: ");
        //Iterating using for loop.
        for(int i = 0; i <color.size(); i++)
        {
            System.out.print(color.get(i)+" ");
        }
        System.out.println();

        //Sortint the elements of the ArrayList.
        Collections.sort(color);
        System.out.println("Elements after sorting: "+color);
    }
}