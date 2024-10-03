class RecentCounter {
    private int counter ;
    private Queue<Integer> pingHolder = new LinkedList<>();

    public RecentCounter() {
        this.counter = 0 ;
    }
    
    public int ping(int t) {
        pingHolder.add(t) ;
        int pastSeconds = t - 3000 ;

        if(pastSeconds < 0){
            return pingHolder.size() ;
        }
        Iterator<Integer> queueIterator = pingHolder.iterator();
      
        // Iterating Queue
        while (queueIterator.hasNext()) {
            int ping = queueIterator.next();

            if(ping < pastSeconds){
                counter++ ;
            }else{
                break ;
            }
        }
        int ans = this.counter ;
        this.counter = 0 ;

        return pingHolder.size() - ans ;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
