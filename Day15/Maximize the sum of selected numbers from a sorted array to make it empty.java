//Given a array of N numbers, we need to maximize the sum of selected numbers. At each step, you need to select a number Ai, delete one occurrence of Ai-1 (if exists), and Ai each from the array. Repeat these steps until the array gets empty. The problem is to maximize the sum of the selected numbers.



//User function Template for Java



class Complete{
    // Function for finding maximum and value pair
    public static int maximizeSum (int arr[], int n) {
        //Complete the function
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        boolean check[]=new boolean[n];
        for (int i = 0; i < n; i++)
        	hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        
        for(int i=n-1;i>=0;i--)
        {
            if(!check[i])
            {
                check[i]=true;
                sum+= arr[i];
                if(hm.getOrDefault(arr[i]-1,0) > 0)
                {
                    check[i-hm.get(arr[i])]=true;
                    hm.put(arr[i]-1,hm.get(arr[i]-1)-1);
                }
            }
        }
        return sum;
    }
}
