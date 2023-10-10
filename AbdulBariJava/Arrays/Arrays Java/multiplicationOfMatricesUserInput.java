//Multiplication of matrices, taking user input.
import java.util.Scanner;
public class multiplicationOfMatricesUserInput 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        //Diamensions of the matrix A.
        System.out.print("No.of Rows in matrix A: ");
        int row1 = input.nextInt();
        System.out.print("No.of Columns in matrix A: ");
        int col1 = input.nextInt();

        //Diamensions of the matrix B.
        System.out.print("No.of Rows in matrix B: ");
        int row2 = input.nextInt();
        System.out.print("No.of Columns in matrix B: ");
        int col2 = input.nextInt();

        //Requirement check to implement matrix multiplication.
        if(col1 != row2)
        {
            System.out.println("Matrix multiplication is not possible!");
            return;
        }

        //Input the values of matrix A.
        int A[][] = new int[row1][col1];
        System.out.print("Enter the elements of matrix A: ");

        for(int i = 0; i < row1; i++)
        {
            for(int j = 0; j <col1; j++)
            {
                A[i][j] = input.nextInt();
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

        //Input the values of matrix B.
        int B[][] = new int[row2][col2];
        System.out.print("Enter the elements of matrix B: ");

        for(int i = 0; i < row2; i++)
        {
            for(int j = 0; j < col2; j++)
            {
                B[i][j] = input.nextInt();
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }

        //Declaring matrix C.
        int C[][] = new int[row1][col2];
        System.out.println("Matrix C: ");

        //Performing matrix multiplication, using nested loops.
        for(int i = 0; i < row1; i++)
        {
            for(int j = 0; j <col2; j++)
            {
                C[i][j] = 0;
                //Dot product multiplication.
                for(int k = 0; k < col1; k++)
                {
                    C[i][j] = C[i][j] + (A[i][k] * B[k][j]);
                }
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}