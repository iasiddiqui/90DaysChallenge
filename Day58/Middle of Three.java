//Given three distinct numbers A, B and C. Find the number with value in middle (Try to do it with minimum comparisons).

class Solution{
    int middle(int A, int B, int C){
        //code here
        int a[] = {A,B,C};
        Arrays.sort(a);
        return a[1];
    }
}
