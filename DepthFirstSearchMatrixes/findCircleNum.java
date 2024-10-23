class Solution{
    int countProvinces = 0 ;
    HashSet<Integer> visitedSites = new HashSet<>() ;

    
    public int findCircleNum(int[][] isConnected) {

        for(int start = 0 ; start < isConnected.length ; start++){
            if(!visitedSites.contains(start)){
                countProvinces++ ;
                dfsNeighbours(isConnected , start) ;
            }
        }
        return countProvinces ;
    }

    public void dfsNeighbours(int[][] isConnected , int position){
        visitedSites.add(position) ;
        for(int neighbours = 0  ; neighbours < isConnected.length ; neighbours++){ 
            if(!visitedSites.contains(neighbours) && isConnected[position][neighbours] == 1){
                dfsNeighbours(isConnected , neighbours) ;
            }
        }
    }
}
