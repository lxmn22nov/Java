//Program to illustrate bitwise operator.
class BitwiseOperators{
      public static void main(String[] args) {
            //Intial values.
            int a = 5;
            int b = 7;

            //Bitwise AND, 0101 & 0111 = 0101 = 5(decimal value)
            System.out.println("a & b: "+(a & b));

            //Bitwise OR, 0101 | 0111 = 0111 = 7(decimal value)
            System.out.println("a | b: "+(a | b));

            //Bitwise XOR, 0101 ^ 0111 = 0010 = 2(decimal value)
            System.out.println("a ^ b: "+(a ^ b));

            //Bitwise NOT,
            //~00000000 00000000 00000000 00000101 = 11111111 11111111 11111111 11111010 
            //will give 2's complement (32 bit) of 5 = -6
            System.out.println("~a: "+(~a));

            //can also be combined with assignment operator to provide shorthand assignment.
            //a &= b
            a &= b;
            System.out.println("a: "+a);
      }
}