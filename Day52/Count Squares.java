//Consider a sample space S consisting of all perfect squares starting from 1, 4, 9 and so on. You are given a number N, you have to output the number of integers less than N in the sample space S.


class Solution {
    static int countSquares(int N) {
        // code here
        int count=0;
        for(int i=1;i<N;i++){
            if((i*i)<N){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
