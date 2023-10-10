//Remove all the vowels from the string.
import java.util.*;
public class removeVowels
{
    public static void main(String[] args)
    {
        String str = "I am Laxman Singh Koranga.";
        // String str = "A nEw beggInnIng";
        System.out.println("The String before removal of Vowels: "+str);
        removeVowels(str);
    }

    public static void removeVowels(String str)
    {
        System.out.print("Characters  after the removal of Vowels: ");
        for(int i = 0; i < str.length();  i++)
        {
            char c = str.charAt(i);

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            {
                continue;
            }
            System.out.print(c);
        }
        System.out.println();  
    }
} 