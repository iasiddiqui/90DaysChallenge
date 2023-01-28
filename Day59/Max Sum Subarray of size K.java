//Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.


class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        int i=0;
        int j=0;
        long TSum = 0;
        long maxi = 0;
        while(j<N)
        {
            TSum += Arr.get(j);
            if(j-i+1 < K) { j++; }
            else if(j-i+1 == K)
            {
                maxi = Math.max(maxi,TSum);
                TSum = TSum - Arr.get(i);
                i++;
                j++;
            }
        }
        return maxi;
    }
}
