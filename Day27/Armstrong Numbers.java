
class Solution {
    static String armstrongNumber(int n){
        int k=n,r,sum=0;
        while(n>0){
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==k){
            return "Yes";
        }
        else
            return "No";
    }
}
