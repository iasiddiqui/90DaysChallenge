//Given a positive integer, N. Find the factorial of N.

class Solution{
    static long factorial(int N){
        long fac =1;
        for(int i =1; i<=N; i++){
            fac=fac*i;
        }
        return fac;
    }
}
