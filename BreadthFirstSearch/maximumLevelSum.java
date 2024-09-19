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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        Map<Integer , Integer> maxVals = new HashMap<>();

        if(root.left == null && root.right == null){
            return 1 ;
        }

        int maxVal = root.val ;
        int level = 0 ;

        queue.add(root) ;
        
        while(queue.peek() != null){
            int queueSize = queue.size() ;
            int count = 0 ;
            for(int i = 0 ; i < queueSize ; i++){

                TreeNode node = queue.poll() ;
                count += node.val ;

                if(node.left != null){
                    queue.add(node.left) ;
                }

                if(node.right != null){
                    queue.add(node.right) ;
                }
            }

            level += 1 ;

            if(count >= maxVal){
                maxVal = count ;
                if(!maxVals.containsKey(maxVal)){
                    maxVals.put(maxVal , level) ;
                }
            }
        }

        return maxVals.get(maxVal) ;
    }
}
