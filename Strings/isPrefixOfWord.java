class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {

        // Learnt for the day
        // Use of regex and startsWith method for strings
        String[] words = sentence.split("\\s+") ;
        for(int i = 0 ; i < words.length ; i++){
            if(words[i].startsWith(searchWord)){
                return i + 1 ;
            }
        }

        return -1 ;
    }
}
