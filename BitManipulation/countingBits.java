class Solution {
    public int[] countBits(int n) {
        int[] binaryArr = new int[n + 1] ;

        for(int i = 0 ; i <= n ; i++){
            int binaryNum = convertIntToBinary(i) ;
            binaryArr[i] = binaryNum ;
        }

        return binaryArr ;
    }

// Mathematical approach
    public int convertIntToBinary(int n){
        int counter = 0 ;
        while(true){
            if(n < 2){
                counter += n ;
                break ;
            }

            counter += n % 2 ;
            n = n / 2 ;
        }

        return counter ;
    }
}
