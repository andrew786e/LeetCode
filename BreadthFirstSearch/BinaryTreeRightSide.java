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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>() ;

        if(root == null){
            return ans ;
        }

        queue.add(root) ;

        while(queue.peek() != null){
            int queueSize = queue.size() ;
            for(int i = 0 ; i < queueSize ; i++){
                TreeNode node = queue.poll() ;

                if(node.left != null){
                    queue.add(node.left) ;
                }

                if(node.right != null){
                    queue.add(node.right) ;
                }

                if(i == (queueSize- 1)){
                    ans.add(node.val) ;
                }
            }

        }

        return ans ;
    }
}
