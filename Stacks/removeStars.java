class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>() ;

        for(int i = 0 ; i < s.length() ; i++){
            if(stack.empty()){
                stack.push(s.charAt(i)) ;
                continue ;
            }

            if(!stack.peek().equals('*') && s.charAt(i) == '*' ){
                stack.pop() ;
                continue ;
            }

            stack.push(s.charAt(i)) ; 
        }


        StringBuilder result = new StringBuilder();

        while(!stack.empty()){
            result.append(stack.pop()) ;
        }

        result.reverse() ;

        return result.toString() ;
    }
}
