//Given an array arr[] containing positive elements. A and B are two numbers defining a range. The task is to check if the array contains all elements in the given range.

class Solution{
    boolean check_elements(int arr[], int n, int A, int B){
        ArrayList<Integer> al= new ArrayList<>();
        for(int i =0; i<n;i++){
            al.add(arr[i]);
        }
        for(int i=A; i<=B; i++){
            if(!al.contains(i)){
                return false; 
            }
        }
        return true;
    }
}
