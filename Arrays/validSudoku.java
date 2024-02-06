import java.util.HashSet;

// Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

// Each row must contain the digits 1-9 without repetition.
// Each column must contain the digits 1-9 without repetition.
// Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
// Note:

// A Sudoku board (partially filled) could be valid but is not necessarily solvable.
// Only the filled cells need to be validated according to the mentioned rules.

public class validSudoku {
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            // Found in sudoku board
            HashSet<String> val_found = new HashSet<>() ;
            for(int i = 0; i < board.length ; i++){
                for(int j = 0 ; j < board.length; j++){
                    char board_val = board[i][j] ;
                    if(board_val == '.'){
                        continue ;
                    }
                    if(!val_found.add(board_val + "found in row " + i)||
                       !val_found.add(board_val + "found in column " + j)||
                       !val_found.add(board_val + "found in box " + i/3 + j/3)){
                           return false ;
                       }
                }
            }

            return true ;
        }
    }
}
