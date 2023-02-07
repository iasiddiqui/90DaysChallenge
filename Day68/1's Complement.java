//Given an N bit binary number, find the 1's complement of the number. The ones' complement of a binary number is defined as the value obtained by inverting all the bits in the binary representation of the number (swapping 0s for 1s and vice versa).

class Solution{
    static String onesComplement(String S,int N){
       //code here
       String str="";
       for(int i=0; i<N; i++){
           if(S.charAt(i)=='0'){
               str=str+'1';
           }else{
               str=str+'0';
           }
       }
       return str;
    }
}
