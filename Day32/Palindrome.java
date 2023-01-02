//Given an integer, check whether it is a palindrome or not.

class Solution{
    public String is_palindrome(int n){
        // Code here
        String num = n + "";
        int j = num.length()-1;
        int i = 0; 
        while (i<j) {
            if (num.charAt(i) != num.charAt(j)) {
                return "No";
            }
            i++;
            j--;
        }
        return "Yes";
    }
}
