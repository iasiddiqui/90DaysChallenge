//Given a number, reverse it and add it to itself unless it becomes a palindrome or number of iterations becomes more than 5.



class Solution {
    
    public static boolean check(String s) {
        int n = s.length();
        int first = 0;
        int last = n-1;
        
        while(first<=last) {
            char ch1 = s.charAt(first);
            char ch2 = s.charAt(last);
            
            if(ch1 == ch2) {
                first++;
                last--;
            } else {
                return false;
            }
        }
        
        return true;
    }
    
    static long isSumPalindrome(long n){
        String num = Long.toString(n);
        if(check(num)) {
            return n;
        } else {
            int i=1;
            while(i <= 5) {
                long copy_n = n;
                long rev = 0;
                while(copy_n != 0) {
                    long rem = copy_n % 10;
                    rev = (rev * 10) + rem;
                    copy_n /= 10;
                }
                
                long sum = rev + n;
                String number = Long.toString(sum);
                if(check(number)) {
                    return sum;
                }
                
                n = sum;
                i++;
            }
        }
        
        return (long)-1;
        
    }
}
