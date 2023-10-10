import java.util.Scanner;
class Average
{
    public static void main(String[] args)
    {
        double average,num1,num2,num3;

        Scanner input=new Scanner(System.in);

        System.out.print("Enter the first number:");
        num1=input.nextDouble();

        System.out.print("Enter the second number:");
        num2=input.nextDouble();

        System.out.print("Enter the third number:");
        num3=input.nextDouble();

        average=(num1+num2+num3)/3;
        System.out.println("The average of " + num1 + ", " + num2 + ", " + num3 + " " + "is " + average + ".");

        input.close();
        System.out.println("Written by Laxman Singh Koranga.");
        System.out.print("SAP:1000017428");
    }
}