class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false ;
        }

        String numString= Integer.toString(x);

        for(int i = 0 , j = numString.length() - 1 ; i < j ; i++ , j-- ){
            if( numString.charAt(i) != numString.charAt(j) ){
                return false ;
            }
        }

        return true ;
    }
}
