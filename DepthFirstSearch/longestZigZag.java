class Solution {
    int treeCount = 0 ;
    public int longestZigZag(TreeNode root) {
        if(root.left == null && root.right == null){
            return 0 ;
        }

        dfs(root.right , "right" , 1) ;
        dfs(root.left , "left" , 1) ;

        return treeCount ;
    }

    public void dfs(TreeNode node , String current , int count ){

        if(node == null){
            this.treeCount = Math.max(this.treeCount , count - 1) ;
            return ;
        }

        this.treeCount = Math.max(this.treeCount , count) ;

        if(current.equals("right")){
            dfs(node.left , "left" , count + 1) ; 
            dfs(node.right , "right" , 1) ;
        }else{
            dfs(node.right, "right" , count + 1 ) ; 
            dfs(node.left , "left" , 1) ;
        }

        return ;
    }
}
