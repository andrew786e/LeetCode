class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        Arrays.sort(potions) ;

        int[] successPairs =  new int[spells.length]; ;

        for(int i = 0 ; i < spells.length ; i++){
            int smallestValueWorking = potions.length  ;
            int highestPotion = potions.length - 1;
            int lowestPotion = 0; 
            while(lowestPotion <= highestPotion){
                int middle = lowestPotion + (highestPotion - lowestPotion) / 2 ;

                long product = (long)spells[i] * potions[middle] ;

                if(product >= success){
                    highestPotion = middle - 1 ;
                    smallestValueWorking  = middle ;
                }else if(product < success){
                    lowestPotion = middle + 1 ;
                }
            }

            successPairs[i] = potions.length - smallestValueWorking ;
        }

        return successPairs ;
    }
}
