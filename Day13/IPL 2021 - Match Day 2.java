//Due to the rise of covid-19 cases in India, this year BCCI decided to organize knock-out matches in IPL rather than a league.
//Today is matchday 2 and it is between the most loved team Chennai Super Kings and the most underrated team - Punjab Kings. Stephen Fleming, the head coach of CSK, analyzing the batting stats of Punjab. He has stats of runs scored by all N players in the previous season and he wants to find the maximum score for each and every contiguous sub-list of size K to strategize for the game



class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        
        Deque<Integer> q=new ArrayDeque<>();
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int i=0,j=0;
        
        if(k==1){
            for(int z:arr){
                ans.add(z);
            }
            return ans;
        }
        
        q.offer(arr[i]);
        
        while(j<n-1){
            j++;
            if(j-i+1<k){
                if(q.size()!=0){
                    while(q.size()!=0 && arr[j]>q.peekLast()){
                        q.removeLast();
                    }
                    q.offer(arr[j]);
                }
                
                continue;
            }
            
            while(q.size()!=0 && arr[j]>q.peekLast()){
                q.removeLast();
            }
            if(q.size()!=0 && arr[j]<=q.peekLast()){
                q.offer(arr[j]);
            }
            if(q.size()==0){
                q.offer(arr[j]);
            }
            ans.add(q.peekFirst());
            
            if(arr[i]==q.peekFirst()){
                q.removeFirst();
            }
            i++;
                
        }
        return ans;
    }
}
