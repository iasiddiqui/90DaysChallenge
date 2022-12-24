//Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).
//Note: There can be more than one element in the array which have the same value as its index. You need to include every such element's index. Follows 1-based indexing of the array.

class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i]==i+1){
                a.add(i+1);
            }
        }
        return a;
    }
}
