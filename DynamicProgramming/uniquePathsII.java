class Solution {

    private int rowLen ;
    private int colLen ;
    private int[][] grid ;
    private int[][] storePaths ;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        rowLen = obstacleGrid.length ;
        colLen = obstacleGrid[0].length ;
        grid = obstacleGrid ;
        storePaths = new int[rowLen][colLen] ;
        return dfs(0,0) ;
    }
    
    public int dfs(int row , int col){

        if(row > rowLen - 1 || col > colLen - 1){
            return 0 ;
        }

        if(grid[row][col] == 1){
            storePaths[row][col] = -1 ;
            return 0 ;
        }

        if(row == rowLen - 1 && col == colLen - 1){
            return 1 ;
        }

        if(storePaths[row][col] > 0){
            return storePaths[row][col] ;
        }else if(storePaths[row][col] < 0){
            return 0 ;
        }

        int paths = dfs(row + 1 , col) + dfs(row , col + 1) ;
        storePaths[row][col] = paths ;

        return paths ;
    }
}
