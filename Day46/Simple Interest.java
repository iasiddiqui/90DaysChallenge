//Given three integers P,R and T, denoting Principal, Rate of Interest and Time period respectively.Compute the simple Interest.

class Solution {
   double simpleInterest(int P, int R, int T) {
       // code here
       double p = P;
       double t = T;
       double r = R;
       
       return ((p*t*r)/100);
   }
}
