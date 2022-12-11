//Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 




class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 

        // Calculate max left boundary - array.

        long leftMax[] = new long[n];

        leftMax[0] = arr[0];

        for(int i=1; i<n ; i++){

            leftMax[i] = Math.max(arr[i], leftMax[i-1]) ;

        }

        // Calculate max right boundary - array.

        long rightMax[] = new long[n];

        rightMax[n-1] = arr[n-1];

        for(int i=n-2 ; i>=0 ; i--){

            rightMax[i] = Math.max(arr[i], rightMax[i+1]);

        }

        long trappedWater = 0 ;

        // loop

        for(int i= 0; i<n ;i++){

             // WaterLevel = Min(left boundary, right boundary) 

            long waterLevel = Math.min(leftMax[i], rightMax[i]) ;

            // trapped Water = waterLevel - height . 

            trappedWater += waterLevel - arr[i] ;

        }

       return trappedWater ;

    } 
}
