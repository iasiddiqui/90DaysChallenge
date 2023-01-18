//For a given number N check if it is prime or not. A prime number is a number which is only divisible by 1 and itself.

class Solution{
    static int isPrime(int n){
        // code here
        int count =0;
        if(n==1) return 0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0) return 1;
        else return 0;
    }
}
