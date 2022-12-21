//Given an array arr of distinct elements of size N, the task is to rearrange the elements of the array in a zig-zag fashion so that the converted array should be in the below form: 
//arr[0] < arr[1]  > arr[2] < arr[3] > arr[4] < . . . . arr[n-2] < arr[n-1] > arr[n]. 
//NOTE: If your transformation is correct, the output will be 1 else the output will be 0. 



// User function Template for Java

class Solution
{
    void zigZag(int arr[], int n)
    {
        for(int i=0; i<n-1; i++)
        {
            if(i%2==0 && arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            else if(i%2!=0 && arr[i]<arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
}

