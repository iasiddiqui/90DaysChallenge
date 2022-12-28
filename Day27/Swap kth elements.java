//Given an array Arr of size N, swap the Kth element from beginning with Kth element from end.

class Solution {
    void swapKth(int arr[], int n, int k) {
        for(int i=0;i<n;i++){
            if(i==k-1){
                int temp=arr[arr.length-k];
                arr[arr.length-k]=arr[i];
                arr[i]=temp;
            }
        }
    }
}
