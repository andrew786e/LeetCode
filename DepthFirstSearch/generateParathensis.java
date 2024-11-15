class Solution {
    List<String> family = new ArrayList<>() ;

    public List<String> generateParenthesis(int n) {
        dfs("" , 0 , 0 , n) ;
        return family ;
    }

    // Function can be made faster using Stringbuilder instead 
    public void dfs(String currentP , int openP , int closedP , int n){
        if(openP > n || closedP > n){
            return ;
        }

        if(openP < closedP){
            return ;
        }


        if(openP == n && closedP == n){
            // Add to List
            family.add(currentP) ;
            return ;
        }

        // Adding Open String 
        dfs(currentP + "(" , openP + 1, closedP , n) ;

        // Adding Closed String
        dfs(currentP + ")" , openP , closedP + 1 , n) ;

        return ;
    }
}
