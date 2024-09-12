class Solution {
    public String mergeAlternately(String word1, String word2) {
        int longestWord = 1 ;
        String combinedWord = "" ;


        // Find the longest word
        if(word1.length() >= word2.length()){
            longestWord = word1.length();
        }else{
            longestWord = word2.length();
        }


        //Use the longest word to combine both words
        for(int i = 0 ; i < longestWord ; i++){
            if(i < word1.length()){
                combinedWord = combinedWord + word1.charAt(i)  ;
            }


            if(i < word2.length()){
                combinedWord =combinedWord + word2.charAt(i)  ;
            }
        }


        return combinedWord ;
    }
}
