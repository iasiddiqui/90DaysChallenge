//Given a single integer N, your task is to find the sum of the square of the first N even natural Numbers.

class Solution{
     public long sum_of_square_evenNumbers(long n){
        long squreSum = 0; 
        for(int i=1; i<=(2*n); i++) {
            i++ ;
            squreSum += Math.pow(i,2) ;
        }
        return squreSum ;
    }
}
