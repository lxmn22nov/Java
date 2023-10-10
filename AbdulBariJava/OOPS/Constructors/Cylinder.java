//Cylinder program using constructors.

class CylinderTest
{
    //Using Data Hiding.
    private float radius;
    private float height;

    //Implementing get method.
    public float getRadius()
    {
        return radius;
    }
    public float getHeight()
    {
        return height;
    }

    //Implementing set method.
    public void setRadius(float r)
    {
        if(r >= 0)
        {
            radius = r;
        }
        else
        {
            radius = 0;
        }
    }
    public void setHeight(float h)
    {
        if(h >= 0)
        {
            height = h;
        }
        else
        {
            height = 0;
        }
    }

    //Constructor 1 created using without parameter passed.
    public CylinderTest()
    {
        radius = height = 1;
    }

    //Constructor 2 created using with parameter passed.
    public CylinderTest(int r, int h)
    {
        radius = r;
        height = h;
    }

    //Creating object for the cylinder's base.
    public double baseArea()
    {
        return Math.PI * radius * radius;
    }
    //Object created for Curved Surface Area/ Perimeter/Cirumference of the Cylinder.
    public double CSA()
    {
        return 2 * Math.PI * radius * height;
    }
    //Object created for Total Surface Area(CSA + (2 * BaseArea)).
    public double TSA()
    {
        return 2 * Math.PI * radius * (height + radius);
    }
    //Object created for Volume of the cylinder.
    public double Volume()
    {
        return Math.PI * radius * radius * height;
    }
}
public class Cylinder
{
    public static void main(String[] args)
    {
        CylinderTest c = new CylinderTest();

        c.setRadius(7);
        c.setHeight(21);

        System.out.println("Radius of the Cylinder: "+c.getRadius());
        System.out.println("Height of the Cylinder: "+c.getHeight());
        System.out.println("The Base Area: "+c.baseArea());
        System.out.println("The Curved Surface Area: "+c.CSA());
        System.out.println("The Total Surface Area: "+c.TSA());
        System.out.println("The Volume: "+c.Volume());
    }
}