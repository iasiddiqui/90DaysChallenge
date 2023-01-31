//You are given two numbers A and B. The task is to count the number of bits needed to be flipped to convert A to B.

class Solution{
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b)
    {
        int count=0;
        for(int temp=a^b; temp>0; temp/=2)
        {
            count += temp%2 == 1 ? 1 : 0;
        }
        return count;
    }
}
