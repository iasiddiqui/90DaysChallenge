//Given non-zero two integers N and M. The problem is to find the number closest to N and divisible by M. If there are more than one such number, then output the one having maximum absolute value.


class Solution {
    static int closestNumber(int N , int M) {
        int i=N, j=N;
        while(true)
        {
            if(i%M==0 && j%M==0) {
               if(Math.max(Math.abs(i),Math.abs(j)) == Math.abs(i)) return i;
               return j;
           }
           if(i%M==0) return i;
           if(j%M==0) return j;
               i--;
               j++;
        }
   }
}
