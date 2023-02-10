//Given the value of n, we need to find the sum of the series where i-th term is sum of first i natural numbers.
class Solution {
    static long sumOfTheSeries(long n){
        // code here
        long s=0;
        for(int i=1;i<=n;i++){
            s= s+( (i*(i+1))/2);
        }
        return s;
   }
}
