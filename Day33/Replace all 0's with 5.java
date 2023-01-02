//Given a number N. The task is to complete the function convertFive() which replaces all zeros in the number with 5 and returns the number.


class Solution{
 public static int convertFive(int n){
     int i = n;
     int num = 0;
     int power = 0;
     while(i != 0){
         int rem = i % 10;
         if(rem == 0){
             rem = 5;
         }
         num = rem * (int)Math.pow(10, power) + num;
         i /= 10;
         power++;
     }
     return num;
    }
}
