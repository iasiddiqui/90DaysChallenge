//Given an array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K.



class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<=n-k;i++){
            int max=arr[i];
            int count=0;
            int j=i;
            while(count!=k){
                max=Math.max(arr[j],max);
                j++;
                count++;
            }
            list.add(max);
        }
        return list;
    }
}
