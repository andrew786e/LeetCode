class SmallestInfiniteSet {

    private PriorityQueue<Integer> numQueue = new PriorityQueue<>() ;
    private HashSet<Integer> numSet = new HashSet<>() ;
    int smallestNumber = 1 ;

    public SmallestInfiniteSet() {
        
    }
    
    public int popSmallest() {
        if(numQueue.isEmpty()){
            return smallestNumber++ ;
        }else {
            int smallest = numQueue.poll();
            numSet.remove(smallest);
            return smallest;
        }

    }
    
    public void addBack(int num) {
        if(!numSet.contains(num) && num < smallestNumber ){
            numQueue.add(num) ;
            numSet.add(num) ;
        }
    }
}
