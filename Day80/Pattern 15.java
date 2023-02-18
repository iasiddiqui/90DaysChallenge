//Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Geek an integer n and asked him to build a pattern.

class Solution {
    void printTriangle(int n) {
        String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String ans=s.substring(0,n);
        for(int i=0;i<n;i++){
            System.out.print(ans);
            ans=ans.substring(0,ans.length()-1);
            System.out.println();
        }
    }
}
