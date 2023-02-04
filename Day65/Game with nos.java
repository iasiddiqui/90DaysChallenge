//You are given an array arr[], and you have to re-construct an array arr[].
//The values in arr[] are obtained by doing Xor of consecutive elements in the array.


class Complete{
    public static int[] game_with_number (int arr[], int n) {
        // Complete the function
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i]^arr[i+1];
        }
    return arr;
    } 
}


