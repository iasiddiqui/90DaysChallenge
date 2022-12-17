//You are given a binary string str. In a single operation, you can choose two indices L and R such that 1 ≤ L ≤ R ≤ N and complement the characters between L and R i.e strL, strL+1, , strR. By complement, we mean change character 0 to 1 and vice-versa.
//You task is to perform ATMOST one operation such that in final string number of 1s is maximised. If there is no need to completement, i.e., string contains all 1s, return -1. Else, return the two values denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.



// User function Template for Java

class Solve {

    Vector<Integer> findRange(String str, int n) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0, start = 0,
            end = 0, s = 0;
        boolean allOne = true;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '0') allOne = false;
        }
        Vector<Integer> ans = new Vector<Integer>();
        if (allOne) {
            ans.add(-1);
            return ans;
        }

        for (int i = 0; i < n; i++) {
            max_ending_here += (str.charAt(i) == '1' ? -1 : 1);

            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }

            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        ans.add(start + 1);
        ans.add(end + 1);
        return ans;
    }
}
