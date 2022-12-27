//Given an array arr[] of N integers, calculate the median
class Solution
{
    public int find_median(int[] v)
    {
        // Code here
        Arrays.sort(v);
        int n = (int)(v.length/2);
        int median = v[n];
        if (v.length%2==0) {
            median = (int)((v[n-1]+v[n])/2);
        }
        return median;
    }
}
