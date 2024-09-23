class Solution {
    public String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");
        String temp = words[0];

        for (int i = 0 , j = words.length -1 ; i < j ;) {
            temp = words[i] ;
            words[i] = words[j] ;
            words[j] = temp ;
            i++ ;
            j--;
        }

        String result = String.join(" ", words);

        return result ;

    }
}
