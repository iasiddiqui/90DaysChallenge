//Geek is very fond of patterns. Once, his teacher gave him a square pattern to solve. He gave Geek an integer n and asked him to build a pattern.


class Solution {
    void printSquare(int n) {
        // code here
        int i,j,k;
        for(i=1;i<2*n;i++){
            k=n;
            if(i<=n)
            {
                for(j=1;j<2*n;j++){
                    System.out.print(k+" ");
                    if(i>j)
                        k=k-1;
                    if((i+j)>=2*n)
                        k=k+1;
                }
            }
            if(i>n){
                for(j=1;j<2*n;j++){
                    System.out.print(k+" ");
                    if((i+j)<2*n)
                        k=k-1;
                    if(j>=i)
                        k=k+1;
                }
            }
            System.out.println();
        }
    }
}
