//Given a string, remove the vowels from the string.

class Solution {
    String removeVowels(String S) {
        String s1=S.replaceAll("[aeiou]","");
        return s1;
    }
}
