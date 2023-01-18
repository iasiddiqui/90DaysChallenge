//Given an array of N positive integers where all numbers occur even number of times except one number which occurs odd number of times. Find the exceptional number.

class Solution {
    int getOddOccurrence(int[] arr, int n) {
        n=0;
        for(int i:arr)
        n^=i;
        return n;
    }
}
