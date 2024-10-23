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
    public TreeNode deleteNode(TreeNode root, int key) {
        return dfs(root , key) ;
    }

    public TreeNode dfs(TreeNode node , int key){

        if(node == null){
            return node;
        }

        if(node.val < key){
            node.right = dfs(node.right , key) ;
        }else if(node.val > key){
            node.left = dfs(node.left , key) ;
        }else{
            if(node.left == null){
                return node.right ;
            }else if(node.right == null){
                return node.left ;
            }

            TreeNode current = node.right ;

            while(current.left != null){
                current = current.left ;
            }

            node.val = current.val ;

            node.right = deleteNode(node.right , current.val) ;
        }

        return node ;
    }
}
