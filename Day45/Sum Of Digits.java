//Given a number, N. Find the sum of all the digits of N

class Solution{
    static int sumOfDigits(int N) {
        // code here
        int sum = 0;
        while(N>0) {
            int r = N%10;
            sum = sum + r;
            N = N/10;
        }
        return sum;
    }
}
       
