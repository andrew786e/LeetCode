class Solution {
    public String decodeString(String s) {
        Stack<String> bracketTracker = new Stack<>() ;
        StringBuilder decodedString = new StringBuilder() ;
        StringBuilder updateString = new StringBuilder() ;
        StringBuilder numberMultiplier = new StringBuilder() ;

        for(int i = 0 ;  i < s.length() ; i++){
            String codeChar = String.valueOf(s.charAt(i)) ;
            if(codeChar.equals("]")){
                while(!bracketTracker.peek().equals("[")){
                    // updateString = bracketTracker.pop() + updateString ;
                    updateString.insert(0 , bracketTracker.pop()) ;
                }

                bracketTracker.pop() ;

                while(!bracketTracker.isEmpty() && bracketTracker.peek().matches("\\d+")){
                    // numberMultiplier = bracketTracker.pop() + numberMultiplier ;
                    numberMultiplier.insert(0  , bracketTracker.pop()) ;
                }

                int number = Integer.parseInt(numberMultiplier.toString()) ;


                String repeatedString = updateString.toString().repeat(number) ;
                
                bracketTracker.push(repeatedString) ;

                updateString.setLength(0) ;
                numberMultiplier.setLength(0) ;

            }else{
                bracketTracker.push(codeChar) ;
            }
        }


        while(!bracketTracker.isEmpty()){
            decodedString.insert(0 , bracketTracker.pop());
        }

        return decodedString.toString() ;
    }
}
