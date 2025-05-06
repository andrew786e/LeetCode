//  Task: Find the longest substring(contigious) without repeating characters
//  Action: use a sliding window to solve if repeating characters occur then a new
//          window is started 

class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> seenLetters = new HashSet<>() ;
        int maxLength = 0 ;
        int left = 0 ;
        int right = 0 ;

        while(right < s.length()){

            while(seenLetters.contains(s.charAt(right))){
                seenLetters.remove(s.charAt(left)) ;
                left++ ;                
            }

            seenLetters.add(s.charAt(right)) ;
            right++ ;

            maxLength = Math.max(maxLength , right - left) ;
        }

        return maxLength ;
    }
}
