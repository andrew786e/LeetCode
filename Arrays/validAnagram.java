import java.util.HashMap;

// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
// typically using all the original letters exactly once.

public class validAnagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()){
                return false ;
            }

            HashMap<Character , Integer > letterCounter = new HashMap<>() ;

            for(int i = 0 ; i < s.length() ; i++){
                if(letterCounter.containsKey(s.charAt(i))){
                    letterCounter.put(s.charAt(i) , letterCounter.get(s.charAt(i)) + 1) ;
                }else{
                    letterCounter.put(s.charAt(i) , 1) ;
                }
            }

            for(int i = 0 ; i < s.length() ; i++){
                if(letterCounter.containsKey(t.charAt(i))){
                    letterCounter.put(t.charAt(i) , letterCounter.get(t.charAt(i)) - 1) ;
                    if(letterCounter.get(t.charAt(i)) < 0 ){
                        return false ;
                    }
                }else{
                    return false ;
                }
            }

            return true ;
        }
    }
}
