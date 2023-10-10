//Implementing static variable 
class static_var_test 
{
    static int value;
    static boolean value1;

    public static void main(String[] args)
    {
        //default values of int and boolean.
        System.out.println(static_var_test.value);
        System.out.println(static_var_test.value1);

        //Intiating the values of int and boolean datatype.
        static_var_test.value = 5;
        static_var_test.value1 = true;

        //Printing after intiating values.
        System.out.println(static_var_test.value);
        System.out.println(static_var_test.value1);

    }
}