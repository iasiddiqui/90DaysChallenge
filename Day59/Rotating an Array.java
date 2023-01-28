//Given an array of size N. The task is to rotate array by D elements where D ≤ N.


class Solution {
    void leftRotate(int[] arr, int n, int d) {
        // code here
        int[] nums = new int[n];
        for(int i =0;i<n;i++){
            nums[i]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=nums[(i+d)%n];
        }
    }
}
