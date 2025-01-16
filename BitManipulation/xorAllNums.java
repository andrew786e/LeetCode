class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {

        int xor1 = 0 ;
        int xor2 = 0 ;


        for(int i = 0 ; i < nums1.length ; i++){
            xor1 ^= nums1[i] ;
        }

        for(int i = 0 ; i < nums2.length ; i++){
            xor2 ^= nums2[i] ;
        }

        int ans = 0 ;

        // Used property of XOR to make faster
        //  a ^ a = 0 
        //  a ^ 0 = a
        // a ^ a ^ a = a 
        //  a ^ (b ^ c) = (b ^ a ) ^ c

        // Therefore if a number is XOR odd number of times the number itself is returned but if it is even the ans is zero  
        if(nums1.length % 2 == 1){
            ans ^= xor2 ;
        }

        if(nums2.length % 2 == 1){
            ans ^= xor1 ;
        }

        return ans ;
    }
}
