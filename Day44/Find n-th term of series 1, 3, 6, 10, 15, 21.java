//Given a number N, find the Nth term in the series 1, 3, 6, 10, 15, 21…


class Solution {
    static int findNthTerm(int N) {
        // code here
        int ans = 0;
        for (int i = 1; i <= N; i++)
            ans =ans+ i;
        return ans;
    }
};
