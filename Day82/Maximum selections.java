/*Geek wants to select the maximum number of course bundles at the Geek Summer Carnival. 

You are given a finite number of courses and N range of numbers each depicting a bundle of courses. Select the maximum number of bundles such that no courses overlap in any of the bundle.

Note: The ending of a range being the same as start of another isn't considered as an overlap.

*/


class solver
{
    static int max_non_overlapping(int ranges[][], int n){
        Arrays.sort(ranges,(a,b) -> a[1] - b[1] == 0 ? b[0] - a[0] : a[1] - b[1]);
        int count = 1;
        int last =  ranges[0][1];
        for(int i = 1 ; i < n ; i++){
            if(last <= ranges[i][0]) {
                count++;
                last = ranges[i][1];
            }
        }
        return count;
    }
}
