/* A flock of sheep is running east along a straight, narrow road. Each one is running at its own constant speed. Whenever a sheep catches up to the one in front of it, it has to slow down and follow at the speed of the other sheep. You are in a mobile crane behind the flock, chasing the sheep towards the barn at the end of the road. The arm of the crane allows you to pick up any sheep momentarily, let the sheep behind it pass underneath, and place the picked-up sheep back down. This operation takes no time and can only be performed on a pair of sheep that are immediately next to each other, even if 3 or more sheep are in a row, one after the other.

Given the initial locations (Xi) at time 0 and natural speeds (Vi) of the sheep, as well as the location of the barn (B), what is the minimum number of swaps you need to perform with your crane in order to have at least K of the N sheep arrive at the barn no later than time T?

You may think of the sheep as points moving along a line. Even if 3 or more sheep are at the same location, next to each other, picking up one of them will only let one of the other two pass through. Any swap is instantaneous, which means that you may perform multiple swaps at the same time, but each one will count as a separate swap.*/


class Solution {
    public static int minimumSwaps(int[] c, int[] v,int n,int k,int b,int t) {
        int slow=0;
        int NoOfSwaps=0;
        for(int i=n-1;i>=0;i--){
            int pos=c[i]+(v[i]*t);
            if(pos>=b){
                k--;
                NoOfSwaps+=slow;
                if(k==0)return NoOfSwaps;
            }else{
                slow++;
            }
        }
        return -1;
    }
}
