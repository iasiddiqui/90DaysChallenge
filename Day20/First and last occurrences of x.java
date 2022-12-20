//Given a sorted array arr containing n elements with possibly duplicate elements, the task is to find indexes of first and last occurrences of an element x in the given array.

class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)

    {

        // code here

        ArrayList a=new ArrayList();

        for(int i=0;i<=n-1;i++){

            if(arr[i]==x){

                a.add(i);

                break;

            }

        }

        for(int j=n-1;j>=0;j--){

            if(arr[j]==x){

                a.add(j);

                break;

            }

        }

        if(a.size()==0){

            a.add(-1);

            a.add(-1);

        }

        return a;

    }
}
