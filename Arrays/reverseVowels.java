class Solution {
    public String reverseVowels(String s) {

        char vowel_i ;
        char vowel_j ;

        // Strings are immutable in java
        char[] charArray = s.toCharArray();


        for(int i = 0 , j = s.length() - 1 ; i < j ; ){
            vowel_i = Character.toLowerCase(s.charAt(i)) ;
            vowel_j = Character.toLowerCase(s.charAt(j)) ;

            // Always checking for vowels
            boolean i_isVowel = vowel_i == 'a' || vowel_i == 'e' || vowel_i == 'i' || vowel_i == 'o' || vowel_i == 'u' ;
            boolean j_isVowel = vowel_j == 'a' || vowel_j == 'e' || vowel_j == 'i' || vowel_j == 'o' || vowel_j == 'u' ;

            if(i_isVowel && j_isVowel){
                char temp = s.charAt(i) ;
                charArray[i] = charArray[j] ;
                charArray[j] = temp ;
                i++ ;
                j-- ;
            }else if(!i_isVowel && j_isVowel){
                i++ ;
            }else if(i_isVowel && !j_isVowel){
                j-- ;
            }else{
                i++ ;
                j--;
            }
        }

        String vowelStr = new String(charArray);

        return vowelStr ;
    }
}
