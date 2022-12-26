//Akku likes binary numbers and she likes playing with these numbers. Her teacher once gave her a question.For given value of  L and R, Akku have to find the count of number X, which have only three-set bits in it's binary representation such that "L ≤ X ≤ R".Akku is genius, she solved the problem easily. Can you do it ??


class Solution{
    void precompute(){
    }
    long solve(long L, long R){
        long count = 0; 
        long temp = 0;
        for(int i = 0; i < 63; ++i){
            for(int j = i + 1; j < 63; ++j){
                for(int k = j + 1; k < 63; ++k){
                    temp = (long)(Math.pow(2, i) + Math.pow(2, j) + Math.pow(2, k));
                    if(temp >= L && temp <= R)
                        ++count;
                }
            }
        }
        return count;
    }
}
