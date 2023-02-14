//Geek is very fond of patterns. Once, his teacher gave him a  pattern to solve. He gave Ram an integer n and asked him to build a pattern.



class Solution {
    void printTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j=n;j<=(n-1)*2;j++){
                if(j-i<=n-1){
                    System.out.print("*");
                }              
            }
            System.out.println();
        }
    }
}
