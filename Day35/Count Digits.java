//Given a number N. Count the number of digits in N which evenly divides N.

//Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.
 
class Solution{
    static int evenlyDivides(int N){
        // code here
        int t=N;
        int count=0;
        while (N>0){
            int last = N%10;
            if(last !=0&&t%last==0)
                count++;
            N=N/10;
        }
    return count;
    }
}
