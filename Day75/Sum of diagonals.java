/*
Given a square of matrix M of size N*N. You task is to compute and return sum of principal diagonal elements of matrix. Your have to complete the function diagonalSum() which accepts N (size of matrix, N*N) and matrix M[ ][ ] as arguments.
*/

class Solution{
    int sumDiagonal(int N, int M[][]){
        // your code here
        int sum = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(i==j){
                    sum = sum + M[i][j];
                }
            }
        }
    return sum;
    }
}
