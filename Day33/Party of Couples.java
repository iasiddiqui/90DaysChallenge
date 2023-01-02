//In a party of N people, each person is denoted by an integer. Couples are represented by the same number. Find out the only single person in the party of couples.


class Solution{
    static int findSingle(int N, int arr[]){
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
               if(arr[i]==arr[j]){
                count++;
               }
            }
            if(count ==1){
                return arr[i];
            }
        }
         return -1;
    }
}
