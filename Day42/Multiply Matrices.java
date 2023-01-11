//Given two square Matrices A[][] and B[][]. Your task is to complete the function multiply which stores the multiplied matrices in a new matrix C[][].


class GfG{
      public static void multiply(int[][] A, int[][] B, int[][] C, int N) {
        // For Matrix A x B = the number of columns in A Matrix has to equal the number of rows in B
        if (N > 0 && N <= 20) {
            int rowsOfA = A[0].length;
            int colsOfB = 0;
            for(int[] ignored : B) {
                colsOfB++;
            }
            
            if (rowsOfA == colsOfB) {
                for (int i = 0; i < A.length; i++) {
                    for (int j = 0; j < A[i].length; j++) {
                        for (int k = 0; k < A.length; k++) {
                            C[i][j] += A[i][k] * B[k][j];
                        }
                    }
                }
            }
        }
    }
}
