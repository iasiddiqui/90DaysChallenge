//Given a number N. Find the product of the number of setbits and the number itself.

class Solution{
    public:
    int bitMultiply(int N){
        int count = 0, n = N;
        while(n > 0){
            if(n%2)
                count++;
            n /= 2;
        }
        return (count*N);
    }
};
