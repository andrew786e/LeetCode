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
    public int goodNodes(TreeNode root) {
        int maxValue = getMaxNodes(root , root.val) ;
        return maxValue ;
    }

    public int getMaxNodes(TreeNode node , int maxValue){
        if(node == null){
            return 0 ;
        }

        int good = node.val >= maxValue ? 1 : 0 ;

        good += getMaxNodes(node.left , Math.max(node.val , maxValue)) ;
        good += getMaxNodes(node.right, Math.max(node.val , maxValue)) ;

        return good ;
    }

}
