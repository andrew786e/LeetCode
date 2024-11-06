class Solution {
    Map<String , Integer > memo = new HashMap<>() ;

    public int minDistance(String word1, String word2) {
        return editDistance(0 , 0,word1 , word2) ;
    }

    public int editDistance(int position1, int position2, String word1 , String word2){
        // The number of words to be inserted if word1 is at its limit
        if(position1 == word1.length()){
            return word2.length() - position2 ; 
        }

        // The number of words to be deleted from word1
        if(position2 == word2.length()){
            return word1.length() - position1 ;
        }

        if(memo.containsKey(position1 + "," + position2 )){
            return memo.get(position1 + "," + position2 ) ;
        }

        if(word2.charAt(position2) == word1.charAt(position1)){
            int matchResult = editDistance(position1 + 1, position2 + 1, word1 , word2) ;
            memo.put(position1 + "," + position2 , matchResult ) ;
            return matchResult ; 
        }

        int deleteOp = editDistance(position1 + 1, position2, word1 , word2) + 1 ;
        int insertOp = editDistance(position1, position2 + 1, word1 , word2) + 1;
        int replaceOp = editDistance(position1 + 1 , position2 + 1, word1 , word2) + 1;
        int noOp = editDistance(position1 + 1 , position2, word1 , word2) ;

        int firstMin = Math.min(deleteOp , insertOp) ;
        int secondMin = Math.min(firstMin , replaceOp) ;
        int lastMin = Math.min(secondMin , noOp) ;


        memo.put(position1 + "," + position2, lastMin) ;


        return lastMin ;
    }
}
