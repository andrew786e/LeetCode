class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0 ; 
        int i = 0 ;


        while(j < t.length() && i < s.length()){
            if(t.charAt(j) == s.charAt(i)){
                i++ ;
            }

            j++ ;
        }

        return (i == (s.length())) ;
    }
}
