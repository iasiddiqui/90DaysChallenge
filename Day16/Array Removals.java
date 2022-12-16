//Given an array arr[] of size N and an integer K. The task is to find the minimum number of elements that should be removed, such that Amax-Amin<=K. After the removal of elements, Amax and Amin is considered among the remaining elements. 

class Solution {
    int removals(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int i=0, j=0, maxRange = 0;
        while(j<n){
            if(arr[j]-arr[i] <= k) j++;
            else if(i < j) i++;
            maxRange = Math.max(maxRange, j - i);

        }

        return n-maxRange;

    }
}
