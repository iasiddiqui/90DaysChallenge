//Given two strings S1 and S2 in lowercase, the task is to make them anagram. The only allowed operation is to remove a character from any string. Find the minimum number of characters to be deleted to make both the strings anagram. Two strings are called anagram of each other if one of them can be converted into another by rearranging its letters.

class GfG{
	public int remAnagrams(String s,String s1){
        //add code here.
        int[] temp=new int[26];
        for(int i=0; i<s.length(); i++){
            temp[(int)s.charAt(i)-97]+=1;
        }
        for(int i=0; i<s1.length(); i++){
            temp[(int)s1.charAt(i)-97]-=1;
        }
        int sum=0;
        for(int i=0; i<26; i++){
            sum+=Math.abs(temp[i]);
        }
        return sum;
    }
}
