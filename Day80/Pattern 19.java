//Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Geek an integer n and asked him to build a pattern.

class Solution {
    void printTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int k=0;k<2*i;k++){
                System.out.print(" ");
            }
            for(int l=0;l<n-i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int k=0;k<2*(n-1)-2*i;k++){
                System.out.print(" ");
            }
            for(int l=0;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
