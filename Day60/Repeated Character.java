//Given a string consisting of lowercase english alphabets. Find the repeated character present first in the string.

class Solution{
    char firstRep(String S)
    {
        // your code here
        char c = ' ';
        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            for(int j = i+1; j < S.length(); j++){
                if(ch == S.charAt(j)){
                    c= ch;
                    return c;
                }
            }
        }
        return '#';
    }
}
