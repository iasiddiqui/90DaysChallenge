//Given a number N. Your task is to check whether it is fascinating or not.
//Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3 ,and when both these products are concatenated with the original number, then it results in all digits from 1 to 9 present exactly once.

class Solution {
    boolean fascinating(long n) {
        String s=n+""+n*2+""+n*3;
        char a[]=s.toCharArray();
        Arrays.sort(a);
        String s1=new String(a);
        if(s1.equals("123456789")){
            return true;
        }
        else{
            return false;
        }
    }
}
