public class LogicalANDoperator {
      public static void main(String[] args) {
            //initializing the values.
            int a = 10, b = 20, c = 20, d = 0;
            System.out.println("var1: "+a);
            System.out.println("var2: "+b);
            System.out.println("var3: "+c);

            if((a < b) && (b == c)){
                  d = (a + b + c);
                  System.out.println("The sum is: "+d);
            }
            else{
                  System.out.println("False conditions!");
            }
      }
}
