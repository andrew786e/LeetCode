class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int[][] edges = {{1,0} , {0,1} , {-1 , 0}, {0 , -1}} ;
        int mazeRow = maze.length  ;
        int mazeCol = maze[0].length ;

        Queue<int[]> searchNode = new LinkedList<>() ;
        Set<String> visitedNode = new HashSet<>();

        visitedNode.add(entrance[0] + "," + entrance[1]) ;

        searchNode.add(new int[]{entrance[0] , entrance[1] , 0}) ;

        while(!searchNode.isEmpty()){

            int[] currentNode = searchNode.poll() ;

            int currentX = currentNode[0] ;
            int currentY = currentNode[1];
            int currentStep = currentNode[2] ;

            if( (currentX == 0 || currentX == mazeRow - 1|| currentY== 0 || currentY == mazeCol -1) && !(currentX == entrance[0] && currentY== entrance[1])){
                return  currentStep;
            }

            for(int direction = 0 ; direction < edges.length ; direction++){
                int[] edge = edges[direction] ;
                int x = edge[0] + currentX;
                int y = edge[1] + currentY;
                int steps = 1 + currentStep ;

                if(x < 0 || x>= mazeRow || y < 0 || y >= mazeCol ){
                    continue ;
                }

                if(maze[x][y] == '+'){
                    continue ;
                }
                
                // Id of specific row and column
                if(!visitedNode.contains(x + "," + y)){
                    visitedNode.add(x + "," + y) ;
                    searchNode.add(new int[]{ x , y, steps}) ;
                }

            }
        }

        return -1 ;
    }
}
