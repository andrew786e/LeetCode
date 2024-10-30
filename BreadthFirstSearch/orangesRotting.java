class Solution {
    public int orangesRotting(int[][] grid) {
        int[][] directions= {{1, 0} , {0, 1} , {-1, 0} , {0 , -1}} ;
        int rowSize = grid.length;
        int colSize = grid[0].length ;
        boolean madeOrangeBad = false ;
        int freshCount = 0 ;

        Queue<int[]> badOranges = new LinkedList<>() ;
        Set<String> gridIdentifier = new HashSet<>() ;
        int minute = 0 ;
        boolean goodOrangePresent = false ;

        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                if(grid[i][j] == 2){
                    badOranges.add(new int[]{i , j}) ;
                }

                if(grid[i][j] == 1){
                    freshCount++ ;
                }
            }
        }

        if(freshCount == 0){
            return 0 ;
        }

        if(badOranges.isEmpty()){
            return -1 ;
        }

        while(!badOranges.isEmpty()){
            int currentNumBadOranges = badOranges.size() ;

            for(int i = 0 ; i < currentNumBadOranges ; i++){
                int[] badOrangePoint = badOranges.poll() ;
                int x = badOrangePoint[0] ;
                int y = badOrangePoint[1] ;

                for(int[] direction : directions){
                    int new_x = direction[0] + x ;
                    int new_y = direction[1] + y ;

                    if((new_x < 0 || new_y < 0 || new_x >= rowSize || new_y >= colSize)){
                        continue ;
                    }

                    if(grid[new_x][new_y] == 1){
                        madeOrangeBad = true ;
                        freshCount-- ;
                        grid[new_x][new_y] = 2 ;
                        badOranges.add(new int[]{new_x , new_y}) ;
                    }

                }


            }

            if(madeOrangeBad){
                minute++ ;
            }

            madeOrangeBad = false ;

        }

        int minutes = freshCount > 0 ? -1 : minute ;

        return minutes ;
    }
}
