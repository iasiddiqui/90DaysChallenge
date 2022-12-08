/*Complete the function below*/

class Solution

{

    // arr[]: input array

    // n: size of the array

    //Function to find triplets with zero sum.

	public boolean findTriplets(int arr[] , int n)    {

        //add code here.

        int i, l, r;

        Arrays.sort(arr);

        for(i=0; i<n-2; i++){

            l=i+1;

            r=n-1;

            while(l<r){

                if(arr[i]+arr[l]+arr[r] == 0)

                return true;

                else if(arr[i]+arr[l]+arr[r]<0)

                l++;

                else

                r--;

            }

        }

        return false;

    }

}
