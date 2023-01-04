//Given an array of N distinct elements, the task is to find all elements in array except two greatest elements in sorted order.

class Solution {
    public long[] findElements( long a[], long n){
        // Your code goes here
        long[] newArr = new long[a.length-2];
        Arrays.sort(a);
        for(int i=0;i<n-2;i++)
            newArr[i] = a[i];
        return newArr;
    }
}
