//A celebrity is a person who is known to all but does not know anyone at a party. If you go to a party of N people, find if there is a celebrity in the party or not.
//A square NxN matrix M[][] is used to represent people at the party such that if an element of row i and column j  is set to 1 it means ith person knows jth person. Here M[i][i] will always be 0.



class Solution{
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n){
     Stack<Integer> stack = new Stack<>();
     for(int i=0;i<n;i++){
         stack.push(i);
     }
     while((stack.size()>=2)){
         int person1 = stack.pop();
         int person2 = stack.pop();
         if(M[person1][person2] == 1){
             stack.push(person2);
         }
         else{
             stack.push(person1);
         }
     }
     int celeb = stack.pop();
     for(int person=0;person<n;person++){
         if( person != celeb){
             if(M[person][celeb] == 0 || M[celeb][person] ==1){
                 return -1;
             }
         }
     }
     return celeb;
    }
}
