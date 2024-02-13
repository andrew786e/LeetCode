import java.util.Stack;

public class polishNotation {
    class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> values = new Stack() ;
            int a ; 
            int b ;
            for(int i = 0 ; i < tokens.length ; i++){
                if(tokens[i].equals("+")){
                    a = values.pop() ;
                    b = values.pop() ;
                    values.push(a + b); 
                }else if (tokens[i].equals("*")){
                    a = values.pop() ;
                    b = values.pop() ;
                    values.push(a * b); 
                }else if (tokens[i].equals("-")){
                    a = values.pop() ;
                    b = values.pop() ;
                    values.push(b - a); 
                }else if (tokens[i].equals("/")){
                    a = values.pop() ;
                    b = values.pop() ;
                    int ans = (int) b / a ;
                    values.push(ans); 
                }else{
                    values.push(Integer.parseInt(tokens[i])) ;
                }
            }
            return values.peek() ;
        }
    }
}
