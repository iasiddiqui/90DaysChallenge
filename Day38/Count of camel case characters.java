//Given a string. Count the number of Camel Case characters in it.

class Sol{
    int countCamelCase (String s){
        int n = s.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                count++;
            }
        }
        return count;
    }
}
