//Given a string S consisting only '0's and '1's,  find the last index of the '1' present in it.

class Solution {
    public int lastIndex( String s) {
        int id = -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                id = i;
            }
        }
        return id;
    }
}
