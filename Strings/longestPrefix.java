class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestSubstring = strs[0] ;
        int smallerString ;
        for(int i = 1 ; i < strs.length ; i++){
            String compareString = strs[i] ;
            if(compareString.length() > longestSubstring.length()){
                smallerString = longestSubstring.length() ;
            }else{
                smallerString = compareString.length() ;
            }
            String buildNewSubstring = "" ;
            for(int j= 0 ; j < smallerString ; j++){
                if(compareString.charAt(j) == longestSubstring.charAt(j)){
                    buildNewSubstring = buildNewSubstring + compareString.charAt(j) ;
                }else{
                    break ;
                }
            }
            longestSubstring = buildNewSubstring ;
        }

        return longestSubstring ;
    }

    public String longestCommonPrefixSecond(String[] strs) {
        String result = "" ;

        for(int i = 0 ; i < strs[0].length() ; i++){
            for(int j = 0 ; j < strs.length ; j++){
                if(i >= strs[j].length()  || strs[0].charAt(i) != strs[j].charAt(i)){
                    return result ;
                }
            }
            result = result + strs[0].charAt(i) ;
        }

        return result  ;
    }
}
