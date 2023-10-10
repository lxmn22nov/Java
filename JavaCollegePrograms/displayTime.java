import java.util.Scanner;

public class displayTime
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an integer for seconds: ");
    int seconds = input.nextInt();
 
    int minutes = seconds / 60; 
    int hour = minutes/60;
    int remainingSeconds = seconds % 60; 
    System.out.println(seconds + " seconds is " + hour + " Hour " + minutes + " Minutes and " + remainingSeconds + " Seconds.");  

    input.close();
    System.out.println("Written by Laxman Singh Koranga.");
    System.out.print("SAP:1000017428");
  }
}