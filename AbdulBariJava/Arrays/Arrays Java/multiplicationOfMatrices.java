//Multiplication of two matrix & store result into third matrix.
public class multiplicationOfMatrices 
{
    public static void main(String[] args)
    {
        //Declaring and initializing matrix A.
        int A[][] = {{2,4,6},{8,10,12},{1,3,5}};
        System.out.println("Size of Matrix(A): "+A.length);
        System.out.println("Elements into Matrix(A): ");

        //Printing matrix A.
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A.length; j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

        //Declaring and initializing matrix B.
        int B[][] = {{12,5,18},{3,6,9},{1,5,7}};
        System.out.println("Size of Matrix(B): "+B.length);
        System.out.println("Elements into Matrix(B): ");

        //Printing matrix B.
        for(int i = 0; i< B.length; i++)
        {
            for(int j = 0; j < B.length; j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }

        //Initializing matrix C.
        int C[][] = new int[3][3];
        System.out.println("Size of Matrix(C): "+C.length);
        System.out.println("Elements into Matrix(C): ");

        //Multiplying the matrix A & B and storing the result into matrix C.
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A.length; j++)
            {
                C[i][j] = 0;
                for(int k = 0; k < A.length; k++)
                C[i][j] = C[i][j] + (A[i][k] * B[k][j]);
            }
        }

        //Printing the matrix C.
        for(int i = 0; i <C.length; i++)
        {
            for(int j = 0; j < C.length; j++)
            {
                System.out.print(C[i][j]+" ");
            } 
            System.out.println();
        }
    }
}