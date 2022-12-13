//The sub-array should be contiguous i.e., a sub-array created by choosing the second and fourth element and skipping the third element is invalid.

//Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).




// User function Template for Java

class Solution {

    ArrayList<Integer> findSubarray(int arr[], int n) {

        // code here

        ArrayList<Integer> ans=new ArrayList<>();

        ArrayList<Integer> temp=new ArrayList<>();

        int max=0,curMax=0;

        for(int i=0;i<n;i++){

            if(arr[i]<0){

                if(max<curMax){

                   max=curMax;

                    ans.clear();

                    ans.addAll(temp);

                }

                curMax=0;

                temp.clear();

            }

            else{

            curMax+=arr[i];

            temp.add(arr[i]);

            }

            

        }

        if(ans.size()==0||max<curMax){

            ans.clear();

            ans.addAll(temp);

            if(ans.size()==0){

                ans.add(-1);

            return ans;

            }

        }

        

        return ans;

    }

}
