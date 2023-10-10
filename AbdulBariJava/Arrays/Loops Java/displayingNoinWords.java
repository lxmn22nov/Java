//displaying number into words even tailing with 0.
import java.util.Scanner;
public class displayingNoinWords 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //Taking user input.
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int m = num;
        int rem;
        String str ="";

        //Using while loop.
        while(num > 0)
        {
            rem = num % 10;
            num = num / 10;
            str = str + rem;
        }
        System.out.println("The given number "+m+" is reversed: "+str);
        //Now, the for loop is used to displaying numbers into words.

        char digit;
        System.out.print("Number "+m+" into words: ");
        for(int i = 0; i < str.length(); i++)
        {
            digit = str.charAt(i);
            switch(digit)
            {
                case '0':
                System.out.print("Zero ");
                break;
                case '1':
                System.out.print("One ");
                break;
                case '2':
                System.out.print("Two ");
                break;
                case '3':
                System.out.print("Three ");
                break;
                case '4':
                System.out.print("Four ");
                break;
                case '5':
                System.out.print("Five ");
                break;
                case '6':
                System.out.print("Six ");
                break;
                case '7':
                System.out.print("Seven ");
                break;
                case '8':
                System.out.print("Eight ");
                break;
                case '9':
                System.out.print("Nine ");
                break;
            }
        }
        System.out.println();
    }
}
