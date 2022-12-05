class Solution{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int start=0;
        int i=0;
        int sum=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(i<n){
            sum=sum+arr[i];
            while(sum>s && start<i){
                sum=sum-arr[start++];
            }
            
            if(sum==s){
                ans.add(start+1);
                ans.add(i+1);
                return ans;
            }
            i++;
        } 
        ans.add(-1);
        return ans;
    }
}
