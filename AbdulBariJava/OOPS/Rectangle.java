//Writing a class for RectangleTTest.
class RectangleTest
{
    double length;
    double breadth;

    //Method 1.
    double area()
    {
        return length * breadth;
    }
    //Method 2.
    double perimeter()
    {
        return 2 * (length + breadth);
    }
    //Method 3.
    double diagonalLength()
    {
        return Math.sqrt(length + breadth);
    }
    //Checking whether the given figure is square or not.
    boolean isSquare()
    {
        if(length == breadth)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
public class Rectangle
{
    public static void main(String[] args)
    {
        RectangleTest r = new RectangleTest();

        r.length = 6;
        r.breadth = 6;

        System.out.println("Length: "+r.length);
        System.out.println("Breadth: "+r.breadth);
        System.out.println("Area: "+r.area());
        System.out.println("Perimeter: "+r.perimeter());
        System.out.println("Diagonal Length: "+r.diagonalLength());
        System.out.println("Is it a Square: "+r.isSquare());
    }
}


    
