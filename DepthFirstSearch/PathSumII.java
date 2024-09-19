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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        if(root == null){
            return listOfLists ;
        }

        if(root.left == null && root.right == null && root.val == targetSum){
            list.add(root.val) ;
            listOfLists.add(list) ; 
            return listOfLists ;
        }


        dfsPath(root , targetSum) ;
        return listOfLists ;
    }

    public int count = 0 ;
    public List<Integer> list = new ArrayList<>();
    public List<List<Integer>> listOfLists = new ArrayList<>();

    public void dfsPath(TreeNode node ,int targetSum){
        if(node == null){
            return ;
        }

        count += node.val;
        list.add(node.val) ;

        if(count == targetSum && list.size() > 1 && node.left == null && node.right == null){
            List<Integer> copy = new ArrayList<>(list) ;
            listOfLists.add(copy) ;
        }

        dfsPath(node.left , targetSum) ;
        dfsPath(node.right , targetSum) ;

        list.remove(list.size() - 1) ;
        count -= node.val ;
    }
}
