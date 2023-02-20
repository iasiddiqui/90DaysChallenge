//You are given a string that represents the prefix form of a valid mathematical expression. Convert it to its postfix form.


class Solution {
    static String preToPost(String str) {
        Stack<String>stack=new Stack<>();
        for (int i = str.length()-1; i>=0; i--) {
            char c=str.charAt(i);
            if((c>=97&&c<=122)||(c>=65&&c<=90))stack.push(c+"");
            else stack.push(stack.pop()+""+stack.pop()+c);}
        return stack.pop();
    }
}
