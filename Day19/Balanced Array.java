//Given an array of even size N, task is to find minimum value that can be added to an element so that array become balanced. An array is balanced if the sum of the left half of the array elements is equal to the sum of right half.

//User function Template for Java


class Solution
{
    long minValueToBalance(long a[] ,int n)
    {
        long first=0;
        long second =0;
        for(int i =0;i<n;i++){
            
            if(i<n/2){
            first+=a[i];
                
            }else{
            second+=a[i];    
            }
        }
        return (long)Math.abs(first-second);
    }
}
