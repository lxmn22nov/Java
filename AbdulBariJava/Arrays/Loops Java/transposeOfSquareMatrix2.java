//Transpose of square matrix(n*n).
import java.util.Scanner;
public class transposeOfSquareMatrix2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //Taking user input of diamension.
        System.out.print("Enter the no.of rows: ");
        int n = input.nextInt();

        //Declaring matrix A.
        int A[][] = new int[n][n];
        System.out.print("Elements into matrix(A): ");
        //Taking user input for matrix A.
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                A[i][j] = input.nextInt();
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        //Traversing matrix A.
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                //Swapping A[i][j] with A[j][i] using temporary variable.
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        System.out.println("Transposed Matrix(A): ");
        //Output of the matrix A which converted into the traspose of matrix A.
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}