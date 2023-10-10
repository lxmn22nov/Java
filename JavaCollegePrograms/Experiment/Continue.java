public class Continue 
{
    public static void main(String[] args) {
      int sum = 0;
      int number = 0;
  
      while (number < 20) {
        number++;
        if (number == 11 || number == 12) 
          continue;
        sum += number;
      }
  
      System.out.println("The sum is " + sum);
      System.out.println("This program is created by Laxman Singh Koranga.");
    }
  }