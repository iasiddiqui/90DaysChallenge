//Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1.


class Solution{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) {
        //Your code here
        long[] b = new long[n];


        if(n==1){
            b[0] =1;
            return b;
        }
        
        b[0] = 1;
        b[1] =1;
        for (int i=2;i<n;i++){
            b[i] = b[i-1]+b[i-2];
        }
        return b;
    }
}
