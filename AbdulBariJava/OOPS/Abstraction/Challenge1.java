//Challenge 1: Shape challenge using abstract class.
abstract class Shape 
{
    abstract public double perimeter();
    abstract public double area();
}
class Circle extends Shape
{
    public double radius;

    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }
    public double area()
    {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape
{
    public double length;
    public double breadth;

    public double perimeter()
    {
        return 2 * (length + breadth);
    }
    public double area()
    {
        return length * breadth;
    }
}

public class Challenge1 
{
    public static void main(String[] args) 
    {
        Circle c = new Circle();
        c.radius = 6;
        // Shape s = c;
        System.out.println("The perimeter of Circle: "+c.perimeter());
        System.out.println("The area of Circle: "+c.area());
        // System.out.println("The perimeter of Circle: "+s.perimeter());
        // System.out.println("The area of Circle: "+s.area());

        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 5;
        // Shape s1 = r;
        System.out.println("The perimeter of Rectangle: "+r.perimeter());
        System.out.println("The area of Rectangle: "+r.area());
        // System.out.println("The perimeter of Rectangle: "+s1.perimeter());
        // System.out.println("The area of Rectangle: "+s1.area());
    }
}