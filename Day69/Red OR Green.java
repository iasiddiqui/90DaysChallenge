//Given a string of length N, made up of only uppercase characters 'R' and 'G', where 'R' stands for Red and 'G' stands for Green.Find out the minimum number of characters you need to change to make the whole string of the same colour.

class Solution {
    static int RedOrGreen(int N, String S) {
        //code here
        int r=0,g=0;
        for(int i=0;i<N;i++){
            if(S.charAt(i) == 'R')
              r++;
            else
              g++;
        }
        if(r>g)
          return g;
        else
          return r;
    }
}
