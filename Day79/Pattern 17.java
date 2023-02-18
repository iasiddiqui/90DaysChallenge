//Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Geek an integer n and asked him to build a pattern.


class Solution {

    void printTriangle(int n) {
        // code here
         for(int i=0; i<=n-1; i++) {
            for (int j=n-1; j>i; j--) {
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++)
            {
                System.out.print((char)('A' + k));
            }
            for(int l=i-1; l>=0; l--){
                System.out.print((char)('A' + l));
            }
            System.out.println();
        }
    }
}
