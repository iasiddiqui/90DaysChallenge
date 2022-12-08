
class Solution {

    public static void convertToWave(int n, int[] a) {

        // code here

        int temp;

        for(int i=1; i<n; i+=2){

                temp =a[i-1];

                a[i-1] = a[i];

                a[i] = temp;

        }

    }

}

        
