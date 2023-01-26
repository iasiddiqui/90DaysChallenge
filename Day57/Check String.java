//Given a string, check if all its characters are the same or not.


class Sol{
    Boolean check (String s){
        // your code here   
        for(int i=0;i<s.length();i++){
            if(s.charAt(0)!=s.charAt(i)){
                return false;
            }
        } 
        return true;
    }
}
