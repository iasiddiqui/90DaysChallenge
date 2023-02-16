/*Geek is learning about functions and calling a function with arguments. He learns that passing can take one of two forms: pass by value or pass by reference.

Geek wishes to add 1 and 2, respectively, to the parameter passed by value and reference. Help Geek in fulfilling his goal.*/

class Solution {
    static int[] passedBy(int a, int b) {
       int[] arr = new int[2];
       arr[0] = a+1;
       arr[1] = b+2;
       return arr;
    }
}
