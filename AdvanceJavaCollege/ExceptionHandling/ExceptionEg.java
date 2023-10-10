//Implementation of Arithmetic Exception Handling.
class ExceptionEg
{
    public static void main(String args[]) 
    {
      try 
      {
        // Code that can raise exception.
        int division = 509 / 0;
      } 
      catch (ArithmeticException e) 
      {
        System.out.println(e);
      }
      System.out.println("End of code.");
    }
  }