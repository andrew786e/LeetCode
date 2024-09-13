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

import java.util.Vector;

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Vector<Integer> v1 = new Vector<>();
        Vector<Integer> v2 = new Vector<>() ;

        getLeaves(v1, root1) ;
        getLeaves(v2, root2) ;

        return v1.equals(v2);
    }

    public void getLeaves(Vector<Integer> leaves , TreeNode currentNode){
        if(currentNode == null){
            return ;
        }

        if(currentNode.left == null && currentNode.right == null ){
            leaves.addElement(currentNode.val) ;
            return ;
        }

        getLeaves(leaves ,currentNode.left) ;
        getLeaves(leaves ,currentNode.right) ;
    }
}
