//If the interface having the single method, that interface is known as functional interface.
@FunctionalInterface
//defining the interface MyLambda.
interface MyLambda
{
    //by default inside the interface the method is public and abstract.
    public void display();
    // public void play();
}
//Now, we have interface and we can create class and implement this MyLambda interface and overide this method.
/*class My implements MyLambda
{
    public void display()
    {
        System.out.println("Hello, World!");
    }
} 
*/
public class Example1 
{
    public static void main(String[] args)
    {
        //creating the object of interface.
        // MyLambda m = new My();
        
        //creating the anonymous class(inner class).
        /*MyLambda m = new MyLambda()
        {
            public void display()
            {
                System.out.println("Hello, World!");
            }
        };*/

        //creating lambda expression.
        MyLambda m = ()->{System.out.println("Hello, World!");};
        m.display();
    }
}