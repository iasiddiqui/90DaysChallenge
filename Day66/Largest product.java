//Given an array consisting of N positive integers, and an integer k .You have to find the maximum product of k contiguous elements in the array. Your task is to complete the function which takes three arguments .The first argument  is the array A[ ] and second argument is an integer N denoting the size of the array A[ ] and the third argument  is an integer k.The function will return and value denoting the largest product of sub-array of size k.
class GfG{
    long findMaxProduct(int A[], int n, int k){
        // Your code here
        int x=0;
        long p=1l;
        long max=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            p=(long)p*A[i];
            k--;
            if(k==0){
                max=Math.max(p,max);
                p/=A[x];
                x++;
                k++;
            }
        }
        return max;
    }
}
