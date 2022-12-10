
class Solution{

    static int minJumps(int[] arr){

        // your code here

        int len = arr.length;

 

        int jumps = 0;

 

       

        for(int idx=0;idx<len-1; ) {

            int element = arr[idx];

            

            // Case when we reach on element which is 0 then we can't move forward

            if(element <= 0) {

                return -1;

            }

            

            int maxIdx = -1;

            int maxVal = Integer.MIN_VALUE;

 

            int tempIdx = idx + element;

            

            //We calculated index till that we can reach if that index is greater than lenth of array so we consider this jump as last and break the loop

             if(tempIdx >= len){

                    jumps++;

                    break;

                }

            

            // we will start searching element from the next index of current element so adding 1 till last index

            for(int j = idx+1;j <= tempIdx;j++){

                

                //There may be case we got 3-10 index while jumping if element 20 found on 3rd index and element 14 found on 10th index so with that 14 we can jump far away than 20 because it present 7indexes before 14 element 

                if(maxVal > 0)

                    maxVal--;

 

                if(arr[j] >= maxVal) {

                    maxIdx = j;

                    maxVal = arr[j];

                }

            }

 

            idx = maxIdx;

            //.out.println("now index: "+idx);

            jumps++;

        }

 

        return jumps;

    }

}
