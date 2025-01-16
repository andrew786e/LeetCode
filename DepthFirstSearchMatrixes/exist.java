class Solution {
    public boolean exist(char[][] board, String word) {

        // Check for the starting point of the dfs ;
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j] == word.charAt(0) && dfs(i, j , word , 0, board)){
                    return true ;
                }
            }
        }


        return false ;
    }

    // For the dfs we can eithere go up down left or right 
    public boolean dfs(int row , int column , String word , int currentPosition , char[][] board){

        if(row == board.length || row < 0 ){
            return false ;
        }

        if(column == board[0].length || column < 0){
            return false ;
        }


        if(currentPosition == word.length() -1 && board[row][column] == word.charAt(currentPosition)){
            return true ;
        }

        if(board[row][column] != word.charAt(currentPosition)){
            return false ;
        }

        // Prevent repetition of cell
        char temp = board[row][column];
        board[row][column] = '#';

        boolean up = dfs(row + 1 , column ,  word , currentPosition + 1 , board) ;
        boolean down = dfs(row - 1 , column ,  word , currentPosition + 1 , board) ;
        boolean right = dfs(row , column + 1,  word , currentPosition + 1 , board) ;
        boolean left = dfs(row , column - 1,   word , currentPosition + 1 , board) ;

        // Restore value after visitiing

        board[row][column] = temp;

        return up || down || right || left ;
    }
}
