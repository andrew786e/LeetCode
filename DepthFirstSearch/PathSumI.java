/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public boolean ans = false ;
    public int count = 0 ;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        dfs(root , targetSum) ;
        return ans ;
    }

    public void dfs(TreeNode root, int targetSum){
        if(root == null){
            return ;
        }

        count += root.val ;

        if(root.right == null && root.left == null && count == targetSum){
            ans = true ;
        }

        hasPathSum(root.left , targetSum);
        hasPathSum(root.right , targetSum);

        count -= root.val;
    }
}
