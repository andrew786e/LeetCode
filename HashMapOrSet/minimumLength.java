class Solution {
    public int minimumLength(String s) {

        HashMap<Character , Integer> charFrequency = new HashMap<>() ;
        int finalStringLength = 0 ;

        for(int i = 0 ; i < s.length() ; i++){
            charFrequency.put(s.charAt(i) , charFrequency.getOrDefault(s.charAt(i) , 0) + 1) ;
        }

        for(Integer frequency : charFrequency.values()){
            if(frequency % 2 == 0){
                finalStringLength += 2 ;
            }else{
                finalStringLength += 1 ;
            }
        }

        return finalStringLength ;
    }
}
