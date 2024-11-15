class Solution {
    public int compress(char[] chars) {
        // I am using a comparator and counting the number of occurrences 
        char comparator = chars[0] ;
        int occurrences = 0 ;
        int position = 0 ;
        char prevChar ;
        String occurWord ;

        // The for loop does not consider the last character
        for(int i = 0 ; i < chars.length ; i++){
            if(comparator == chars[i] ){
                occurrences++ ;
                continue ;
            }else{
                prevChar = chars[i - 1] ;
                comparator = chars[i] ;
                i-- ;
            }

            occurWord = Integer.toString(occurrences) ;

            chars[position] = prevChar ;
            position++ ;

            if(occurrences > 1){
                for(int j = 0 ; j < occurWord.length() ; j++){
                    chars[position] = occurWord.charAt(j) ;
                    position++ ;
                }
            }
            occurrences = 0 ;
        }

        // Handle the edge case of the last character
        occurWord = Integer.toString(occurrences) ;
        chars[position] = chars[chars.length - 1] ;
        position++ ;

        if(occurrences > 1){
            for(int j = 0 ; j < occurWord.length() ; j++){
                chars[position] = occurWord.charAt(j) ;
                position++ ;
            }
        }

        return position ;
    }
}
