class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int currentMax = candies[0] ;
        List<Boolean> answer = new ArrayList<>() ;

        for(int i = 1 ; i < candies.length ; i++){
            if(candies[i] > currentMax){
                currentMax = candies[i] ;
            }
        }

        for(int i = 0 ; i < candies.length ; i++){
            if((candies[i] + extraCandies) >= currentMax){
                answer.add(true) ;
            }else{
                answer.add(false) ;
            }
        }    

        return answer ;
    }
}
