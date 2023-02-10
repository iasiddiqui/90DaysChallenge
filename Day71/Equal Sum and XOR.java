//Given a positive integer N, Your task is to complete the function countValues which returns an integer denoting the count of all positive integers i such that
//0 <= i <= n and n+i = n^i where ^ denotes a XOR operation.

class GfG{
	int countValues (int n){
    //Your code here 
        int cnt=0;
        for(int i=0;i<=n;i++){
            if((n+i)==(n^i)){
                cnt++;
            }
            else{
                continue;
            }
        }
        return cnt;
    }
}
