//Given an array of size n, a triplet (a[i], a[j], a[k]) is called a Magic Triplet if a[i] < a[j] < a[k] and i < j < k.  Count the number of magic triplets in a given array.



//User function Template for Java

class Solution{
    public int countTriplets(int[] nums){
        int n = nums.length;
        
        int res = 0;
        
        for(int i = 1; i < n - 1; i++){
            int temp1 = 0;
            // Left Smaller
            for(int j = i - 1; j >= 0; j--){
                if(nums[i] > nums[j]) temp1++;
            }
            
            if(temp1 == 0) continue; // No left smaller
            
            int temp2 = 0;
            // right greater
            for(int j = i + 1; j < n; j++){
                if(nums[i] < nums[j]) temp2++;
            }
            
            res+= (temp1 * temp2);
        }
        
        return res;
    }
}
