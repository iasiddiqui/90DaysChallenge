//Given a number N. The task is to check whether it is sparse or not. A number is said to be a sparse number if no two or more consecutive bits are set in the binary representation.
class Solution{
    //Function to check if the number is sparse or not.
     public static boolean isSparse(int n){
        int num2 = n/2 ; //same as n>>1 
        if( (n & num2) > 0 )
            return false;
        return true ;
    }
}
