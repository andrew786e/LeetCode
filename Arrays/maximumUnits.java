class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // Task : Maximize the total number of units to be put on the truck
        // How to achieve task: Select boxes that can contain a larger first
        // Edge Cases: ??

        // Sort Array by numberOfUnits

        int total = 0 ;

        Arrays.sort(boxTypes , (a , b) -> Integer.compare(b[1] , a[1])) ;

        for(int i = 0 ; i < boxTypes.length ; i++){

            if(truckSize <= boxTypes[i][0]){
                total += truckSize * boxTypes[i][1] ;
                truckSize = 0 ;
                break ;
            }else{
                total += boxTypes[i][1]  * boxTypes[i][0] ;
                truckSize -= boxTypes[i][0]  ;
            }
        }

        return total ;
    }
}
