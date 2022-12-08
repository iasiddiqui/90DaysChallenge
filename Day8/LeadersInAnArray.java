class Solution{

    //Function to find the leaders in the array.

    static ArrayList<Integer> leaders(int arr[], int n){

        ArrayList<Integer> a=new ArrayList<>();

        a.add(arr[n-1]);

        int currled=arr[n-1];

        for(int i=n-2;i>=0;i--){

            if(currled<=arr[i]){

                currled=arr[i];

                a.add(currled);

            }

        }

        Collections.reverse(a);

        return a;

    }

}
