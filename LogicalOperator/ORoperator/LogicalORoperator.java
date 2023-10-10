public class LogicalORoperator{
      public static void main(String[] args) {
            //Initializing the values.
            int a = 10, b = 1, c = 10, d = 30;

            System.out.println("var1: "+a);
            System.out.println("var2: "+b);
            System.out.println("var3: "+c);
            System.out.println("var4: "+d);

            if((a > b) || (c == d)){
                  System.out.println("One or both + the conditions are true.");
            }
            else{
                  System.out.println("Both the conditions are false!");
            }
      }
}