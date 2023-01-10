//Given a array of length N, at each step it is reduced by 1 element. In the first step the maximum element would be removed, while in the second step minimum element of the remaining array would be removed, in the third step again the maximum and so on. Continue this till the array contains only 1 element. And find the final element remaining in the array.

class Solution {
    public long leftElement(long arr[], long n){
        // Your code goes here  
        Arrays.sort(arr);
        int i = 0;
        int j = (int)n-1;
        int mid = (i + j) / 2;
        return arr[mid];
    }
}
