//Transpose of the matrix.
import java.util.Scanner;
public class transposeOfMatrix1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no.of rows(r): ");
        int m = input.nextInt();

        System.out.print("Enter no.of columns(c): ");
        int n = input.nextInt();

        int M[][] = new int[m][n];
        System.out.print("Elements into the matrix(M) of diamension ("+m+" x "+n+"): ");
        //Traversing the 2D matrix.
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                M[i][j] = input.nextInt();
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }

        //Create an empty matrix transpose of diamension (mxn).
        int M_transpose[][] = new int[n][m];

        //Traversing matrix(M).
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                //Assigning M_transpose = M
                M_transpose[j][i] = M[i][j];
            }
        }
        
        System.out.println("Elements of Transposed Matrix(M_transpose) of diamension ("+n+" x "+m+"): ");
        //Output of the transpose matrix.
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(M_transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
} 