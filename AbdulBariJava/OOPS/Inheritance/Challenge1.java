//Challenge 1: Using inheritance 
class Circle
{
    public float radius;

    public Circle()
    {
        radius = 3;
    }
    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }
    public double area()
    {
        return Math.PI * radius * radius;
    }
}
class Cylinder extends Circle
{
    public float height;

    public Cylinder()
    {
        height = 3;
    }
    public double Volume()
    {
        return area() * height;
    }
}
public class Challenge1 
{
    public static void main(String[] args)
    {
        Circle c = new Circle();
        // c.radius = 6;
        System.out.println("The perimeter of Circle: "+c.perimeter());
        System.out.println("The area of Circle: "+c.area());

        Cylinder cy = new Cylinder();
        // cy.height = 6;
        System.out.println("The volume of Cylinder: "+cy.Volume());

    }
}