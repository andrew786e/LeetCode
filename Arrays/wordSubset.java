class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {

        int[] freqOfSubString = new int[26] ;
        List<String> ans = new ArrayList<>() ;

        for(String word : words2){
            int[] currentFreq = new int[26];
            for(char letter : word.toCharArray()){
                currentFreq[letter - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                freqOfSubString[i] = Math.max(freqOfSubString[i], currentFreq[i]);
            }
        }

        for(String word : words1){
            int[] currentWord = new int[26] ;
            for(char letter : word.toCharArray()){
                currentWord[letter - 'a']++;
            }

            if(compareWords(currentWord , freqOfSubString)){
                ans.add(word) ;
            }
        }

        return ans ;
    }

    public boolean compareWords(int[] currentWord , int[] universal){
        for(int i = 0 ; i < 26 ; i++){
            if(currentWord[i] < universal[i]){
                return false ;
            }
        }

        return true ;
    }

}
