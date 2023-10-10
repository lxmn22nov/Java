//Addition of two matrix and their result stored into third matrix.

class additionOfMatrices
{
    public static void main(String[] args)
    {
        //Declaring & Initializing array A & B.
        int A[][] = {{3,6,9},{2,4,6},{1,3,5}};
        System.out.println("Size of A: "+A.length);
        System.out.println("Elements in Matrix (A): ");

        //Printing matrix A.
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[0].length; j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

        int B[][] = {{0,9,8},{7,6,5},{4,3,2}};
        System.out.println("Size of B: "+B.length);
        System.out.println("Elements in Matrix (B): ");

        //Printing matrix B.
        for(int i = 0; i < B.length; i++)
        {
            for(int j = 0; j < B[0].length; j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }

        //Declaring & Initializing array C.
        int C[][] = new int [3][3];
        
        System.out.println("Elements in Matrix (C): ");
        
        //Adding the elements of matrix A & B into C.
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[0].length; j++)
            {
                C[i][j] = A[i][j] + B[i][j];
                // System.out.print(C[i][j]+" ");
            }
            // System.out.println();
        }
        
        //Printing Matrix C.
        for(int i = 0; i < C.length; i++)
        {
            for(int j = 0; j < C.length; j++)
            {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}