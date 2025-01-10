class StockSpanner {

    Stack<int[]> originalStack = new Stack<>() ;

    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int span = 1 ;

        while(!originalStack.isEmpty() && originalStack.peek()[0] <= price ){
            span += originalStack.pop()[1] ;
        }

        originalStack.push(new int[] {price , span}) ;        

        return span ;
    }
}
