//User function Template for Java

class Solution{

    public static int kthSmallest(int[] arr, int l, int r, int k) 

    { 

        //Your code here

        Arrays.sort(arr);

        int count=0;

        for(int i=0; i<r; i++){

            count = arr[k-1];

        }

        return count;

    } 

}
