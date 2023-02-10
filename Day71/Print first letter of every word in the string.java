//Given a string S, the task is to create a string with the first letter of every word in the string.

class Solution {
    String firstAlphabet(String S) {
        String str = "";
        str+=S.charAt(0);
        for(int i =0; i<S.length(); i++){
            if(S.charAt(i)==' '){
                str+=S.charAt(i+1);
            }
        }
      return str;
    }
};
