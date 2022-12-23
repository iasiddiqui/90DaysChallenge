//Given a String S consisting only lowercase alphabets and an integer K. Find the count of all substrings of length K which have exactly K-1 distinct characters.

class Solution {

    static int countOfSubstrings(String S, int K) {
        // code here
        int ans=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<K;i++){
            char c=S.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        if(map.size()==(K-1))
            ans++;
        for(int i=K;i<S.length();i++){
            char c=S.charAt(i);
            char d=S.charAt(i-K);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
            if(map.get(d)==1){
                map.remove(d);
            }else{
                map.put(d,map.get(d)-1);
            }
            if(map.size()==(K-1)){
                ans++;
            }
        }
        return ans;
    }
};
