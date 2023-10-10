//Writing class for CircleTest.
class CircleTest
{
    double radius;
    //First metod or property/behaviour of CircleTest.
    double area()
    {
        return Math.PI * radius *radius;
    }
    //Second method.
    double perimeter()
    {
        return 2 * Math.PI * radius;
    }
    //Third method which is same as Method 2.
    double circumference()
    {
        return perimeter();
    }
}
public class Circle
{
    public static void main(String[] args)
    {
        CircleTest c = new CircleTest();

        c.radius = 3.3;

        System.out.println("Radius: "+c.radius);
        System.out.println("Area: "+c.area());
        System.out.println("Perimeter: "+c.perimeter());
        System.out.println("Circumference: "+c.circumference());
    }
}

