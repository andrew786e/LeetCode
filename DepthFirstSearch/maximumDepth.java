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

  // Using recursion
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0 ;
        }

        return 1 + Math.max(maxDepth(root.left) , maxDepth(root.right)) ;
    } 

  // Using BFS
  public int maxDepthBFS(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root) ;

        int depth = 0 ;

        while(queue.peek() != null){
            int iterator = queue.size();
            for(int i = 0 ; i < iterator ; i++){
                TreeNode currentNode = queue.remove() ;

                if(currentNode.left != null){
                    queue.add(currentNode.left) ;
                }

                if(currentNode.right != null){
                    queue.add(currentNode.right) ;
                }
            }
            depth++ ;
        }
        return depth ;
    } 
}
