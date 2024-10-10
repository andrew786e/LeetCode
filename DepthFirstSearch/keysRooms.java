class Solution {

    public Map<Integer , Boolean>  visited = new HashMap<>();

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        dfs(0 , rooms) ;
        
        // Iterate through the keys and print each one
        return visited.size() == rooms.size(); 
    }

    public void dfs(int currentRoom , List<List<Integer>> rooms){

        if(visited.getOrDefault(currentRoom , false)  != false){
            return ;
        }

        visited.put(currentRoom , true ) ; 

        for(int i : rooms.get(currentRoom)){
            dfs(i , rooms) ;
        }
    }
}
