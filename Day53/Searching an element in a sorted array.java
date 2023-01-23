//Given an array arr[] sorted in ascending order of size N and an integer K. Check if K is present in the array or not.

class Solution{
    static int searchInSorted(int arr[], int N, int K){
        // Your code here
          int s=0;
        int e =N-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==K){
                return 1;
            }else if(arr[mid]<K){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
       return-1; 
    }
}
