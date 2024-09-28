class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> set = new HashSet<Character>(); 
        int firstElemInSub = 0 ;
        int numOfVowels = 0;
        int ans = 0 ;
        set.add('a') ;
        set.add('e') ;
        set.add('i') ;
        set.add('o') ;
        set.add('u') ;
        for(int i = 0 ; i < s.length() ; i++){
            if(i + 1 > k){
                if(set.contains(s.charAt(firstElemInSub))){
                    numOfVowels -= 1 ;
                }

                if(set.contains(s.charAt(i))){
                    numOfVowels += 1;
                }


                firstElemInSub += 1 ;
            }else{
                if(set.contains(s.charAt(i))){
                    numOfVowels +=1 ;
                }
                
            }

            ans = Math.max(ans , numOfVowels) ;
        }

        return ans ;
    }
}
