//Given a non-empty sequence of characters str, return true if sequence is Binary, else return false


class GfG{
    boolean isBinary(String str){
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]!='1' && ch[i]!='0'){
                return false;
            }
        }
        return true;
    }
}
