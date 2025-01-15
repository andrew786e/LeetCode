class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] c = new int[A.length] ;

        HashSet<Integer> AHashSet = new HashSet<>() ;
        HashSet<Integer> BHashSet = new HashSet<>() ;
        int count = 0 ;

        for(int i = 0 ; i < A.length ; i++){
            if(A[i] == B[i]){
                count++ ;
            }else{
                if(AHashSet.contains(B[i])){
                    count++ ;
                }

                if(BHashSet.contains(A[i])){
                    count++ ;
                }
            }

            c[i] = count ;
            AHashSet.add(A[i]) ;
            BHashSet.add(B[i]) ;
        }

        return c ;
    }
}
