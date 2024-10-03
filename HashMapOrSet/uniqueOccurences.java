class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer> numOfOccurences = new HashMap<>() ;
        HashSet<Integer> occurences = new HashSet<>() ;
        
        for(int i = 0 ; i < arr.length ; i++){
            numOfOccurences.put(arr[i] , numOfOccurences.getOrDefault(arr[i] , 0) + 1) ;
        }


        for (Map.Entry<Integer, Integer> set :numOfOccurences.entrySet()) {
            // Printing all elements of a Map
            if(occurences.contains(set.getValue())){
                return false ;
            }else{
                occurences.add(set.getValue()) ;
            }
        }
        return true ;
    }
}
