class Solution {
    public boolean doesValidArrayExist(int[] derived) {

        int N = derived.length ;
        int[] startZero = new int[N] ;
        int[] startOne = new int[N] ;
        startOne[0] = 1 ; 

        // For this question you need to understand XOR property
        // a ^ b = c  then b ^ c = a 
        // Therefore an assumption just needs to be made of the first attribute in the original array and it can be built from there 
        for(int i = 0 ; i < N - 1 ; i++){
            startZero[(i + 1)] = startZero[i] ^ derived[i] ;
            startOne[(i + 1)] = startOne[i] ^ derived[i] ;
        }

        if((startOne[0] ^ startOne[N - 1]) == derived[N - 1] || (startZero[0] ^ startZero[N - 1]) == derived[N - 1]){
            return true ;
        }

        return false ;
    }
}
