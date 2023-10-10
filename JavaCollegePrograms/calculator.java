import java.util.Scanner;
class calculator
{
    public static void main(String[] args)
    {
        char operator;
        double num1,num2,result;

        Scanner input=new Scanner(System.in);

        System.out.print("Enter the first number:");
        num1=input.nextDouble();

        System.out.print("Enter the second number:");
        num2=input.nextDouble();

        System.out.print("Enter the operator(+,-,*,/):");
        operator=input.next().charAt(0);

        switch(operator)
        {
            case '+':
            result=num1+num2;
            System.out.println("Addition: " + num1 + " + " + num2 + " = " + result);
            break;

            case '-':
            result=num1-num2;
            System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + result);
            break;

            case '*':
            result=num1*num2;
            System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + result);
            break;

            case '/':
            result=num1/num2;
            System.out.println("Division: " + num1 + " / " + num2 + " = " + result);
            break;

            default:
            System.out.println("Invalid Operator!");
            break;
        }
        input.close();
        System.out.println("Written by Laxman Singh Koranga.");
        System.out.print("SAP:1000017428");
    }
}