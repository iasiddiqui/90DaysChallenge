//A series with same common difference is known as arithmetic series. The first term of series is 'a' and common difference is d. The series looks like a, a + d, a + 2d, a + 3d, . . . Find the sum of series upto nth term.

class Solution{
   public long sum_of_ap(long n, long a, long d){
       // Code here
       long ap=0;
       for(int i=0;i<n;i++){
           ap=ap+(a+(i*d));
       }
       return ap;
   }
}
