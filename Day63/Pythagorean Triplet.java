//Given an array arr of N integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2, otherwise false.


class Solution {
    boolean checkTriplet(int[] arr, int n) {
        ArrayList list=new ArrayList<Integer>();
        int flag=-1;
        for(int i=0;i<n;i++)
        {
            list.add(arr[i]*arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int curr=arr[i]*arr[i];
                int curr1=arr[j]*arr[j];
                if( list.contains(curr+curr1) )
                {
                    flag=1;
                    i=n;
                    break;
                }
            }
        }
        return flag==1 ? true : false;
    }
}
