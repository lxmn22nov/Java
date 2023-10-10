//Removing even number from the ArrayList.
import java.util.Scanner;
import java.util.ArrayList;
public class removeEvenNo 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(37);
        list.add(32);
        list.add(69);
        list.add(99);
        list.add(51);
        list.add(68);
        list.add(19);
        System.out.println("Elements present in the ArrayList: "+list);
        removeEven(list);

    }

    public static void removeEven(ArrayList<Integer>list)
    {
        for(int i = list.size() - 1; i >= 0; i--)
        {
            if(list.get(i) % 2 == 0)
            {
                list.remove(i);
            }
        }
        System.out.println("Elements after the removal of even numbers: "+list);
    }
}