//You are given an integer N. Print numbers from 1 to N without the help of loops.

class Solution{
    static void printTillN(int N){
     if(N==1){
         System.out.print(N +" ");
         return;
     }
     printTillN(N-1);
     System.out.print(N+" ");
    }
}
