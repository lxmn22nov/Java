//Implementing anonymous inner class using nested non-static class.
abstract class Printer
{
    abstract void print(String x);
}
class Parent_class4 
{
    public static void main(String[] args)
    {
        Printer p = new Printer()
        {
            void print(String x)
            {
                System.out.println("Laxman " + x);
            }
        };
        String y = "Koranga.";
        p.print(y);
    }
}