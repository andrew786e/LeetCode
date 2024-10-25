class Solution {
    int count = 0 ;

    public int minReorder(int n, int[][] connections) {
        Set<Pair<Integer , Integer>> edges  = Arrays.stream(connections)
                                            .map(connection -> new Pair<>(connection[0], connection[1]))
                                            .collect(Collectors.toSet()) ;

        HashMap<Integer , ArrayList<Integer>> citiesRoads = new HashMap<>() ;

        Set<Integer> visitedCities = new HashSet<>() ;

        for(int[] connection : connections){
            citiesRoads.putIfAbsent(connection[0], new ArrayList<>());
            citiesRoads.putIfAbsent(connection[1], new ArrayList<>());

            citiesRoads.get(connection[0]).add(connection[1]) ;
            citiesRoads.get(connection[1]).add(connection[0]) ;
        }


        dfs(edges , citiesRoads , 0 , visitedCities ) ;

        return count ;
    }


    public void dfs(Set<Pair<Integer , Integer>> edges , HashMap<Integer , ArrayList<Integer>> citiesRoads, int city , Set<Integer> visitedCities ){
        visitedCities.add(city) ;

        for (Integer neighbor : citiesRoads.get(city)) {
            if (!visitedCities.contains(neighbor)) {
                // Check if the direction needs to be reordered
                if (!edges.contains(new Pair<>(neighbor, city))) {
                    count++;
                }
                dfs(edges, citiesRoads, neighbor, visitedCities);
            }
        }
    }
}
