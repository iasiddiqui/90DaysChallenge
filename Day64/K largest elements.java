//Given an array of N positive integers, print k largest elements from the array. 

class Solution{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k){
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            minHeap.add(arr[i]);
            if(minHeap.size()>k)
                minHeap.remove();
        }
        for(int i=0;i<k;i++){
            ans.add(minHeap.peek());
            minHeap.remove();
        }
        Collections.reverse(ans);
        return ans;
    }
}
