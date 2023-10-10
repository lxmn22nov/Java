import java.util.Scanner;

class FahrenheitToCelcius
{
    public static void main(String[] args)
    {
        double fahrenheit, celsius;

        Scanner input=new Scanner(System.in);

        System.out.print("Enter the temperature(fehrenheit):");
        fahrenheit=input.nextDouble();

        celsius=(5.0/9.0)*(fahrenheit-32);

        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius. ");

        input.close();
        System.out.println("Written by Laxman Singh Koranga.");
        System.out.print("SAP:1000017428");
    }
}
