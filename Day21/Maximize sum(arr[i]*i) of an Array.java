///Given an array A of N integers. Your task is to write a program to find the maximum value of ∑arr[i]*i, where i = 0, 1, 2,., n 1.
//You are allowed to rearrange the elements of the array.
//Note: Since output could be large, hence module 109+7 and then print answer.

class Solution{
    int Maximize(int arr[], int n) {
        // Complete the function
        Arrays.sort(arr);
        long sum = 0;
        for(int i = 0; i < n; i++) {
            sum = (sum + (long)arr[i] * i) % 1000000007;
        }
        return (int)sum;
    }   
}
