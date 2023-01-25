//Given two numbers A and B. The task is to find out their LCM and GCD.


class Solution {
    static Long[] lcmAndGcd(Long a, Long b) {
        // code here
        Long on1 = a;
        Long on2 = b;
        while(a%b != 0){
            Long rem = a%b;
            a=b;
            b=rem;
        }
        Long gcd = b;
        Long lcm = (on1*on2)/gcd;
        Long[] arr = new Long[2];
        arr[0]=lcm;
        arr[1]=gcd;
        return arr;
    }
};
