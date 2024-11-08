class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // sorting the array by the start value for us to take a greedy approach
        Arrays.sort(intervals , (a,b) -> Integer.compare(a[0] , b[0])) ;

        // First end in the array
        int end = intervals[0][1];
        int remove = 0 ;

        for(int i = 0 ; i < intervals.length - 1 ; i++){
            // Condition for if they are overlapping
            if(end > intervals[i + 1][0]){
                remove += 1 ;
                // Chosing element to replace based on the end ;
                if(end > intervals[i + 1][1]){
                    end = intervals[i + 1][1] ;
                }
            }else{
                // If they dont overlap
                end = intervals[i + 1][1] ;
            }
        }

        // Time Complexity
        // O(n) - for loop + O(nlogn) - assuming fastest sorting algorithm
        return remove ;
    }
}
