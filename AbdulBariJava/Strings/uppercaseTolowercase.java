//Conversion of Uppercase to Lowercase letter.
public class uppercaseTolowercase 
{
    public static void main(String[] args)
    {
        String str = "The Quick BROWN FOx.";
        System.out.println("String Length: "+str.length());
        System.out.println("String before conversion: "+str);
        uppercaseTolowercase(str);
    }

    public static void uppercaseTolowercase(String str)
    {
        char [] c = str.toCharArray();

        for(int i = 0; i < c.length; i++)
        {
            char ch = c[i];
            if(ch >= 'A' && ch <= 'Z')
            {
                char result_char = (char)(ch - 'A' + 'a');
                c[i] = result_char;
            }
        }
        System.out.print("String after conversion: ");
        for(char Character: c)
        {
            System.out.print(Character);
        }
        System.out.println();
    }
}