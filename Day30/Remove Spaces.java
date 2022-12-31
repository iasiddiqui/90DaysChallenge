//Given a string, remove spaces from it. 

class Solution{
    String modify(String S){
        char ch[]=S.toCharArray();
        String str="";
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=' '){
                str += ch[i];
            }
        }
        return str;
    }
}
