class Solution {

    private int[][] colStateMemo ;

    private int MOD = 1000000007 ; 

    public int numTilings(int n) {
        // Each column has 4 posible states
        colStateMemo = new int[n][4] ;

        for (int[] row : colStateMemo) {
            Arrays.fill(row, -1); // Fill with -1 to indicate uncomputed cells
        }

        return dominoStateDfs(0 , true , true  , n) ;
    }

    public int dominoStateDfs(int i, boolean t1, boolean t2, int n) {
        if (i == n) {
            return (t1 && t2) ? 1 : 0;
        }

        if (i > n) {
            return 0;
        }

        // Find the current state
        int currentState = makeState(t1, t2);

        // If the result is already memoized, return it
        if (colStateMemo[i][currentState] != -1) {
            return colStateMemo[i][currentState];
        }

        // Initialize count
        int count = 0;

        // Tromino placements
        if (t1 && t2) {
            // L-shaped tromino (top)
            count = (count + dominoStateDfs(i + 1, false, true, n)) % MOD;
            // L-shaped tromino (bottom)
            count = (count + dominoStateDfs(i + 1, true, false, n)) % MOD;
        }
        if (t1 && !t2) {
            // Vertical tromino filling
            count = (count + dominoStateDfs(i + 1, false, false, n)) % MOD;
        }
        if (!t1 && t2) {
            // Vertical tromino filling
            count = (count + dominoStateDfs(i + 1, false, false, n)) % MOD;
        }

        // Domino placements
        if (t1 && t2) {
            // Vertical domino
            count = (count + dominoStateDfs(i + 1, true, true, n)) % MOD;
            // Horizontal domino
            count = (count + dominoStateDfs(i + 1, false, false, n)) % MOD;
        }
        if (t1 && !t2) {
            // Domino fills bottom row
            count = (count + dominoStateDfs(i + 1, false, true, n)) % MOD;
        }
        if (!t1 && t2) {
            // Domino fills top row
            count = (count + dominoStateDfs(i + 1, true, false, n)) % MOD;
        }
        if (!t1 && !t2) {
            // Both rows filled
            count = (count + dominoStateDfs(i + 1, true, true, n)) % MOD;
        }

        // Memoize and return
        colStateMemo[i][currentState] = count % MOD;
        return colStateMemo[i][currentState];
    }


    // Determine state fromn the 4 possible states of a column
    public int makeState(boolean t1 , boolean t2 ){
        int state = 0 ;

        if(t1){
            state |= 1 ;
        }

        if(t2){
            state |= 2 ;
        }

        return state ;
    }
}
