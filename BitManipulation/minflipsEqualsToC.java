class Solution {
    public int minFlips(int a, int b, int c) {
        int flipBits = 0 ; 

        while(a > 0 || b > 0 || c > 0){
            int bitwise_a = a & 1 ;
            int bitwise_b = b & 1 ;
            int bitwise_c = c & 1 ;

            if(bitwise_c == 0){
                flipBits += bitwise_a + bitwise_b ;
            }else{
                if(bitwise_a == 0 && bitwise_b == 0){
                    flipBits += 1 ;
                }
            }

            a = a >> 1 ;
            b = b >> 1 ;
            c = c >> 1 ;
            
        }

        return flipBits ;
    }
}
