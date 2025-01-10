class Solution {
    class Trie{
        Trie[] children ;
        ArrayList<String> wordSuggestion ;

        public Trie(){
            children = new Trie[26] ;
            wordSuggestion = new ArrayList<>() ;
        }
    }

    Trie root ;

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products) ;
        root = new Trie() ;
        buildTrie(products) ;

        List<List<String>> ans = new ArrayList<>() ;
        Trie current = root ;

        for(char c : searchWord.toCharArray()){

            if(current == null ){
                ans.add(new ArrayList<>()) ;
                continue ;
            }

            if(current.children[c - 'a'] == null){
                ans.add(new ArrayList<>()) ;
            }else{
                ans.add(current.children[c - 'a'].wordSuggestion) ;
            }

            current = current.children[c - 'a'] ;
        }
        return ans ;

    }


    public void buildTrie(String[] products){
        Trie current = root ;

        for(String product : products){
            for(char c : product.toCharArray()){
                if(current.children[c - 'a'] == null){
                    current.children[c - 'a'] = new Trie() ;
                }

                current = current.children[c - 'a'] ;

                if(current.wordSuggestion.size() < 3){
                    current.wordSuggestion.add(product) ;
                }
            }

            current = root ;
        }
    }
}
