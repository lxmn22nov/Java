import java.util.Scanner;
public class BitwiseShiftOperators {
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = input.nextInt();

            System.out.println("BITWISE AND: "+(num1 & num2));
            System.out.println("BITWISE OR: "+(num1 | num2));
            System.out.println("BITWISE XOR: "+(num1 ^ num2));
            System.out.println("BITWISE NOT: "+(~num1));
            System.out.println("BITWISE Left Shift: "+(num1 << 2));
            System.out.println("BITWISE Right Shift: "+(num1 >> 2));
            System.out.println("BITWISE Unsigned Right Shift: "+(num1 >>>2));
      }
}