//Given a street of N houses (a row of houses), each house having K amount of money kept inside; now there is a thief who is going to steal this money but he has a constraint/rule that he cannot steal/rob two adjacent houses. Find the maximum money he can rob.

class Solution {
    static int maximizeMoney(int N , int K) {
        // code here
        int ans=0;
        if(N%2==0){
            return N/2*K;}
        return (N/2+1)*K;
    }
};
