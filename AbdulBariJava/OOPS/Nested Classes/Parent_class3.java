//Implementing local inner class using non-static nested classes.
public class Parent_class3                          //Parent class.
{
    public static void main(String[] args) 
    {
        String s = "Laxman";                        //string without static access modifier.

        if(s.charAt(0) == 'L')
        {
            class Child_class3                      //Child class.
            {
                void print(String x)                //child class method.
                {
                    System.out.println(s + " " +x);
                }
            }
            Child_class3 cc = new Child_class3();   //child class object.

            String y = "Koranga.";
            cc.print(y);                            //child class object calling.

            //Child class is accessible till here only.
        }
        //Child class is not accessible here.
        else
        {
            System.out.println("Character is not present in the provided index!");
        }
    }
}