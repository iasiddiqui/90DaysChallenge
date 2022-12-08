

class Compute {

    public void rotate(int arr[], int n){

        int last = arr[arr.length-1];

        for(int i=0;i<arr.length;i++){

            int temp = arr[i];

            arr[i] = last;

            last = temp;

        }

    }

}
