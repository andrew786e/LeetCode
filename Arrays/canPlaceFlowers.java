import java.util.Vector;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int remainingFlowers = n ;
        Vector<Integer> adjustedFlowerArray = new Vector<>() ;

       // Add a 0 at the start and end of the flowerbed to handle edge cases.
        adjustedFlowerArray.add(0);
        for (int flower : flowerbed) {
            adjustedFlowerArray.add(flower);
        }
        adjustedFlowerArray.add(0);

        int zeroCounter = 0 ;

        for(int i = 0 ; i < adjustedFlowerArray.size() ; i++){
            if(adjustedFlowerArray.get(i) == 1){
                zeroCounter = 0 ;
            }else{
                zeroCounter += 1 ;
                if(zeroCounter >= 3 && (zeroCounter % 2) != 0){
                    n = n - 1 ;
                }

            }

            if(n <= 0){
                return true ;
            }
        }

        return false ;
    }
}
