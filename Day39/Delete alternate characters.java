//Given a string S as input. Delete the characters at odd indices of the string.

class Solution {
    static String delAlternate(String S) {
        String x="";
        for (int i =0; i< S.length();i++){
            if(i%2==0){
             x+=S.charAt(i);
            }
             else{
                continue; 
                }
             }
            return x;
       }
}
