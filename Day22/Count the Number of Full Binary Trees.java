//Given an array arr[] of n integers, where each integer is greater than 1. The task is to find the number of Full binary tree from the given integers, such that each non-leaf node value is the product of its children value.
//Note: Each integer can be used multiple times in a full binary tree. The answer can be large, return  answer modulo 1000000007



//User function Template for Java

class Solution {
    
    public static int numoffbt(int arr[], int n)
    {
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int MOD = 1000000007;
        for (int i = 0; i < n; i++)
        {
            maxValue = Math.max(maxValue, arr[i]);
            minValue = Math.min(minValue, arr[i]);
        }
     
        int mark[] = new int[maxValue + 1];
        int value[] = new int[maxValue + 1];
        Arrays.fill(mark, 0);
        Arrays.fill(value, 0);
        for(int i=0; i<n; ++i){
            mark[arr[i]] = 1;// it is there
            value[arr[i]] = 1; // single node forms a complete binary tree
        }
        int ans = 0;
        for(int i=minValue; i<=maxValue; ++i){
            if(mark[i] != 0){ // if it is prime, go for multiples and unmark them, similarly, if it is there in arr, find for other node to get a parent node which is in array
                for(int j=i+i; j<=maxValue && j<=i*i; j+=i){
                    if(mark[j] == 0){
                        continue; // not there in array
                    }
                    value[j] = (value[j]+value[i]*value[j/i]%MOD)%MOD;
                    // we can interchage left subtree and right subtree
                    if(i != j/i){
                        value[j] = (value[j]+value[i]*value[j/i]%MOD)%MOD;
                    }
                }
            }
            ans = (ans + value[i])%MOD;
        }
        return ans;
    }
}
