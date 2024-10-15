class Solution {
    public List<String> numberRepresent = new ArrayList<>(Arrays.asList("abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz")) ;


    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<>() ;
        }

        List<String> combinations = generateCombinations(digits) ;
        return combinations ;
    }

    private List<String> generateCombinations(String digits) {
        if(digits.length() == 0){
            List<String> result = new ArrayList<>(Arrays.asList("")) ;
            return result ;
        }

        List<String> combinations = generateCombinations(digits.substring(1)) ;
        List<String> result = new ArrayList<>() ;

        int digit =  Character.getNumericValue(digits.charAt(0)) ;
        String digitString  = numberRepresent.get(digit - 2) ;
         
        for(int i = 0 ; i < combinations.size() ; i++){
            for(int j = 0 ; j < digitString.length() ; j++){
                String copy = digitString.charAt(j) + combinations.get(i) ;
                result.add(copy) ;
            }
        }

        return result ;
    }
}
