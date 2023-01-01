//Given a number N.Find if the digit sum(or sum of digits) of N is a Palindrome number or not.
//Note:A Palindrome number is a number which stays the same when reversed.Example- 121,131,7 etc.



class Solution {
    int isDigitSumPalindrome(int N) {
        int sum=0;int pal=0;
       while(N>0){
           int d=N%10;
           sum += d;
           N=N/10;
       }
       int num=sum;
        while(sum>0){
           int d=sum%10;
           pal=pal*10+d;
           sum=sum/10;
       }
       if(num==pal){
           return 1;
       }else{
           return 0;
       }
    }
}
