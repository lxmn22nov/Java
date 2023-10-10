//Using method overloading to compute the area of the rectangle and  the circle.
public class methodOverloading1
{
    //Method for area of rectangle.
    static double rectangleArea(double length, double breadth)
    {
        return (length * breadth);
    }
    //Method for area of circle.
    static double circleArea(double radius)
    {
        return (3.14 * radius * radius);
    }
    //Method for area of square.
    static double squareArea(double side)
    {
        return (side * side);
    }
    //Method for area of triangle.
    static double triangleArea(double base, double height)
    {
        return (0.5 * base * height);
    }

    //main method.
    public static void main(String[] args)
    {
        System.out.println("The area of Rectangle: "+rectangleArea(5, 3.3));
        System.out.println("The area of Circle: "+circleArea(2.1));
        System.out.println("The area of Square: "+squareArea(0.9));
        System.out.println("The area of Triangle: "+triangleArea(1.5, 3));
    }
} 