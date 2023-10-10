//Writing a class for CylinderTest.
class CylinderTest
{
    double radius;
    double height;

    //Method1.
    double volume()
    {
        return Math.PI * radius * radius * height;
    }
    //Method 2.
    double CSA()
    {
        return 2 * Math.PI * radius * height;
    }
    //Method 3.
    double TSA()
    {
        return 2 * Math.PI * radius * (height + radius);
    }
}
public class Cylinder
{
    public static void main(String[] args)
    {
        CylinderTest c = new CylinderTest();

        c.radius = 5;
        c.height = 7;

        System.out.println("Radius: "+c.radius);
        System.out.println("Height: "+c.height);
        System.out.println("Volume: "+c.volume());
        System.out.println("Curved Surface Area: "+c.CSA());
        System.out.println("Total Surface Area: "+c.TSA());
    }
}