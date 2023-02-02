//Given a string str containing alphanumeric characters. The task is to calculate the sum of all the numbers present in the string.


class Solution{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str){
        // your code here
        long ans=0;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i))>='0'&&(str.charAt(i)<='9')){
                long num=0;
                while(i<str.length()&&str.charAt(i)>='0'&&str.charAt(i)<='9'){
                    num=num*10+((int)str.charAt(i)-'0');
                    i++;
                }
                ans+=num;
            }
        }
        return ans;
    }
}
