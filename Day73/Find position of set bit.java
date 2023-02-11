//Given a number N having only one ‘1’ and all other ’0’s in its binary representation, find position of the only set bit. If there are 0 or more than 1 set bit the answer should be -1. Position of  set bit '1' should be counted starting with 1 from LSB side in binary representation of the number.

class Solution {
    static int findPosition(int N) {
        // code here
        if(N==0) return -1;
        int bin[]=new int[32];
        int i=0;
        while(N!=0){
            bin[i++]=N%2;
            N=N/2;
        }
        int count=0,pos=0;
        for(int l=i-1;l>=0;l--){
            if(bin[l]==1){
                pos=l+1; 
                count++;
                if(count>=2){
                    return -1;
                }
            }
        }
        return pos;
    }
};
