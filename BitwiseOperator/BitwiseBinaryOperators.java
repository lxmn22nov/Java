public class BitwiseBinaryOperators{
      public static void main(String[] args) {
            String binary[] = {"0000","0001","0010","0011","0100","0101","0110",
            "0111","1000","1001","1010","1011","1100","1101","1110","1111"};

            //Initializing the values of a and b.
            int a = 3;
            int b = 6;

            //Bitwise OR.
            int c = a | b;

            //Bitwise AND.
            int d = a & b;

            //Bitwise XOR.
            int e = a ^ b;

            //Bitwise NOT.
            int f = (~a & b) | (a & ~b);
            int g = ~a & 0x0f;

            System.out.println("a: "+binary[a]);
            System.out.println("b: "+binary[b]);
            System.out.println("a | b: "+binary[c]);
            System.out.println("a & b: "+binary[d]);
            System.out.println("a ^ b: "+binary[e]);
            System.out.println("(~a & b) | (a & ~b): "+binary[f]);
            System.out.println("~a: "+binary[g]);
      } 
}