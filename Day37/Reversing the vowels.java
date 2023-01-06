//Given a string consisting of lowercase english alphabets, reverse only the vowels present in it and print the resulting string.

class Solution
{
    String modify (String s)
    {
        Deque<Character> stack = new ArrayDeque<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                stack.addFirst(c);
            }
        }
        
        StringBuilder str = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                str.append(stack.removeFirst());
                continue;
            }
            str.append(c);
        }
        
        return str.toString();
    }
}
