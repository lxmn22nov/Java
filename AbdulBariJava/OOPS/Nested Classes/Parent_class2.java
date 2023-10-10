//Implementing the non-static class using nested class.
public class Parent_class2                      //Parent_class.
{
    String s = "Laxman";                        //string without static access modifier.

    class Child_class2
    {
        void print(String x)                    //child class method.
        {
            System.out.println(s + " " + x);
        }
    }
    public static void main(String[] args)
    {
        Parent_class2 pc = new Parent_class2(); //Parent class object.
        Child_class2 cc = pc.new Child_class2();//Child class object using parent class object.

        String y = "Koranga.";
        cc.print(y);                            //Calling method of child class.
    }
}