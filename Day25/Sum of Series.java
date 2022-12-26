//Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms) 

class Solution {
    // function to return sum of  1, 2, ... n
    long seriesSum(int n) {
        // code here
        return(long)n*(n+1)/2;
    }
}



//2nd methon

class Solution {
    // function to return sum of  1, 2, ... n
    long seriesSum(int n) {
        // code here
        int sum =0;
        for(int i=0; i<=n; i++){
            sum = sum+i;
        }
        return sum;
    }
}
