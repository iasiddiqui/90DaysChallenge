//Reverse Array in Groups


class Solution {
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        Stack<Integer> stk= new Stack<>();
        int m=0;
        for(int i=0;i<n;i++){
            stk.push(arr.get(i));
            if((i+1)%k==0){
                while(stk.size()!=0){
                    arr.set(m,stk.peek());
                    stk.pop();
                    m++;
                }
            }else if(i==n-1){
                while(stk.size()!=0){
                    arr.set(m,stk.peek());
                    stk.pop();
                    m++;
                }
            }
        }
    }
}
