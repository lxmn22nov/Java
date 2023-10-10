import java.util.ArrayList;
public class reverseArrayList 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Original ArrayList: " + numbers);
        
        // Reverse ArrayList
        int size = numbers.size();
        for (int i = 0; i < size/2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(size-1-i));
            numbers.set(size-1-i, temp);
        }
        System.out.println("Reversed ArrayList: " + numbers);
    }
}
