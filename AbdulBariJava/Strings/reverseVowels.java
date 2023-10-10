//Reverse the vowels of the string.
public class reverseVowels 
{
    public static void main(String[] args)
    {
        String str = "I am Laxman Singh Koranga.";
        System.out.println("String Length: "+str.length());
        System.out.println("The String before the reversal of the vowels: "+str);
        reverseVowels(str);
    }

    public static void reverseVowels(String str)
    {
        char [] c = str.toCharArray();

        int i = 0;
        int j = c.length -1;

        while(i < j)
        {
            while(c[i] != 'a' && c[i] != 'e' && c[i] != 'i' && c[i] != 'o' && c[i] != 'u' && c[i] != 'A' && c[i] != 'E' && c[i] != 'I' && c[i] != 'O' && c[i] != 'U')
                {
                    i++;
                }
            while(c[j] != 'a' && c[j] != 'e' && c[j] != 'i' && c[j] != 'o' && c[j] != 'u' && c[j] != 'A' && c[j] != 'E' && c[j] != 'I' && c[j] != 'O' && c[j] != 'U')
                {
                    j--;
                }
            if(i >= j)
                {
                    break;
                }

            char temp = c[i];;
            c[i] = c[j];
            c[j] = temp;

            i++;
            j--;   
        }
        System.out.print("String after the reversal of the vowels: ");
        for(char temp: c)
        {
            System.out.print(temp);
        }
        System.out.println();
    }
}