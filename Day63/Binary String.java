//Given a binary string S. The task is to count the number of substrings that start and end with 1. For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.


class Solution
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String str)
    {
        // Your code here
        int count = 0;
        int ans = 0;
        for (int i = 0; i < a; i++) {
            if (str.charAt(i) == '1') {
                count++;
                if (count > 1)
                    ans = ans + (count-1);
            }    
        }
        return ans;
    }
}
