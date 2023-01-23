//Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.


class Solution {
    int search(int []nums,int target,boolean first){
        int s=0,e=nums.length-1,ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<target)s=mid+1;
            else if(nums[mid]>target)e=mid-1;
            else{
               ans=mid;
               if(first){
                  e=mid-1; 
               }else{
                  s=mid+1; 
               }
            }
        }
        return ans;
    }
    int count(int[] nums, int n, int target) {
        // code here
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        if(start== -1 && end== -1)return 0;
        return end-start+1;
    }
}
