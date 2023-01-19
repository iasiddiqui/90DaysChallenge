//Given a non-negative integer N. The task is to check if N is a power of 2. More formally, check if N can be expressed as 2x for some x.

class Solution{
    public static boolean isPowerofTwo(long n){
        for(int i=0;i<n;i++){
            long x = (long)Math.pow(2,i);
            if(x==n){
                return true;
            }else if(x>n){
                return false;
            }
        }
        return false;
    }
    
}
