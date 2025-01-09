class Trie {
    Trie[] children ;
    boolean endOfWord ;

    
    public Trie() {
        children = new Trie[26] ;
        endOfWord = false ;
    }
    
    public void insert(String word) {
        Trie current = this ;

        for(char c : word.toCharArray()){

            if(current.children[c - 'a'] == null){
                current.children[c - 'a'] = new Trie() ;
            }

            current = current.children[c - 'a'] ;
        }

        current.endOfWord = true ;

    }
    
    public boolean search(String word) {
        int count = 0 ;
        Trie current = this ;

        for(char c : word.toCharArray()){
            if(current.children[c - 'a'] != null){
                current = current.children[c - 'a'] ;
            }else{
                return false ;
            }

        }

        return current.endOfWord  ;
    }
    
    public boolean startsWith(String prefix) {
        int count = 0 ;
        Trie current = this ;

        for(char c : prefix.toCharArray()){
            if(current.children[c - 'a'] != null){
                count++ ;
                current = current.children[c - 'a'] ;
            }else{
                return false ;
            }

        }

        if(count == prefix.length()){
            return true ;
        }

        return !current.endOfWord ;
    }
}
