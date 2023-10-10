//Data Hiding using get and set method.
class DataHiding 
{
    private float length; 
    private float breadth;

    //Get methods is used to print the value.
    public float getlength()        //get method for length.
    {
        return length;
    }
    public float getbreadth()       //get method for breadth.
    {
        return breadth;
    }
    //Set method is used to initialize/declare the value.
    public void setlength(float l)    //set method for length.
    {
        if(l >= 0)
        {
            length = l;
        }
        else
        {
            length = 0;
        }
    }
    public void setbreadth(float b)  //set method for breadth.
    {
        if(b >= 0)
        {
            breadth = b;
        }
        else
        {
            breadth = 0;
        }
    }
    float area()
    {
        return length * breadth;
    }
    float perimeter()
    {
        return 2 * (length + breadth);
    }
}

public class DataHidingTest
{
    public static void main(String[] args)
    {
        DataHiding d = new DataHiding();

        //This happened because the access modifies of the variable into the class is private, and no one can access it from outside.
        // d.length = 5;
        // d.breadth = 3;
        //So, to provide the values to the variable we have to use get & set methods or getter and setter methods.
        
        d.setlength(5);
        d.setbreadth(3);

        //Cannot print because the declaration into the class is private.
        // System.out.println("Length: "+d.length);
        // System.out.println("Breadth: "+d.breadth);

        //Prints the length & breadth with the help of getter and setter method.
        System.out.println("Length: "+d.getlength());
        System.out.println("Beadth: "+d.getbreadth());

        //Setter methods cannot be printed.
        // System.out.println("Length: "+d.setlength());
        // System.out.println("Breadth: "+d.setbreadth());

        System.out.println("Area: "+d.area());
        System.out.println("Perimeter: "+d.perimeter());
    }

}