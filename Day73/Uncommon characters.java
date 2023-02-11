//Given two strings A and B. Find the characters that are not common in the two strings. 

class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
        if(A.equals(B))
            return "-1";
        String uncommon="";
        for(int i=0;i<A.length();i++){
            String ch = A.charAt(i)+"";
            if(!B.contains(ch) && !uncommon.contains(ch)){
                uncommon = uncommon +ch;
            }
        }
        
         for(int i=0;i<B.length();i++){
            String ch = B.charAt(i)+"";
            if(!A.contains(ch) && !uncommon.contains(ch)){
                uncommon = uncommon +ch;
            }
        }
        
        if(uncommon.equals(""))
            return "-1";
        
        char []arr = uncommon.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
        
    }
}
