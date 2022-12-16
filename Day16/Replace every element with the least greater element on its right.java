//Given an array arr[] of N integers and replace every element with the least greater element on its right side in the array. If there are no greater elements on the right side, replace it with -1. 



class Solution {
    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
        // code here
        TreeSet<Integer> ts=new TreeSet<>();
        int a[]=new int[n];
        for(int i=n-1;i>=0;i--){
            if(ts.ceiling(arr[i]+1)==null){
                a[i]=-1;
            }else{
                a[i]=ts.ceiling(arr[i]+1);
            }
            ts.add(arr[i]);
        }
        ArrayList<Integer> A=new ArrayList<>();
        for(int i:a){
            A.add(i);
        }
        return A;
    }
}   
