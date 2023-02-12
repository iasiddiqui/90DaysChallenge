//Given three integers  'A' denoting the first term of an arithmetic sequence , 'C' denoting the common difference of an arithmetic sequence and an integer 'B'. you need to tell whether 'B' exists in the arithmetic sequence or not. Return 1 if B is present in the sequence. Otherwise, returns 0.

class Solution{
    static int inSequence(int A, int B, int C){
        // code here
        int d = (B - A);
        if(d == 0)
            return 1;
        if(d < 0){
            if(C >= 0)
                return 0;
            if(d%C == 0)
                return 1;
            return 0;
        }
        else{
            if(C <= 0)
                return 0;
            if(d%C == 0)
                return 1;
            return 0;
        }
    }
}
