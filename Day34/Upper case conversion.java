//Given a string str, convert the first letter of each word in the string to uppercase. 

class Solution
{
    public String transform(String s)
    {
    // code here
       s= s.trim();
       char[] ch = s.toCharArray();
       ch[0] = Character.toUpperCase(s.charAt(0));
       for(int i = 1; i < s.length()-1;i++){
           if(ch[i] == ' '){
               char c= ch[i+1];
               ch[i+1] = Character.toUpperCase(c);
           }
       }
       String str = String.valueOf(ch);
       return str;
    }
}
