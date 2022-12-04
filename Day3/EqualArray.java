//Check if two arrays are equal or not

class Solution{
    public static boolean check(long A[],long B[],int N)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < A.length;i++){
            if(A[i] != B[i]){
                return false;
            }
            
        }
        return true;
    }
}
