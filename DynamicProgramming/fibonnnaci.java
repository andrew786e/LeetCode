
class Solution {
  // Recursive Solution
    public int fib(int n) {
        if(n == 0){
            return 0 ;
        }

        if(n == 1){
            return 1 ;
        }  

        return fib(n -1) + fib(n - 2) ;      
    }

  // Bottom up solution
  public int fib2(int n) {
        int prev = 1 ;
        int prevPrev = 0 ;
        int ans = 0;

        if(n == 0){
            return 0 ;
        }

        if(n == 1 ){
            return 1 ;
        }

        for(int i = 0 ; i <= n - 2 ; i++){
            ans = prev + prevPrev ;
            prevPrev = prev ;
            prev = ans ;
        }

        return ans ;  
    }
}
