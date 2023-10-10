import java.util.Scanner;
class areaofcircle 
{
    public static void main(String[] args)
    {
        double radius,Area;
        final double PI=3.14;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the value of radius:");
        radius=input.nextDouble();

        Area=PI * radius * radius;
        System.out.println("Area of the circle: " +Area);

        input.close();
        System.out.println("Written by Laxman Singh Koranga.");
        System.out.print("SAP:1000017428");
    }
}
