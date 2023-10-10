//Functional Interface can have only one method inside it.
@FunctionalInterface
interface MyLambda
{
    //single parameter.
    // public void display(String s);

    //multiple parameters.
    int add(int x, int y);
}
public class Example02 
{
    public static void main(String[] args)
    {
        //calling and printing for single parameter.
        // MyLambda m = (s)->{System.out.println(s);};
        // m.display("Laxman Singh Koranga.");

        // MyLambda m = (x,y)->{return x+y;};
        //or, "x+y" is an expression , that's why lambda expression came into play.
        MyLambda m = (x,y)->x+y;
        // System.out.println(m.add(22,11));

        int sum = m.add(22,11);
        System.out.println(sum);
    }
}