//You are given a string that represents the postfix form of a valid mathematical expression. Convert it to its prefix form.

class Solution {
    static String postToPre(String post_exp) {
         Stack<String> stck = new Stack<String>();
         for(int i = 0 ; i < post_exp.length() ; i++)
         {
             char ch = post_exp.charAt(i);
             if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
             {
                 String top = stck.pop();
                 
                 stck.push(ch+stck.pop()+top);
             }
             else
                stck.push(ch+"");
         }
        return stck.pop();
    }
}
