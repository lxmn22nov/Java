import java.util.Scanner;

public class SalesTax 
{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
  
      System.out.print("Enter purchase amount: ");
      double purchaseAmount = input.nextDouble();
      
      double tax = purchaseAmount * 0.06;
      System.out.println("Sales tax is " + (int)(tax * 100) / 100.0);
      
      input.close();
      System.out.println("Written by Laxman Singh Koranga.");
      System.out.print("SAP:1000017428");
    }
}