//can lambda expressions have local variables? Yes.
//can lambda expressions access local variables/instances? Yes.
//can we pass lambda expressions as parameters?
@FunctionalInterface
interface MyLambda
{
    public void display();
}
/*class Demo
{
    //instance variable outside the method1, can we access this variable inside the lambda expression? yes.
    int temp = 2211;
    public void method1()
    {
        // local variables referenced from a lambda expression must be final or effectively final.
        int count = 22;
        //we can have multiple statements inside the lambda expressions.
        MyLambda m = ()->{
            //yes, we can declare variable inside lambda expression and we can access the same.
            // int count = 22;                                    
            System.out.println("Hi,");       
            System.out.println("Laxman Singh Koranga "+count);
            //intance variable cannot be cannot be final as local variable is getting final or we cannot modifify it after declaring.                
            System.out.println("Laxman Singh Koranga "+(++temp));
        };
        m.display();
        // count++;
    } 
}*/
class UseLambda
{
    public void callLambda(MyLambda ml)
    {
        ml.display();
    }
}
class Demo2
{
    public void method2()
    {
        UseLambda ul = new UseLambda();
        //parameter passing with lambda expression.
        ul.callLambda(()->{System.out.println("Fuck'emAll");});
    }
}
public class Example03
{
    public static void main(String[] args) 
    {
        Demo d = new Demo();
        d.method1(); 
    }
}