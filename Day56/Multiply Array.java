//Calculate the product of all the elements in an array.


class Solution{
    public static int product(int arr[],int n){
        int ans=1;
        for(int i=0; i<n; i++){
            ans*=arr[i];
        }
        return ans;
    }
}
