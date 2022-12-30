//Given N,  reverse the digits of N.

class Solution{
    public long reverse_digit(long n){
        long sum=0;
      while(n!=0){
          long d=n%10;
          sum = sum*10+d;
          n=n/10;
      }
      return sum;
    }
}
