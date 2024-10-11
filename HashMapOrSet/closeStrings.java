class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character , Integer> firstWord = new HashMap<>() ;
        HashMap<Character , Integer> secondWord = new HashMap<>() ;

        HashMap<Integer , Integer> firstFrequency = new HashMap<>() ;
        HashMap<Integer , Integer> secondFrequency = new HashMap<>() ;

        for(char i : word1.toCharArray()){
            firstWord.put(i ,firstWord.getOrDefault(i , 0) + 1) ;
        }

        

        for(char i : word2.toCharArray()){
            secondWord.put(i ,secondWord.getOrDefault(i , 0) + 1) ;
        }

        if(!firstWord.keySet().equals(secondWord.keySet())){
            return false ;
        }

        for (Integer value : firstWord.values()) {
            firstFrequency.put(value , firstFrequency.getOrDefault(value , 0) + 1 ) ;
        }

        for (Integer value : secondWord.values()) {
            secondFrequency.put(value , secondFrequency.getOrDefault(value , 0) + 1 ) ;
        }

        return firstWord.equals(secondWord) || firstFrequency.equals(secondFrequency);
    }
}
