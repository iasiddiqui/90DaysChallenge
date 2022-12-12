//Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.

Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.
class Solution{

    

    // temp: input array

    // n: size of array

    //Function to rearrange  the array elements alternately.

   public static void rearrange(long arr[], int n){

        

        long l=arr[n-1]+1;

        for(int i=0;i<n/2;i++){

            arr[i+i+1]+=(arr[i]%l)*l;

        }

        for(int i=n-1,j=0;i>= n/2; i--,j=j+2){

            long num = (arr[i]%l);

            arr[j] = num*l + arr[j];

        }

        for(int i=0;i<n;i++){

            arr[i]/=l;

        }

        

    }

    

}

