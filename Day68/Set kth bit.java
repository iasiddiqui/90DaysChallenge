//Given a number N and a value K. From the right, set the Kth bit in the binary representation of N. The position of Least Significant Bit(or last bit) is 0, the second last bit is 1 and so on. 

class Solution{
    static int setKthBit(int n,int k){
        // code here
        int bitm = 1<<k;
        int newnum = bitm | n;
        return newnum;
    }
}
