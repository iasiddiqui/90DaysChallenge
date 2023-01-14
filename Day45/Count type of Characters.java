//Given a string S, write a program to count the occurrence of Lowercase characters, Uppercase characters, Special characters and Numeric values in the string.
//Note: There are no white spaces in the string.


class Sol{
    int[] count (String s)
    {
        // your code here    
        int a[]=new int[4];
      for(int i=0;i<s.length();i++){
          if(Character.isUpperCase(s.charAt(i))){
              a[0]=a[0]+1;
          }else if(Character.isLowerCase(s.charAt(i))){
              a[1]=a[1]+1;
          }else if(Character.isDigit(s.charAt(i))){
              a[2]=a[2]+1;
          }else{
              a[3]=a[3]+1;
          }
      }
        return a;
    }
}
