class Solution {
    public List<List<Integer>> answers = new ArrayList<>() ;

    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<Integer> emptyArr = new ArrayList<>() ;
        if(n > 9){
            dfs(0 , k , n ,emptyArr ,  9) ;
        }else{
            dfs(0 , k , n ,emptyArr ,  n) ;
        }
        return answers ;
    }

    public void dfs(int sum , int k , int n , List<Integer> currentArr , int currentPosition){
        if(sum > n){
            return ;
        }

        if(currentArr.size() > k){
            return ;
        }

        if(sum == n && currentArr.size() == k){
            answers.add(currentArr) ;
            return ;
        }

        for(int i = currentPosition ; i > 0 ; i--){
            sum += i ;
            currentArr.add(i) ;
            ArrayList<Integer> copyArr = new ArrayList<>(currentArr) ;
            dfs(sum , k , n , copyArr, i - 1) ;
            currentArr.remove(currentArr.size() - 1) ;
            sum -= i ;
        }
    }
}
