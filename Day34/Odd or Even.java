//Given a positive integer N, determine whether it is odd or even.

class Solution{
    static String oddEven(int n){
        // code here
        String ans = ((n & 1)==0)?"even":"odd";
        return ans;
    }
}
