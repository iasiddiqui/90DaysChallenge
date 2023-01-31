//Given a string S and two integers L and R. Print the characters in the range L to R of the string.
//NOTE: Assume zero based indexing

class Solution {
    static String javaSub(String S, int L, int R) {
        // code here
        String res="";
        char c;
        for(int i=L;i<=R;i++){
            c=S.charAt(i);
            res+=c;
        }
        return res;
    }
}
