//Implementing the static class using nested classes.
class Parent_class1                          //Parent class.
{
    static String s = "Laxman";

    static class Child_class1               //Child class.
    {
        void print(String x)                //Child class method.
        {
            System.out.println(s + " " + x);
        }
    }
    public static void main(String[] args) 
    {
        Child_class1 cc = new Child_class1();
        
        String y = "Koranga.";
        cc.print(y);
    }
}