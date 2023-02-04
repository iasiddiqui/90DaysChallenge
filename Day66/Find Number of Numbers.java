//Given an array A[]  of n elements. Your task is to complete the Function num which returns an integer denoting the total number of times digit k appears in the whole array.

class GfG{
    public static int num(int a[], int n, int k){
        String s=Arrays.toString(a);
        String value = String.valueOf(k);
        char c =value.charAt(0);
        int count=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==c){
                count++;
            }
         }
        return count;
    }
}
