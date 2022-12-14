//Given an array of N positive integers  Arr1, Arr2 ............ Arrn. The value of each contiguous subarray of given array is the maximum element present in that subarray. The task is to return the number of subarrays having value strictly greater than K.



class Solution {

    long countSubarray(int arr[], int n, int k) {
        // code here
        long ans=0;
        int i=0;
        int j=0;
        while(j<n)
        {
            if(arr[i]>k)
            {
                ans+=n-i;
                i++;
            }
            else if(arr[j]>k)
            {
                ans+=(n-j)*(j-i);
                i=j;
            }
            j++;
        }
        if(i<n&&arr[i]>k)ans+=1;
        return ans;
    }
}
