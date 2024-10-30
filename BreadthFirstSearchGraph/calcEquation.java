class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String , List<List<Object>>> adjacencyList = new HashMap<>() ;
        int count = 0 ; 

        // Quick way to create adjacencyList bidirectional graph
        for(List<String> equation : equations){

            // Create a List<Object> to store the node and value
            List<Object> edge1 = List.of(equation.get(1), values[count]);
            List<Object> edge2 = List.of(equation.get(0), 1 / values[count]);

            adjacencyList.computeIfAbsent(equation.get(0) , k -> new ArrayList<>()).add(edge1) ;
            adjacencyList.computeIfAbsent(equation.get(1) , k -> new ArrayList<>()).add(edge2) ;

            count++ ;
        }

        int position = 0 ;
        double[] ans = new double[queries.size()];

        for(List<String> query: queries){
            ans[position] = bfs(query.get(0) , query.get(1) , adjacencyList) ;
            position++ ;
        }

        return ans ;
    }

    public double bfs(String start , String end , HashMap<String ,List<List<Object>>> adjacencyList){
        if(!adjacencyList.containsKey(start) || !adjacencyList.containsKey(end)){
            return -1.0 ;
        }

        Queue<List<Object>> nodeQueue = new LinkedList<>() ;
        Set<String> visitedNodes  = new HashSet<>();

        nodeQueue.add(List.of(start , 1.0)) ;

        while(!nodeQueue.isEmpty()){
            List<Object> node = nodeQueue.poll() ;
            String nodeString = (String)node.get(0) ;
            Double nodeWeight = (double)node.get(1) ;

            if(adjacencyList.get(node.get(0)) != null){
                for(List<Object> neighbours : adjacencyList.get(node.get(0))){
                    String neighbourString = (String)neighbours.get(0) ;
                    Double neighbourWeight = (double)neighbours.get(1) ;
                    double ans = nodeWeight * neighbourWeight;

                    if(end.equals(neighbourString) ){
                        return ans ;
                    }

                    if(!visitedNodes.contains(neighbourString)){
                        visitedNodes.add(neighbourString) ;
                        nodeQueue.add(List.of(neighbourString , ans)) ;
                    }
                }
            }
        }

        return -1.0 ; 
    }
}
