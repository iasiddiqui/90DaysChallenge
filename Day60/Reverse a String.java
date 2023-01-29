//You are given a string s. You need to reverse the string.


class Reverse{
    public static String reverseWord(String str)
    {
        String st="";
        for(int i =str.length()-1;i>=0;i--)
         st+=str.charAt(i);
      return st;
    }
}
