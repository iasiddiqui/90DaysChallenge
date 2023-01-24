//Given the first 2 terms A1 and A2 of an Arithmetic Series.Find the Nth term of the series. 


class Solution {
    int nthTermOfAP(int A1, int A2, int N) {
       int d,a=0;
       d=A2-A1;
       a=A1+(N-1)*d;
       return a;
    }
}
