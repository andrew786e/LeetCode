class Solution {
    public int equalPairs(int[][] grid) {
        StringBuilder makeString = new StringBuilder() ;
        Map<String, Integer> word = new HashMap<>() ;
        int matches = 0 ;

        for(int i =  0 ; i < grid.length ; i++){
            for(int j = 0 ; j <  grid[0].length ; j++){
                makeString.append(grid[i][j]) ;
                makeString.append(",") ;
            }
            String combinedWord = makeString.toString() ;
            word.put(combinedWord , word.getOrDefault(combinedWord , 0) + 1) ;

            makeString.setLength(0) ; 
        }

        for(int i =  0 ; i < grid[0].length ; i++){
            for(int j = 0 ; j <  grid.length ; j++){
                makeString.append(grid[j][i]) ;
                makeString.append(",") ;
            }
            String combinedWord = makeString.toString() ;

            if(word.containsKey(combinedWord)){
                matches += word.get(combinedWord) ;
            }   

            makeString.setLength(0) ; 
        }        

        return matches ;
    }
}
