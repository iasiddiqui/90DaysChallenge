//Write a program to calculate nPr. nPr represents n permutation r and value of nPr is (n!) / (n-r)!.

class Solution{
    static long nPr(long n, long r){
        long count = 1;
        for(int i = (int)n; i > n-r; i--){
            count *= i;
        }
        return count;
    }
}
