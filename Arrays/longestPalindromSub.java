public class longestPalindromSub {
    class Solution {
        public int palLength = 0 ;
        public Integer currentLength = 0 ;
        public String palVal = "" ;
    
        public String longestPalindrome(String s) {
            int l = 0;
            int r = s.length();

            for(int i = 0 ; i < s.length() ; i++){
                l = i ;
                r = i ;
                checkPalindrome(l , r , s) ;

                l = i;
                r = i + 1;
                checkPalindrome(l , r , s) ;
            }

            return palVal ;
        }

        public void checkPalindrome(int l , int r , String s){
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                l-- ;
                r++ ;
            }

            currentLength = r - l + 1 ;

            if(currentLength >= palLength){
                palLength = currentLength ;
                palVal = s.substring(l + 1 , r) ;
            }
        }
    }
}
